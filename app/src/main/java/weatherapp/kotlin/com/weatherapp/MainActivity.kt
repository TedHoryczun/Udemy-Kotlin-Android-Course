package weatherapp.kotlin.com.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Ted"
        val age = "21"

        val greeting = "Hi, my name is $name, and I'm $age old"



        currentTemp.text = greeting
    }
}
