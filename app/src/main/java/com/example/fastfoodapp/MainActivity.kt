package com.example.fastfoodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fastfoodapp.ui.theme.myFont
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import com.example.fastfoodapp.ui.theme.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavigation()
        }
    }
}


// BottomBar
@Composable
fun BottomBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding( top = 10.dp, bottom = 20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Button(modifier = Modifier
            .weight(1f)
            .padding(10.dp),
            onClick = {},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor =Color(0xff525dc0)),
            )
        {
            Text(
                text = "КАТЕГОРИЙ",
                fontSize = 19.sp,
                fontFamily = myFont,
            )
        }
        Button(
            modifier = Modifier
                .weight(1f)
                .padding(10.dp),
            onClick = {},
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFE13E3E))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "ИЗБРАННОЕ",
                    fontSize = 19.sp,
                    fontFamily = myFont
                )
                Icon(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .height(25.dp)
                        .width(25.dp)
                        .padding(start = 5.dp)
                    ,
                    painter = painterResource(R.drawable.ph_heart),
                    contentDescription = "Icon",
                )

            }
        }
    }
}



//Splash экран
@Composable
fun SplashScreen(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Splach экран",
            modifier = Modifier.size(200.dp),
        )
    }
}
