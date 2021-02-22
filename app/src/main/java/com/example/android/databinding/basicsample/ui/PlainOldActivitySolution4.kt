

package com.example.android.databinding.basicsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.SimpleViewModelSolution
import com.example.android.databinding.basicsample.databinding.PlainActivitySolution4Binding

/**
 * Fourth version of the Activity in the codelab.
 */
class PlainOldActivitySolution4 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution4Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_4)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
