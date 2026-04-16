package com.example.profilmahasiswati

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        var jumlahKlikGlobal = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBio = findViewById<Button>(R.id.btnBio)
        val btnHobi = findViewById<Button>(R.id.btnHobi)

        val bioFragment = BioFragment()

        val bundle = Bundle()
        bundle.putString("NAMA", "Indra")
        bundle.putString("NIM", "2411102441237")
        bioFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, bioFragment)
            .commit()

        btnBio.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, bioFragment)
                .commit()
        }

        btnHobi.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, HobiFragment())
                .commit()
        }
    }
}