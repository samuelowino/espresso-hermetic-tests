package org.aplus.espresso_hermetic_tests.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import org.aplus.espresso_hermetic_tests.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hideButton = findViewById<MaterialButton>(R.id.hide_message_button)
        val updateCharacterButton = findViewById<MaterialButton>(R.id.show_message_button)
        val characterTextView = findViewById<TextView>(R.id.hello_world_text_view);

        hideButton.setOnClickListener(View.OnClickListener {
            characterTextView.visibility = View.GONE;
        })

        updateCharacterButton.setOnClickListener(View.OnClickListener {
            characterTextView.visibility = View.VISIBLE
            characterTextView.text = "Morpheous"
        })
    }
}