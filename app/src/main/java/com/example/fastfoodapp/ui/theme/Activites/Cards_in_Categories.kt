package com.example.fastfoodapp.ui.theme.Activites

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fastfoodapp.Food
import com.example.fastfoodapp.FoodCategory
import com.example.fastfoodapp.R
import com.example.fastfoodapp.ui.theme.ColorText
import com.example.fastfoodapp.ui.theme.myFont

@Composable
fun CardsInCategories(
    categoryName: String,
    click : () -> Unit = {}) {
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
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White),
                        painter = painterResource(R.drawable.bcg_categories),
                        contentDescription = "Icon",
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .padding(15.dp)
                            .align(Alignment.BottomStart),
                    ) {
                        Text(
                            modifier = Modifier
                                .background(Color.White, shape = RoundedCornerShape(14.dp))
                                .padding(15.dp),
                            textAlign = TextAlign.Center,
                            text = categoryName,
                            color = ColorText,
                            fontSize = 18.sp,
                            fontFamily = myFont,
                        )
                    }
                }
                LazyVerticalGrid(
                    columns = GridCells.Fixed(1),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    items(allFoods) { foodItem ->
                        CardFoodsInCategory(
                            foods = foodItem,
                            clicked = click
                        )
                    }
                }
            }
        }
    )
}


@Composable
fun CardFoodsInCategory(
    foods : FoodsInCategories,
    clicked : () -> Unit
){
    Card(modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .shadow(elevation = 15.dp)
        .clickable(onClick = clicked),
        shape = RoundedCornerShape(16.dp), )
    {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            painter = painterResource(foods.image),
            contentDescription = "Icon",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth(),
        ){
            Text(
                text = foods.name,
                color = ColorText,
                fontSize = 20.sp,
                fontFamily = myFont
            )
        }
    }
}
