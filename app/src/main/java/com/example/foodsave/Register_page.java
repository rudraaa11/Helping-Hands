package com.example.foodsave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register_page extends AppCompatActivity {
    TextView channelName;

    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        channelName = findViewById(R.id.textView7);
        channelName.setText("Welcome to FoodSave! ");

        TextPaint paint = channelName.getPaint();
        float width = paint.measureText("Welcome to FoodSave! ");

        Shader textshader = new LinearGradient(0,0,width,channelName.getTextSize(),


                new int[]{
                        Color.parseColor("#97ED01"),
                        Color.parseColor("#FFFFFE"),

                }, null,Shader.TileMode.CLAMP);

        channelName.getPaint().setShader(textshader);


        move=findViewById(R.id.logi);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Register_page.this, Login_Page_New.class);
                startActivity(intent);
            }
        });




    }
}