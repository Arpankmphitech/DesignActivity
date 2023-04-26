package com.example.roomdatabase.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.roomdatabase.databinding.ActivityMainBinding
import com.example.roomdatabase.dataclass.Contact
import com.example.roomdatabase.dataclass.NoteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val noteDatabase by lazy { NoteDatabase.getDatabase(this).noteDao() }

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initView()
    }

    private fun initView() {

        CoroutineScope(Dispatchers.IO).launch {
            noteDatabase.addNote(Contact(0,"Arpan","895632598714"))
            Log.e("TAG", "getNotes............."+noteDatabase.getNotes())
        }

    }
}