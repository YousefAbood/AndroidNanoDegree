package com.example.android.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById((R.id.text_view_result));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.currentsapi.services/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Post>> call = jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<Post> posts = response.body();

                for(Post post : posts) {
                    String content = "";
                    content += "Author, " + post.getAuthor() + "\n";
                    content += "Category, " + post.getCategory() + "\n";
                    content += "Description, " + post.getDescription() + "\n";
                    content += "ID, " + post.getId() + "\n";
                    content += "Image, " + post.getImage() + "\n";
                    content += "Language, " + post.getLanguage() + "\n";
                    content += "Published, " + post.getPublished() + "\n";
                    content += "Title, " + post.getTitle() + "\n";
                    content += "URL, " + post.getUrl() + "\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}