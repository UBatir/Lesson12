package com.example.lesson12hometask2

import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation=AnimationUtils.loadAnimation(this,R.anim.combo_anim)
        ivSonic.startAnimation(animation)
        val animation1=AnimationUtils.loadAnimation(this,R.anim.combo_anim)
        iv.startAnimation(animation1)
        val animation2=AnimationUtils.loadAnimation(this,R.anim.trans_btn_anim)
        btnStart.startAnimation(animation2)
        val animation3=AnimationUtils.loadAnimation(this,R.anim.trans_btnquit_anim)
        btnStop.startAnimation(animation3)
        val animator = AnimatorInflater.loadAnimator(this,R.animator.trans_animator)
        animator.setTarget(ivSonic)
        btnStart.setOnClickListener {
            animator.start()
        }
        btnStop.setOnClickListener {
            animator.pause()
        }
    }
}
