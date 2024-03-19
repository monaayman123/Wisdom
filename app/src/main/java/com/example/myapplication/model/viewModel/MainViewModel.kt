package com.example.myapplication.model.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.User
import com.example.myapplication.model.Wisdom
import com.example.myapplication.model.repo.MainRepo

class MainViewModel:ViewModel() {
    val mainnRepo= MainRepo()
   private val _currentUserName=MutableLiveData<User>()
    val currentUserName:LiveData<User>
        get() = _currentUserName
  private  val _wisdom=MutableLiveData<Wisdom>()
   val wisdom:LiveData<Wisdom>
    get() = _wisdom

   init {
       getUserName()
   }
    fun getUserName(){
        val res=mainnRepo.getUserNme()
        _currentUserName.postValue(res)
    }
    fun getwis(){
        val res=mainnRepo.getWisdom()
       _wisdom.postValue(res)
    }

}