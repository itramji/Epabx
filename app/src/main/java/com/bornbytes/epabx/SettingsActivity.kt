package com.bornbytes.epabx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        val list = ArrayList<HomeDataItem>()
        list.add(HomeDataItem("Changing Programming Mode Password",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Delayed DID Timeout programming",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("DID Ring Time Programming",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("DOSA Password Programming",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Flash Time Programming",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Flexible numbering Deletion ",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Incoming Call Storage Selection",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Ring Stop Time Programming",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Round Robin Time Programming",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Set extensions for Emergency Report",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Set Page Port",R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Storing Numbers in Global directory",R.drawable.ic_cloud_storage))

        setting_list.adapter = SettingsAdapter(list, ::onItemClick)
    }

    fun onItemClick(pos:Int){

    }
}
