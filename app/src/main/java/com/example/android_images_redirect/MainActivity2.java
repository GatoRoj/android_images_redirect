package com.example.android_images_redirect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.android_images_redirect.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        if(intent != null){

            String mDrawableName = intent.getStringExtra("name");
            int spider = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());

            //binding.imageView7.setImageDrawable(binding.imageView6.getDrawable());
            binding.imageView.setImageResource(spider);
            Log.d("Prueba2",mDrawableName);

        }

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passFirst = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(passFirst);
            }
        });
    }
}