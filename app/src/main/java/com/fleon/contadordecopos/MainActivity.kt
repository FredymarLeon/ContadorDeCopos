package com.fleon.contadordecopos

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val titulo: TextView by lazy { findViewById(R.id.titulo)}
    val bebeu: TextView by lazy { findViewById(R.id.jaBebeu) }
    val copos: TextView by lazy { findViewById(R.id.copos) }
    val radioGroup: RadioGroup by lazy { findViewById(R.id.radioGroup) }
    val buttonSomar: RadioButton by lazy { findViewById(R.id.somarRadioB) }
    val buttonSubtrair: RadioButton by lazy { findViewById(R.id.subtrairRadioB) }


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

    private fun SetupView(){
        radioGroup.setOnCheckedChangeListener {_, checkedId ->
            if (checkedId == R.id.somarRadioB){
                somarSelected = true
                subtrairSelected = false
            } else {
                somarSelected = false
                subtrairSelected = true
            }
        }

        buttonSomar.setOnClickListener {
            var contador = 0
            while(contador >= 0) contador++
        }

        buttonSubtrair.setOnClickListener{
            var contador = 0
            while (contador > 0) contador--

        }
    }
}


