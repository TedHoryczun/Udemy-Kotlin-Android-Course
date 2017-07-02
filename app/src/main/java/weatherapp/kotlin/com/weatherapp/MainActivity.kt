package weatherapp.kotlin.com.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Ted"
        currentTemp.text = "Hi there"
        val currentTempTxt: String = currentTemp.text.toString()
    }
}
