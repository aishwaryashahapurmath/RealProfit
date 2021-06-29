package com.example.realprofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void userbtn(View view) {
        Toast.makeText(this, "User Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void productbtn(View view) {
        Toast.makeText(this, "Product Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void orderbtn(View view) {
        Toast.makeText(this, "Order Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void paymentbtn(View view) {
        Toast.makeText(this, "Payment Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void shipmentbtn(View view) {
        Toast.makeText(this, "Shipment Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }


}