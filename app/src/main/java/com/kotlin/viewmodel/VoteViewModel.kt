package com.kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VoteViewModel : ViewModel() {

    val vote:MutableLiveData<Int> by lazy { MutableLiveData<Int>(0) }

    fun upVote(): Unit {
        vote.value = vote.value?.plus(1)
    }

    fun downVote(): Unit {
        vote.value = vote.value?.minus(1)
    }
}