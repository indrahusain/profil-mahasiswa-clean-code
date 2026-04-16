package com.example.profilmahasiswati

import android.os.Bundle
import android.view.*
import android.view.animation.ScaleAnimation
import android.widget.*
import androidx.fragment.app.Fragment

class BioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_bio, container, false)

        val tvBio = view.findViewById<TextView>(R.id.tvBio)
        val tvKlik = view.findViewById<TextView>(R.id.tvKlik)
        val btnKlik = view.findViewById<Button>(R.id.btnKlik)

        val nama = arguments?.getString("NAMA") ?: "Tidak ada"
        val nim = arguments?.getString("NIM") ?: "Tidak ada"

        tvBio.text = """
            👤 Nama: $nama
            🎓 NIM: $nim
            💻 Jurusan: Teknik Informatika
            🏫 Kampus: Universitas Muhammadiyah Kalimantan Timur
        """.trimIndent()

        tvKlik.text = "Klik: ${MainActivity.jumlahKlikGlobal}"

        btnKlik.setOnClickListener {

            val anim = ScaleAnimation(
                1f, 0.9f, 1f, 0.9f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f
            )
            anim.duration = 100
            anim.repeatMode = ScaleAnimation.REVERSE
            anim.repeatCount = 1
            btnKlik.startAnimation(anim)

            MainActivity.jumlahKlikGlobal++
            tvKlik.text = "Tombol diklik ${MainActivity.jumlahKlikGlobal} kali"

            Toast.makeText(requireContext(), "🔥 Klik berhasil!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}