package com.example.jobsheet13n

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var nisEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var submitBtn: Button
    private val NAME_KEY: String = "Nama"
    private val NIS_KEY: String ="Nis"
    private val KELAS_KEY: String ="Kelas"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        namaEdit = findViewById(R.id.namaEdit)
        nisEdit = findViewById(R.id.nisEdit)
        kelasEdit = findViewById(R.id.KelasEdit)
        submitBtn = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent (  this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(NIS_KEY, nisEdit.text.toString())
            intent.putExtra(KELAS_KEY, kelasEdit.text.toString())
            startActivity(intent)
        }
    }
}