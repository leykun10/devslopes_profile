package com.example.devprofile

<<<<<<< HEAD
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

=======
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
>>>>>>> 1029811effcf31c782f78a9a029392add9459469

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val rounded= RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius = 15f
        imageViewLogo.setImageDrawable(rounded)




=======
>>>>>>> 1029811effcf31c782f78a9a029392add9459469
    }
}