package com.example.promisefirst

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.material.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.promisefirst.ui.theme.PromiseFirstTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PromiseFirstTheme {
                project(resources = resources)
                //body2()
            }

        }


    }
}

// The Project
@Composable
fun project(resources: Resources){
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Happy Meal",
                    style = TextStyle(fontSize = TextUnit.Sp(26)))

                Text(text = "$5.99",
                    style = TextStyle(fontSize = TextUnit.Companion.Sp(17),
                        color = Color(0XFF85bb65)),
                modifier = Modifier.align(Alignment.CenterVertically))
            }

            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "800 Calories",
                style = TextStyle(fontSize = TextUnit.Companion.Sp(17), ))
            Spacer(modifier = Modifier.padding(10.dp))

            Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text(text = "Order Now",
                style = TextStyle(color = Color.White))
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

//row
@Composable
fun body2() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
    horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "ITEM 1",
        Modifier.align(Alignment.CenterVertically))
    }
}


@Preview(name = "my preview")
@Composable
fun DefaultPreview(){
    PromiseFirstTheme{
       project(resources = Resources.getSystem())

    }
   // body(resources = Resources.getSystem())

}











