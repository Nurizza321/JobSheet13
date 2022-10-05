package com.example.jobsheet13n

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var namaView: TextView
    private lateinit var nisView: TextView
    private lateinit var kelasView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        namaView = findViewById(R.id.namaView)
        nisView = findViewById(R.id.nisView)
        kelasView = findViewById(R.id.kelasView)
        val extras = intent.extras
        namaView.text = extras?.getString(  "Nama")
        nisView.text = extras?.getString(  "Nis")
        kelasView.text = extras?.getString(  "Kelas")
    }
}