package csc475.hello.csc475_m7ct_unitconv_anishiyama

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerConversionType: Spinner = findViewById(R.id.spinnerConversionType)
        val editTextInput: EditText = findViewById(R.id.editTextInput)
        val buttonConvert: Button = findViewById(R.id.buttonConvert)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        buttonConvert.setOnClickListener {
            val input = editTextInput.text.toString()
            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = when (spinnerConversionType.selectedItem.toString()) {
                "Feet and Inches to Centimeters" -> {
                    val (feet, inches) = input.split(' ').map { it.toDouble() }
                    feetInchesToCm(feet, inches)
                }
                "Kilograms to Pounds" -> kgToLbs(input.toDouble())
                else -> "Invalid selection"
            }

            textViewResult.text = result.toString()
        }
    }

    private fun feetInchesToCm(feet: Double, inches: Double): Double {
        val totalInches = (feet * 12) + inches
        return totalInches * 2.54
    }

    private fun kgToLbs(kg: Double): Double {
        return kg * 2.20462
    }
}