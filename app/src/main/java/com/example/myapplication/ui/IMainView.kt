package com.example.myapplication.ui

import com.example.myapplication.model.User
import com.example.myapplication.model.Wisdom

interface IMainView {
    fun getUserName(user: User)
    fun getwisdom(wisdom: Wisdom)

}