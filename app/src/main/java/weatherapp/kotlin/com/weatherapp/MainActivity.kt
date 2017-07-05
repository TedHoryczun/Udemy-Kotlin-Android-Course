package weatherapp.kotlin.com.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val DEGREE: String = "°"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val main = Main()
        main.temp = 90
        main.maxTemp = 100
        main.minTemp = 20
        val weather = Weather()
        weather.main = main

        presentData(main)

    }

    private fun  presentData(main: Main) {
        currentTemp.text = "${main.temp}$DEGREE"
        lowTemp.text = "${main.minTemp}$DEGREE"
        highTemp.text = "${main.maxTemp}$DEGREE"

    }
}
