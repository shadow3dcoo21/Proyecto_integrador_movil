package com.example.proyecto_integrador

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.modifier.modifierLocalConsumer

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyecto_integrador.ui.login.LoginActivity
import java.time.format.TextStyle

import androidx.compose.material3.Scaffold as Scaffold

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Domotec()
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Domotec() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    val color_fondo_top = Color(0xFFF74357B)
    val color_fondo_footer = Color.White
    val color_mass = Color.Black


    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        bottomBar = {
            BottomAppBar(
                containerColor = color_fondo_footer,

                actions = {
                    Row ( modifier = Modifier
                        .background(Color.White)
                        ){
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Icon(

                                painterResource(R.drawable.home )
                                ,
                                contentDescription = " ",
                                tint = Color.Black,

                            )

                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Icon(

                                painterResource(R.drawable.search )
                                ,
                                contentDescription = " ",
                                tint = Color.Black,

                                )
                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(2f),onClick = { /* do something */ }) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)

                                    .size(60.dp)

                                    .clip(
                                        RoundedCornerShape(
                                            topEnd = 100.dp,
                                            topStart = 100.dp,
                                            bottomEnd = 100.dp,
                                            bottomStart = 100.dp
                                        )
                                    )
                                ,
                                painter = painterResource(R.drawable.medio),
                                contentDescription ="ss"
                            )
                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)

                                    .size(60.dp)

                                    .clip(
                                        RoundedCornerShape(
                                            topEnd = 100.dp,
                                            topStart = 100.dp,
                                            bottomEnd = 100.dp,
                                            bottomStart = 100.dp
                                        )
                                    )
                                ,
                                painter = painterResource(R.drawable.comment),
                                contentDescription ="ss"
                            )
                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)


                                    .clip(
                                        RoundedCornerShape(
                                            topEnd = 100.dp,
                                            topStart = 100.dp,
                                            bottomEnd = 100.dp,
                                            bottomStart = 100.dp
                                        )
                                    )
                                ,
                                painter = painterResource(R.drawable.bell),
                                contentDescription ="ss"
                            )
                        }
                    }





                },

                )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier

                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(
                modifier =Modifier.height(60.dp),
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ){
            Text(

                modifier = Modifier
                    .fillMaxWidth()
                    ,

                textAlign = TextAlign.Center,
                fontWeight = FontWeight(400),
                fontFamily = FontFamily.Default,
                fontSize = 21.sp,
                color = Color(0xFF000000),
                text = "Lista de artefactos".trimIndent()



            )}
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    ,

                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black,
                text = "Dispositivos Conectados".trimIndent()
            )
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                    ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

                Image(
                modifier = Modifier
                    .align(Alignment.CenterVertically)

                    .size(60.dp)

                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )
                    ,
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                            ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Foco 1".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                            ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                            ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


            FloatingActionButton(modifier = Modifier
                .align(Alignment.CenterVertically)
                .height(35.dp)
                .background(Color.Black)
                .padding(1.dp)
                .clip(
                    RoundedCornerShape(
                        topEnd = 100.dp,
                        topStart = 100.dp,
                        bottomEnd = 100.dp,
                        bottomStart = 100.dp
                    )
                )


                ,
                onClick = { /* do something */ },
                containerColor = color_mass,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
            ) {
                Text(
                    modifier = Modifier
                        .height(25.dp)


                        .padding(horizontal = 15.dp)
                        .clip(RoundedCornerShape(20.dp))
                        ,

                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.White,
                    text ="DETALLES".trimIndent()
                )
            }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)

                        .size(60.dp)

                        .clip(
                            RoundedCornerShape(
                                topEnd = 100.dp,
                                topStart = 100.dp,
                                bottomEnd = 100.dp,
                                bottomStart = 100.dp
                            )
                        )
                    ,
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Foco 2".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)

                        .size(60.dp)

                        .clip(
                            RoundedCornerShape(
                                topEnd = 100.dp,
                                topStart = 100.dp,
                                bottomEnd = 100.dp,
                                bottomStart = 100.dp
                            )
                        )
                    ,
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Foco 3".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)

                        .size(60.dp)

                        .clip(
                            RoundedCornerShape(
                                topEnd = 100.dp,
                                topStart = 100.dp,
                                bottomEnd = 100.dp,
                                bottomStart = 100.dp
                            )
                        )
                    ,
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Foco 4".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)

                        .size(60.dp)

                        .clip(
                            RoundedCornerShape(
                                topEnd = 100.dp,
                                topStart = 100.dp,
                                bottomEnd = 100.dp,
                                bottomStart = 100.dp
                            )
                        )
                    ,
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Foco 5".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }






        }
    }

}
@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    Domotec()
}


