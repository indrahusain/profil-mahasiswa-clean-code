package com.example.profilmahasiswati

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class HobiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hobi, container, false)
    }
}