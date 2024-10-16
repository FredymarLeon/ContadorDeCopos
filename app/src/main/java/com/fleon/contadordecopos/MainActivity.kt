package com.fleon.contadordecopos

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val totalCoposBebidos: TextView by lazy { findViewById(R.id.numeroDeCopos) }
    val buttonSomar: Button by lazy { findViewById(R.id.buttonAdicionarCopo) }
    val buttonSubtrair: Button by lazy { findViewById(R.id.buttonSubtrairCopo) }

    var coposBebidos: Int = 0

    var somarSelected: Boolean = false
    var subtrairSelected: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        SetupView()
    }

    private fun SetupView() {
        buttonSomar.setOnClickListener {
            coposBebidos++
            totalCoposBebidos.text = coposBebidos.toString()
        }

        buttonSubtrair.setOnClickListener{
            if(coposBebidos > 0) {
                coposBebidos--
            }
                totalCoposBebidos.text = coposBebidos.toString()
        }
    }
}


