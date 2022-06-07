package com.ligw.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ligw.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LoginModel.LoginCallBack {

    lateinit var inflate :ActivityMainBinding

    val loginModel by lazy { LoginModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inflate = ActivityMainBinding.inflate(layoutInflater)
        setContentView(inflate.root)

        initListener()
    }

    private fun initListener() {
        inflate.btnLogin.setOnClickListener {
            it.isClickable = false
            login()
        }
    }

    private fun login() {
        var name = inflate.name.toString()
        var password = inflate.password.toString()

        loginModel.login(name,password, this)
    }

    override fun success() {

    }

    override fun fail() {

    }
}