package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun addButtonClickListener(button: Button, value: String){
            button.setOnClickListener {
                val deger = binding.editTextPanel.text.toString()

                binding.editTextPanel.setText("${deger}$value")
            }
        }

        addButtonClickListener(binding.button1, "1")
        addButtonClickListener(binding.button2, "2")
        addButtonClickListener(binding.button3, "3")
        addButtonClickListener(binding.button4, "4")
        addButtonClickListener(binding.button5, "5")
        addButtonClickListener(binding.button6, "6")
        addButtonClickListener(binding.button7, "7")
        addButtonClickListener(binding.button8, "8")
        addButtonClickListener(binding.button9, "9")
        addButtonClickListener(binding.button0, "0")
        addButtonClickListener(binding.buttonArti, "+")

        binding.buttonToplam.setOnClickListener {

            val deger = binding.editTextPanel.text.toString()
            val dizi = deger.split("+").toTypedArray()
            var toplam = 0
            for(i in dizi){
                if(i == ""){
                    toplam += 0
                }
                else{
                toplam += i.toInt()}
            }
            binding.editTextPanel.setText(toplam.toString())

        }

        binding.buttonCE.setOnClickListener {
            binding.editTextPanel.setText("")
        }



    }
}