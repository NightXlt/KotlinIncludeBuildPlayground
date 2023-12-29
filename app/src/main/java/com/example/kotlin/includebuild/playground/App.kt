package com.example.kotlin.includebuild.playground

import android.app.Application
import com.example.kotlin.includebuild.sharedlogic.Logic

/**
 * @Author: 小灵通
 * @Date: 2023.12.18
 * @Email: nightfeng26@gmail.com
 **/
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Logic()
    }
}