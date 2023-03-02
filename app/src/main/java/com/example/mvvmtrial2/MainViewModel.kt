package com.example.mvvmtrial2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2023-03-02
 * @desc
 */
class MainViewModel() : ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun increase(){
        count.value = count.value?.plus(1)
    }

    fun decrease(){
        count.value = count.value?.minus(1)
    }
}