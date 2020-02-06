package com.jsync.sapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        const val STARTED_WITH_SEC_CODE = "is_secret_code"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent.hasExtra(STARTED_WITH_SEC_CODE))
            txtDisplay.text = getString(R.string.opened_with_secret_code)
        else
            txtDisplay.text = getString(R.string.dial_to_launch)
    }
}
