package com.cod2.daterangepicker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cod2.daterangepicker.databinding.ActivityMainBinding
import com.google.android.material.datepicker.MaterialDatePicker
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            showDataRangePicker()
        }
    }


    private fun showDataRangePicker() {


        
    }


    private fun convertLongToTime(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat(
                "dd.MM.yyyy",
                Locale.getDefault())
        return format.format(date)
    }
}