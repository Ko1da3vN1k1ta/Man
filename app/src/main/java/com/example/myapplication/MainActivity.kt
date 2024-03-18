package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private lateinit var context: Context

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(0xFFCF30C7),
                                Color(0xFF2D73A2),
                                Color(0xFF34817B),
                            )

                        )
                    )
                    .verticalScroll(rememberScrollState())
            )

            {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                    )
                {
                    Text(text = "Сортировка мусора", fontSize = 32.sp)
                }
                Row {

                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }
                Row {
                    Trash1()
                    Trash2()
                    Trash3()
                }


            }

        }
    }
}


@Composable
private fun Item() {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
            .clickable {
                Log.d("Item clicked", "Item clicked.")
            }
            .verticalScroll(rememberScrollState()),

        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(15.dp)
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.man), contentDescription = "image",
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                )
                Text(text = "Andrew Boychik")
                Text(text = "Mew Mew")
            }

        }
    }


}

@Composable
private fun Trash1() {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .width(100.dp)
            .height(100.dp)
            .clickable {
                val toast = Toast.makeText(context, "Item was clicked", Toast.LENGTH_LONG)
            }
            .verticalScroll(rememberScrollState()),

        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(15.dp)
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.glass), contentDescription = "image",
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                )

            }

        }
    }
}

@Composable
private fun Trash2() {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .width(100.dp)
            .height(100.dp)
            .clickable {
                val toast = Toast.makeText(context, "Item was clicked", Toast.LENGTH_LONG)
            }
            .verticalScroll(rememberScrollState()),

        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(15.dp)
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.trash), contentDescription = "image",
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                )

            }

        }
    }
}

@Composable
private fun Trash3() {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .width(100.dp)
            .height(100.dp)
            .clickable {
                val toast = Toast.makeText(context, "Item was clicked", Toast.LENGTH_LONG)
            }
            .verticalScroll(rememberScrollState()),

        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(15.dp)
    )
    {
        Box(
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.paper), contentDescription = "image",
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp)
                )

            }

        }
    }
}