package com.example.promisefirst

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.promisefirst.ui.theme.PromiseFirstTheme

class ReciepeFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                PromiseFirstTheme {
                    project2()
                }
            }
        }
    }
}

@Composable
fun project2() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Recipe new", style =
        TextStyle(fontSize = TextUnit.Sp(21),
            color = Color(0XFF85bb65),
            fontWeight = FontWeight.Bold
        )
        )

    }

}

