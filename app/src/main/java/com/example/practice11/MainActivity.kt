package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view:View){
        val photo: ImageView = findViewById(R.id.photo)
        val image: Int = R.drawable.pear
        val description:String = "This is pear"
        photo.setImageResource(image)
        photo.setContentDescription(description)
    }

    var click=false;

    fun onClickImage (view: View){
        val imageBtn:ImageButton = findViewById(R.id.imageButton);
        if(click==false)
        {
            imageBtn.setImageResource(R.drawable.t);
            click=!click;
        }else
        {
            imageBtn.setImageResource(R.drawable.f);
            click=!click;
        }
    }


}