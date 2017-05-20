package com.salah.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by salahamassi on 5/20/17.
 */

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues(value = getString(R.string.salah))
    }

    private fun setValues(value : String){
        textView.text = value
        imageView.setImageResource(R.drawable.salah)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,getText(R.string.onStart),Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,getText(R.string.onResume),Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,getText(R.string.onPause),Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,getText(R.string.onDestroy),Toast.LENGTH_LONG).show()
    }

}
