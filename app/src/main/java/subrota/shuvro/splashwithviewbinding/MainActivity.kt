package subrota.shuvro.splashwithviewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        startActivity(Intent(this, SplashActivity::class.java))
        finish()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}