package com.example.simpleloginapp

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    // Declaration of views
    private lateinit var welcomeMsg: TextView
    private lateinit var showName: TextView
    private lateinit var showRollNo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initialization of views
        welcomeMsg = findViewById<EditText?>(R.id.p2WelcomeText)
        showName = findViewById<EditText?>(R.id.p2NameText)
        showRollNo = findViewById<EditText?>(R.id.p2RollNoText)

        // Get the Name and RollNo passed from Page 1
        val name = intent.getStringExtra("NAME_KEY")
        val rollNo = intent.getStringExtra("ROLLNO_KEY")

        // Check if data is received and display it
        if (name != null && rollNo != null) {
            showName.setText("Name: $name")
            showRollNo.setText("Roll No: $rollNo")
        } else {
            // Handle the case when data is not received properly
            showName.setText("No data")
            showRollNo.setText("No data")
        }
    }
}