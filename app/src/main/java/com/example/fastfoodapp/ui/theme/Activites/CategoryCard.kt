package com.example.fastfoodapp.ui.theme.Activites

import android.R.attr.shape
import android.R.attr.text
import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fastfoodapp.R
import com.example.fastfoodapp.ui.theme.ColorText
import com.example.fastfoodapp.ui.theme.myFont


@Composable
@Preview(showBackground = true)
fun CategoryCard(){
    Scaffold(
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
            ) {
                Box(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                ) {
                    Image(
                        painter = painterResource(R.drawable.bcg_categories),
                        contentDescription = "Icon",
                        modifier = Modifier.fillMaxSize(),
                    )
                    Column (
                        modifier = Modifier
                            .padding(15.dp)
                            .align(Alignment.BottomStart),
                    ){
                    Text(
                        modifier = Modifier
                            .background(Color.White , shape = RoundedCornerShape(14.dp))
                            .padding(15.dp),
                        textAlign = TextAlign.Center,
                        text = "КАТЕГОРИЙ",
                        color = ColorText,
                        fontSize = 18.sp,
                        fontFamily = myFont
                    )
                }
                }
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(innerPadding)
                        .weight(1f)
                ) {
                    item {

                    }
                    items(
                        count = 10,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Text(text = "Hello")
                        }
                    }
                }
            }
        }
    )
}
