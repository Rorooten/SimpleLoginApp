package com.example.simpleloginapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    // declaration
    private lateinit var getName: EditText
    private lateinit var getRollNo: EditText
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialization of views
        getName = findViewById(R.id.nameText)
        getRollNo = findViewById(R.id.rollNoText)
        loginBtn = findViewById(R.id.loginBtn)

        // Setting click listener on login button
        loginBtn.setOnClickListener() { view: View ->
            var name = getName.text.toString()
            var rollNo = getRollNo.text.toString()

            // Simple input validation
            if (name.isNotEmpty() && rollNo.isNotEmpty()) {
                startPage2Activity(name,rollNo)
            } else {
                // Show error message
                Snackbar.make(view, "Please Enter Name and RollNo", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    // Page 2 Link and pass data
    private fun startPage2Activity(name:String,rollNo:String) {
        var intent  = Intent(this, MainActivity2::class.java)

        // Pass data using unique keys for extras
        intent.putExtra("NAME_KEY", name)
        intent.putExtra("ROLLNO_KEY", rollNo)
        startActivity(intent)
    }
}