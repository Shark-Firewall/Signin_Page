package com.shark.assign2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var btnSn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user_name = findViewById<EditText>(R.id.username)
        btnSn=findViewById(
            R.id.btnSn
        )
        btnSn.setOnClickListener {
            val snack = Snackbar.make(it,"Done Successfully",Snackbar.LENGTH_LONG)
            snack.show()
        }
    }
}