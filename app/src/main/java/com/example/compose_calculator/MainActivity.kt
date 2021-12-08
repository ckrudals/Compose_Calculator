package com.example.compose_calculator

import android.graphics.Color.BLACK
import android.graphics.Color.GRAY
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.getSelectedText
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_calculator.ui.theme.Compose_CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    addItem()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview(showBackground = true)
@Composable
fun addItem() {
    var data = remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(), verticalArrangement = Arrangement.Center

    ) {

        Text(text = data.value, Modifier.padding(16.dp), fontSize = 16.sp)
        Row(Modifier.padding(3.dp)) {

            Button(
                // click event
                onClick = { data.value = "+" },
                // padding
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                //background color
                colors = ButtonDefaults.buttonColors(Color.White),
                // border color, with
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "+")
            }
            Button(
                onClick = { data.value = "-" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "-")
            }
            Button(
                onClick = { data.value + data.value
                    Log.d("TAG", "addItem: ${data.value} ${data.value+data.value} ")},
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "=", color = Color(BLACK))
            }
        }

        // row
        Row(Modifier.padding(3.dp)) {

            Button(
                // click event
                onClick = { data.value = "1" },
                // padding
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                //background color
                colors = ButtonDefaults.buttonColors(Color.White),
                // border color, with
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "1")
            }
            Button(
                onClick = { data.value = "2" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "2")
            }
            Button(
                onClick = { data.value = "3" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "3", color = Color(BLACK))
            }
        }


        Row(Modifier.padding(3.dp)) {

            Button(
                // click event
                onClick = { data.value = "4" },
                // padding
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                //background color
                colors = ButtonDefaults.buttonColors(Color.White),
                // border color, with
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "4")
            }
            Button(
                onClick = { data.value = "5" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "5")
            }
            Button(
                onClick = { data.value = "6" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "6", color = Color(BLACK))
            }
        }
        Row(Modifier.padding(3.dp)) {

            Button(
                // click event
                onClick = { data.value = "7" },
                // padding
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                //background color
                colors = ButtonDefaults.buttonColors(Color.White),
                // border color, with
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "7")
            }
            Button(
                onClick = { data.value = "8" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "8")
            }
            Button(
                onClick = { data.value = "9" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "9", color = Color(BLACK))
            }
        }
        Row(Modifier.padding(3.dp)) {

            Button(
                // click event
                onClick = { data.value = "*" },
                // padding
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                //background color
                colors = ButtonDefaults.buttonColors(Color.White),
                // border color, with
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "*")
            }
            Button(
                onClick = { data.value = "0" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "0")
            }
            Button(
                onClick = { data.value = "/" },
                Modifier
                    .padding(3.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(Color.White),
                border = BorderStroke(1.dp, Color(GRAY))
            ) {
                Text(text = "/", color = Color(BLACK))
            }
        }
    }


}

