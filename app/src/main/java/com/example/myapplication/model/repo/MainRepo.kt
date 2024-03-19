package com.example.myapplication.model.repo

import com.example.myapplication.model.ApiServices
import com.example.myapplication.model.DataBase

class MainRepo {
    private  val api= ApiServices()
    private val dataBase= DataBase()
    fun getUserNme()=dataBase.getUserNme()
    fun getWisdom()=api.getWisdom()
}