package com.saitejajanjirala.pspanddatingsaitejastask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var levelstext:TextView
    lateinit var tabLayout:TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout=findViewById(R.id.tablayout)
        tabLayout!!.addTab(tabLayout!!.newTab().setText(resources.getText(R.string.network_earning)))
        tabLayout!!.addTab(tabLayout!!.newTab().setText(resources.getText(R.string.orders_earning)))
        tabLayout!!.addTab(tabLayout!!.newTab().setText(resources.getText(R.string.network_product)))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL

    }
}
