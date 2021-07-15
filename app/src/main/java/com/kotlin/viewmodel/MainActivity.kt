package com.kotlin.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

//    private val voteViewModel by lazy { ViewModelProvider(this)[VoteViewModel::class.java] }
    private val voteViewModel:VoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = this.findViewById<TextView>(R.id.textView)
//        textView.text = voteViewModel.score.toString()
        voteViewModel.vote.observe(this, Observer {
            textView.text = it.toString()
        })
        var btnOne = this.findViewById<ImageButton>(R.id.btnOne)
        btnOne.setOnClickListener {
//            voteViewModel.score++
//            textView.text = voteViewModel.score.toString()
            voteViewModel.upVote()
        }
        var btnTwo = this.findViewById<ImageButton>(R.id.btnTwo)
        btnTwo.setOnClickListener {
//            voteViewModel.score++
//            textView.text = voteViewModel.score.toString()
            voteViewModel.downVote()
        }
    }
}