package com.simplifycoders.app.fruitseller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private companion object {
        const val SPLASH_DELAY = 2500L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // purposely added delay to display brand
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, SPLASH_DELAY)
    }
}
