package com.example.android.java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    int quantity, price;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void increment(View view){
        quantity++;
        price += 10;
        display(quantity, price);
    }

    public void decrement(View view){
        if(!(quantity <= 0)) {
            quantity--;
            price -= 10;
            display(quantity, price);
        }
    }

    public void submitOrder(View view) {
        TextView readyOrder = (TextView) findViewById(R.id.readyorder);
        readyOrder.setText("Your order of " + quantity + " shirt(s) is " + price + "$");
        readyOrder.setTextColor(Color.YELLOW);
        readyOrder.setVisibility(TextView.VISIBLE);
    }

    private void display(int quantity, int price) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText("" + quantity);
        priceTextView.setText(""  + price + "$");
    }

}