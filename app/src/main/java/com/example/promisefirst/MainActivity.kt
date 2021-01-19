package com.example.promisefirst

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.promisefirst.ui.theme.PromiseFirstTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PromiseFirstTheme {
                body(resources = resources)
            }

        }


    }
}


//Column
@Composable
fun body(resources: Resources){
    ScrollableColumn(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0XFFF2F2F2))) {
        Image(bitmap = imageFromResource(res = resources, resId = R.drawable.happy_meal),
                modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                contentScale = ContentScale.Fit)
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Happy Meal",
                    style = TextStyle(fontSize = TextUnit.Companion.Sp(26)))
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "800 Calories",
                    style = TextStyle(fontSize = TextUnit.Companion.Sp(17), ))
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "$5.99",
                    style = TextStyle(fontSize = TextUnit.Companion.Sp(17),
                            color = Color(0XFF85bb65)))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    body(resources = Resources.getSystem())
}











