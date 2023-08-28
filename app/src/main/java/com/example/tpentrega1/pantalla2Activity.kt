package com.example.tpentrega1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tpentrega1.adapter.CharactersAdapter

class pantalla2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla2)
    initRecyclerView()}

    private fun initRecyclerView(){
        val recyclerView= findViewById<RecyclerView>(R.id.characters)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter = CharactersAdapter(CharactersProvider.listCharacters)
    }

}