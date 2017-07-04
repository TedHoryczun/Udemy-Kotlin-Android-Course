package weatherapp.kotlin.com.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showGreeting("hello there!")
        val answer = sum(1,5)
        println("answer: $answer")
    }

    fun sum(num1: Int, num2: Int): Int{
      return num1 + num2
    }
    fun showGreeting(text: String){
       println(text)
    }
}
