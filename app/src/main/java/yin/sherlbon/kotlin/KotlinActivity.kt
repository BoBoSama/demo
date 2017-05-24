package yin.sherlbon.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    val a =1;
    val b =2;
    val c = listOf<Int>(1,2,3,4,5,6,9);
    val d = setOf<Int>(1,2,3,4,5,6,7,8,1,1,1);
    val e = mapOf<Int, String>(1 to "a", 2 to "b");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        val student = Student(1,"john",12);
        student.age;
        tex.text = "${e}";
        demo(2);
        forDemo()

    }

    fun demo(number: Int) {
        when (number) {
            1 -> Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
            2 -> Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
        }
    }

    fun forDemo(){
         for(i in 1..10){
             loop@  for(j in 1..20){
                   for(k in 1..30){
                        tex.text = "$i + $j + $k"
                        if(k>10) break@loop
                    }
                }
              }
    }
}
