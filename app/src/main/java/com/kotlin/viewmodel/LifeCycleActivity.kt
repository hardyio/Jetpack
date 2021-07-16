package com.kotlin.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.viewmodel.databinding.ActivityLifecycleBinding

class LifeCycleActivity : AppCompatActivity() {

    //    private var elapsedTime = 0L
    lateinit var activityLifecycleBinding: ActivityLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLifecycleBinding = ActivityLifecycleBinding.inflate(layoutInflater)
        setContentView(activityLifecycleBinding.root)
        lifecycle.addObserver(activityLifecycleBinding.chronometer)
    }

//    override fun onResume() {
//        super.onResume()
//        activityLifecycleBinding.chronometer.base = SystemClock.elapsedRealtime() - elapsedTime
//        activityLifecycleBinding.chronometer.start()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        elapsedTime = SystemClock.elapsedRealtime() - activityLifecycleBinding.chronometer.base
//        activityLifecycleBinding.chronometer.stop()
//    }
}