package com.example.musictribetask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_main.*




class MainFragment : Fragment(), RotaryKnobView.RotaryKnobListener,
    CustomRotaryKnobView.CustomRotaryKnobListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        knob.listener = this
        textView.text = knob.value.toString() + " ms"
        textView2.text = knob2.value.toString() + " ms"
        knob2.customListener = this
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment().apply {}
    }

    override fun onRotate(value: Int) {
        textView.text = value.toString()
        Toast(requireActivity()).showCustomToast (value.toString(), requireActivity())
    }

    override fun onRotation(value: String) {
        textView2.text = value
        Toast(requireActivity()).showCustomToast (value, requireActivity())

    }

}