package com.bornbytes.epabx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView.addItemDecoration(MarginDecoration(this))

        val list = ArrayList<HomeDataItem>()
        list.add(HomeDataItem("System", R.drawable.ic_optimization))
        list.add(HomeDataItem("KTS", R.drawable.ic_files_and_folders))
        list.add(HomeDataItem("Trunk Line", R.drawable.ic_sata))
        list.add(HomeDataItem("Extension", R.drawable.ic_format))
        list.add(HomeDataItem("Timer", R.drawable.ic_time))
        list.add(HomeDataItem("Caller-ID", R.drawable.ic_call_black_24dp))
        list.add(HomeDataItem("Backup", R.drawable.ic_cloud_storage))
        list.add(HomeDataItem("Port Details", R.drawable.ic_files_and_folders))

        recyclerView.adapter = HomeAdapter(list, ::onItemClick)

    }

    fun onItemClick(pos: Int) {
        startActivity(Intent(this, SettingsActivity::class.java))
    }
}
