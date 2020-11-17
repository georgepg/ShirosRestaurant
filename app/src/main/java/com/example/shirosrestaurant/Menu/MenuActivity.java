package com.example.shirosrestaurant.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shirosrestaurant.Carta.MenuCartaActivity;
import com.example.shirosrestaurant.R;

public class MenuActivity extends AppCompatActivity {

    CardView cvCarta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        cvCarta = findViewById(R.id.cvCarta);
        cvCarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuCartaActivity.class);
                startActivity(intent);
            }
        });
    }
}