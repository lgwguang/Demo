package com.ligw.demo

import android.widget.EditText

/**
 * @author created by ligw on 2022/6/7
 * @Email ligw@wanbu.com.cn
 */
class LoginModel {


    fun login(name: String, password: String, loginCallBack: LoginCallBack) {

    }




    interface LoginCallBack{

        fun success()

        fun fail()
    }


}