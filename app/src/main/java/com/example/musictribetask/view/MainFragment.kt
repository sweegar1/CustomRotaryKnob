package com.example.musictribetask.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.articals.ui.adapters.viewmodel.MainViewModelFactory
import com.example.musictribetask.R
import com.example.musictribetask.customView.showCustomToast
import com.example.musictribetask.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {


    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProvider(
            this,
            MainViewModelFactory()
        ).get(MainViewModel::class.java)

        viewModel.knobValue.observe(getViewLifecycleOwner(), Observer {
            it?.let {
                Toast(requireActivity()).showCustomToast(it, requireActivity())
                textView.text = it + " ms"

            }
        })
        viewModel.knobValue2.observe(getViewLifecycleOwner(), Observer {
            it?.let {
                Toast(requireActivity()).showCustomToast(it, requireActivity())
                textView2.text = it + " ms"
            }
        })

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment().apply {}
    }

}