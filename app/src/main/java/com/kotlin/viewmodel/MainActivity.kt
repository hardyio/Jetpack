package com.kotlin.viewmodel

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //    private val voteViewModel by lazy { ViewModelProvider(this)[VoteViewModel::class.java] }
    private val voteViewModel: VoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        var textView = this.findViewById<TextView>(R.id.textView)
//        textView.text = voteViewModel.score.toString()
//        voteViewModel.vote.observe(this, Observer {
//            textView.text = it.toString()
//        })
//        var btnOne = this.findViewById<ImageButton>(R.id.btnOne)
//        btnOne.setOnClickListener {
////            voteViewModel.score++
////            textView.text = voteViewModel.score.toString()
//            voteViewModel.upVote()
//        }
//        var btnTwo = this.findViewById<ImageButton>(R.id.btnTwo)
//        btnTwo.setOnClickListener {
////            voteViewModel.score++
////            textView.text = voteViewModel.score.toString()
//            voteViewModel.downVote()
//        }

        //databinding
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.voteViewMoel = voteViewModel
        activityMainBinding.lifecycleOwner = this
        activityMainBinding.btnLifeCycle.setOnClickListener {
            startActivity(Intent(this, LifeCycleActivity::class.java))
        }
    }

}