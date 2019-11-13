package com.example.carloancalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Activity
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calc_btn.setOnClickListener(){

            val input:String=carPrice_in.text.toString()
            val value:Double=input.toDouble()


            val input1:String=downpayment_in.text.toString()
            val value1:Double=input1.toDouble()

            val input2:String=interestrate_in.text.toString()
            val value2:Double=input2.toDouble()

            val input3:String=pp_in.text.toString()
            val value3:Double=input3.toDouble()

           textView3.visibility=View.VISIBLE
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(calc_btn, 0)

            val clresult:Double = value-value1
            val intresult:Double = clresult*value2*value3
            val mthresult:Double =(clresult+intresult)/value3/12

            carloan_txt.text= "Car Loan           : "+"%.2f".format(clresult)
            interest_txt.text="Interest           : "+"%.2f".format(intresult)
            mthrepay_txt.text="Monthly Repayment : "+"%.2f".format(mthresult)


        }


    }

}
