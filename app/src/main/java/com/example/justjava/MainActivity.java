package com.example.justjava;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity
{
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view)
    {
        quantity = quantity + 1;
        display(quantity);

    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view)
    {
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view)
    {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));
    }

    public int calculatePrice()
    {
        return (quantity * 5);
    }

    /*
    * **/
    public String createOrderSummary(int price)
    {
        String priceMessage = "Name: Vineet Singh";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: ₹" + price;
        priceMessage += "\nThank you";
        return priceMessage;
    }

    public void click(View view)
    {
        displayInt("vineet");
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number)
    {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void displayInt(String msg)
    {
        TextView tv = findViewById(R.id.change_text_view);
        tv.setText(msg);
        tv.setAllCaps(true);
        tv.setTextColor(Color.RED);
    }
}