package com.example.optconmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnMenuO: Menu
    lateinit var btnMenuC: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMenuC=findViewById(R.id.btnmenu)

        registerForContextMenu(btnMenuC)
    }
    override fun onStart() {
        super.onStart()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_Contact -> {
                Toast.makeText(this,"This is Contact menu", Toast.LENGTH_LONG).show()
            }
            R.id.menu_order -> {
                Toast.makeText(this,"This is Order menu",Toast.LENGTH_LONG).show()
            }
            R.id.menu_setting -> {
                Toast.makeText(this,"This is Setting menu",Toast.LENGTH_LONG).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.context_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.edit->{
                Toast.makeText(this,"Edit Menu",Toast.LENGTH_LONG).show()
            }
            R.id.share->{
                Toast.makeText(this,"Share Menu",Toast.LENGTH_LONG).show()
            }
            R.id.delete->{
                Toast.makeText(this,"Delete Menu",Toast.LENGTH_LONG).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}