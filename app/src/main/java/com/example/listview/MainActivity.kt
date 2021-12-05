package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val cities: ArrayList<String> = arrayListOf<String>("Singapur","Lahore","Karachi","Islamabad","WashingtonDc","Kolkata","NewYork","Tokyo","Singapur","Lahore","Karachi","Islamabad","WashingtonDc","Kolkata","NewYork","Tokyo")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,cities)
        list_item.adapter = adapter
        list_item.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Cliked "+cities[position], Toast.LENGTH_SHORT).show()
        }

    }
}