package com.jotace.codelabjotace.codelabjc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    companion object {
        const val mainActivityExtra = "MAIN_ACTIVITY_EXTRA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }


    private fun setupView() {
        val button = findViewById<Button>(R.id.button_go_to_next_screen)

        button.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)

            intent.putExtra(mainActivityExtra, getString(R.string.who_going_to_participate))
            startActivity(intent)
        }
    }
}
