package com.jotace.codelabjotace.codelabjc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    companion object {
        val NAME_EXTRA = "NAME_EXTRA"
        val AGE_EXTRA = "AGE_EXTRA"
    }

    lateinit var adapterlist: ListNameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val title = intent.getStringExtra(MainActivity.mainActivityExtra)
        label_title.text = title

        createList()
    }

    private fun createList() {
        val names = mutableListOf<Pair<String, String>>()
        names.add(Pair("Jobson", "23"))
        names.add(Pair("Norberton1 JEffs", "402"))
        names.add(Pair("Norberton2 JEffs", "402"))
        names.add(Pair("Norberton3 JEffs", "402"))
        names.add(Pair("Norberton4 JEffs", "402"))
        names.add(Pair("Norberton5 JEffs", "402"))
        names.add(Pair("Norberton6 JEffs", "402"))
        names.add(Pair("Norberton7 JEffs", "402"))
        names.add(Pair("Norberton8 JEffs", "402"))
        names.add(Pair("Norberton9 JEffs", "402"))
        names.add(Pair("Norberton10 JEffs", "402"))
        names.add(Pair("Norberton11 JEffs", "402"))
        names.add(Pair("Norberton12 JEffs", "402"))
        names.add(Pair("Norberton13  asdf a sdf a sdf asdf asd JEffs", "402"))

        adapterlist = ListNameAdapter {
//            val intent = Intent(this@ListActivity,)
//            intent.putExtra(NAME_EXTRA, it.first)
//            intent.putExtra(AGE_EXTRA, it.second)
            Toast.makeText(this@ListActivity, "nome: ${it.first} - idade: ${it.second}", Toast.LENGTH_LONG)
                    .show()
        }

        with(recycler_view_names) {
            layoutManager = LinearLayoutManager(this@ListActivity)
            adapter = adapterlist
        }

        adapterlist.namesList = names
        adapterlist.notifyDataSetChanged()
    }

}
