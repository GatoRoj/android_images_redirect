package com.example.android_images_redirect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.android_images_redirect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent passSecond = getIntent();

        binding.imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Prueba","clickeado");
                passSecond("gojo");
            }
        });
        binding.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Prueba","clickeado");
                passSecond("amazingspiderman");
            }
        });
        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Prueba","clickeado");
                passSecond("groot");
            }
        });
        binding.imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Prueba","clickeado");
                passSecond("redcat");
            }
        });


    }
    private void passSecond(String name){
        Intent passSecond = new Intent(MainActivity.this,MainActivity2.class);
        passSecond.putExtra("name",name);
        startActivity(passSecond);
    }
}