package br.com.conseng.splashscreenexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uptodown : Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.uptodown)
        parte_superior.animation = uptodown
        val downtoup : Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.downtoup)
        parte_inferior.animation = downtoup
    }
}
