package com.example.mylibrarytosty

import android.content.Context
import android.widget.Toast

object TostTime {

    fun showTost(context: Context, msg:String){
        Toast.makeText(context,msg, Toast.LENGTH_LONG).show()
    }
}