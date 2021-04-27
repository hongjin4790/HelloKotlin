package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.HeightField)
        val weightField = findViewById<EditText>(R.id.WeightField)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener {
            val height = heightField.getText().toString().toDouble();
            val weight = weightField.getText().toString().toDouble();

            val bmi = weight/ Math.pow(height / 100.0, 2.0)

            txtResult.setText("Your BMI = " + bmi)

        }
    }
}