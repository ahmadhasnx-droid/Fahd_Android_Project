package com.fahd.aistudio
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.fahd.aistudio.core.CommandEngine
class MainActivity:AppCompatActivity(){
 private val engine=CommandEngine()
 override fun onCreate(savedInstanceState:Bundle?){
  super.onCreate(savedInstanceState); setContentView(R.layout.activity_main)
  val input=findViewById<EditText>(R.id.commandInput)
  val button=findViewById<Button>(R.id.commandButton)
  val result=findViewById<TextView>(R.id.resultText)
  button.setOnClickListener{result.text=engine.process(input.text.toString())}
 }
}
