package com.example.frenchapp

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sayTheColor(view: View) {
        val clickedButton: Button = view as Button
        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, resources.getIdentifier(
            clickedButton.tag.toString(), "raw", packageName
        ))
        mediaPlayer.start()
    }
}