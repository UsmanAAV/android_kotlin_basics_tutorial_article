package com.example.android_tutorial_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_tutorial_article.ui.theme.Android_tutorial_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_tutorial_articleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainLayout()
                }
            }
        }
    }
}

@Composable
fun MainLayout(modifier: Modifier = Modifier) {
    val headerImage = painterResource(id = R.drawable.bg_compose_article_background)
    Box(modifier) {
        Column(modifier) {
            Image(painter = headerImage, contentDescription = "desc")
            Text(
                text = stringResource(R.string.title),
                modifier = modifier.padding(16.dp),
                fontSize = 24.sp
            )
            Text(
                text = stringResource(R.string.jetpack_description),
                modifier = modifier.padding(horizontal = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = stringResource(R.string.tutorial_description),
                modifier = modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_tutorial_articleTheme {
        MainLayout()
    }
}