package com.river.supportconnection

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.river.supportconnection.Fragments.SearchFragment
import kotlinx.android.synthetic.main.activity_input_info7_2.*

class InputInfo7_2Activity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_info7_2)

        val province = intent.getStringExtra("province")
        val district = intent.getStringExtra("district")
        val incomeGroup = intent.getIntExtra("incomeGroup",0)
        val income = intent.getIntExtra("income",0)
        var isMarried = intent.getIntExtra("isMarried",0)
        var haveChild = intent.getIntExtra("haveChild",0)
        var childAge = intent.getIntExtra("childAge",0)
        var isPregnant = intent.getIntExtra("isPregnant",0)
        var occupation = intent.getIntExtra("occupation",2)

        // back intent 처리
        beforebtn12.setOnClickListener {
            finish()
        }

        info7_2_button1.setOnClickListener {
            val intent = Intent(this, RealMainActivity::class.java)
            /*
            @POST

            ("isTemporary", 0)
            ("isUnemployed", 1)
            ("businessType", "")
            ("businessScale", 0)
            ("annualSale", 0)
             */
            startActivity(intent)
        }

        info7_2_button2.setOnClickListener {
            val intent = Intent(this, RealMainActivity::class.java)
            /*
            @POST

            ("isTemporary", 0)
            ("isUnemployed", 1)
            ("businessType", "")
            ("businessScale", 0)
            ("annualSale", 0)
             */
            startActivity(intent)
        }


    }
}