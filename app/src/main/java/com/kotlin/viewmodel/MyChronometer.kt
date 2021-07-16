package com.kotlin.viewmodel

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyChronometer @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    Chronometer(context, attrs, defStyleAttr), LifecycleObserver {

    var elapsedTime: Long = 0L

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume(): Unit {
        base = SystemClock.elapsedRealtime() - elapsedTime
        start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause(): Unit {
        elapsedTime = SystemClock.elapsedRealtime() - base
        stop()
    }
}