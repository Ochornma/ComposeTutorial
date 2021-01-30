package com.example.promisefirst

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.fragment.app.Fragment
import com.example.promisefirst.ui.theme.PromiseFirstTheme

class ReciepeListFragment :Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                PromiseFirstTheme {
                    project2()
                    //body2()
                }
            }
        }
    }
}
@Composable
fun project2() {
    Text(text = "I am Promise sddss", style = TextStyle(fontSize = TextUnit.Sp(17),
            color = Color(0XFF85bb65)))
}


@Preview(name = "my preview2")
@Composable
fun DefaultPreview2(){
    PromiseFirstTheme{
        project2()

    }
    // body(resources = Resources.getSystem())

}