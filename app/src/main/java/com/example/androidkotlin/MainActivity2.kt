package com.example.androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(), AdapterView.OnItemClickListener {
    var mangTest : List<String> = listOf("Go" , "Back")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        lvTest.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mangTest)
        lvTest.setOnItemClickListener(this)
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var name : String = mangTest.get(p2)
        when(name){
            "Go" -> intent = Intent(this, MainActivity3::class.java)

            "Back" -> intent = Intent(this, MainActivity::class.java)
        }
        intent.putExtra("name", name)
        startActivity(intent)
    }
}