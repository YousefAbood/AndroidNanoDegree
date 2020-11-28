package com.example.android.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    
    int number, price;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public void submitOrder(View view) {
        number++;
        price += 10;
        display(number, price);
    }

    private void display(int quantity, int price) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText("" + quantity);
        priceTextView.setText(""  + price + "$");
    }
}