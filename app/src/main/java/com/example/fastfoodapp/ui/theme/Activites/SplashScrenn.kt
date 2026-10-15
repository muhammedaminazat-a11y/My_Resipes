package com.example.fastfoodapp.ui.theme.Activites
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.estimateAnimationDurationMillis
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fastfoodapp.R
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun SplachScreen(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Начальный экран",
            modifier = Modifier.size(200.dp),
        )
    }
}

@Composable
fun startSpalchScreen(){
    var rememberScreen by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(1000L.milliseconds)
        rememberScreen = false
    }
    Box(modifier = Modifier.fillMaxSize()) {
        CategoryCard()
        AnimatedVisibility(
            visible = rememberScreen,
            enter = EnterTransition.None,
            exit = fadeOut(animationSpec = tween(1000) )
        ) {
            SplachScreen()
        }
    }
}

