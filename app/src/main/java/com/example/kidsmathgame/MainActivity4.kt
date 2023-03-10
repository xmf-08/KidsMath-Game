package com.example.kidsmathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class MainActivity4 : AppCompatActivity() {
    var javob = 0

    var random1 = 0
    var random2 = 0
    var random3 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


//        val media = MediaPlayer.create(this, R.raw.middle)
//        media.start()

        random()

        //To'g'ri Noto'g'ri
        btn.setOnClickListener {
            if (radio_group1.isChecked){
                if (radio_group1.text.toString().toInt() == javob) Toast.makeText(this, "To'gri", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "Noto'g'ri", Toast.LENGTH_SHORT).show()
            }
            if (radio_group2.isChecked){
                if (radio_group2.text.toString().toInt() == javob) Toast.makeText(this, "To'gri", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "Noto'g'ri", Toast.LENGTH_SHORT).show()
            }
            if (radio_group3.isChecked){
                if (radio_group3.text.toString().toInt() == javob) Toast.makeText(this, "To'gri", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "Noto'g'ri", Toast.LENGTH_SHORT).show()
            }
            if (radio_group4.isChecked){
                if (radio_group4.text.toString().toInt() == javob) Toast.makeText(this, "To'gri", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "Noto'g'ri", Toast.LENGTH_SHORT).show()
            }
            radio_group.clearCheck()
            random()
        }
    }
    //.......//

    private fun random(){
        var number1 = Random().nextInt(20)
        var number2 = Random().nextInt(20)

        var amal = Random().nextInt(4)

        when(amal){
            0->{
                txt_misol.text = "$number1 * $number2 = "
                javob=number1*number2
            }
        }
        ekrangaYoz()
    }
    private fun ekrangaYoz(){
        var tj = Random().nextInt(4)

        when(tj){
            0->{
                radio_group1.text = javob.toString()
                radio_group2.text = random1.toString()
                radio_group3.text = random2.toString()
                radio_group4.text = random3.toString()
            }1->{
            radio_group2.text = javob.toString()
            radio_group1.text = random1.toString()
            radio_group3.text = random2.toString()
            radio_group4.text = random3.toString()
        }2->{
            radio_group3.text = javob.toString()
            radio_group2.text = random1.toString()
            radio_group1.text = random2.toString()
            radio_group4.text = random3.toString()
        }3->{
            radio_group4.text = javob.toString()
            radio_group2.text = random1.toString()
            radio_group3.text = random2.toString()
            radio_group1.text = random3.toString()
            randomSonAniqla()
        }
        }
    }
    private fun randomSonAniqla(){
        random1 = Random().nextInt(50)
        random2 = Random().nextInt(50)
        random3 = Random().nextInt(50)

        if(random1 == random2 || random2 == random3 || random1 == random3){
            randomSonAniqla()
        }
    }
}