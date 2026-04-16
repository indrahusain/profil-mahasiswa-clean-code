package com.example.profilmahasiswati

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
        loadDefaultFragment()
    }

    private fun setupUI() {
        val btnBio = findViewById<Button>(R.id.btnBio)
        val btnHobi = findViewById<Button>(R.id.btnHobi)

        btnBio.setOnClickListener {
            replaceFragment(createBioFragment())
        }

        btnHobi.setOnClickListener {
            replaceFragment(HobiFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    private fun createBioFragment(): BioFragment {
        val fragment = BioFragment()
        val bundle = Bundle().apply {
            putString("NAMA", "Indra")
            putString("NIM", "2411102441237")
        }
        fragment.arguments = bundle
        return fragment
    }

    private fun loadDefaultFragment() {
        replaceFragment(createBioFragment())
    }
}