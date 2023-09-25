package com.example.presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentacion.ui.theme.PresentacionTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.material.Surface
import androidx.compose.ui.layout.ContentScale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Presentacion()
        }
    }
}

@Composable
fun Presentacion(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF5FFFA)
    ) {
        Tarjeta()
        Contacto()
    }
}

@Composable
fun Tarjeta(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        ImagePre()
        Datos(name = "Pepito Perez Dino", ocupacion = "Cientifico de Datos")
    }
}
@Composable
fun ImagePre() {
    Image(
        painter = painterResource(R.drawable.pepito),
        contentDescription = "Contact profile picture",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}

@Composable
fun Datos(name: String, ocupacion: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(name, fontSize = 25.sp, fontFamily = FontFamily.Monospace, color = Color.Blue)
        Text(ocupacion,fontFamily = FontFamily.Serif, textAlign = TextAlign.Center)
    }

}
@Composable
fun Contacto() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom

    ) {
        Iconos()
        ContacText()
    }
}

@Composable
fun Iconos(){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Icon(imageVector = Icons.Rounded.Phone, contentDescription = "Phone",tint = Color.Blue)
        Icon(imageVector = Icons.Rounded.Share, contentDescription = "Share",tint = Color.Blue)
        Icon(imageVector = Icons.Rounded.Email, contentDescription = "Email",tint = Color.Blue)
    }
    
}
@Composable
fun ContacText(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(text = "322222222", modifier = Modifier.padding(start = 9.dp, top = 0.dp,
            end = 0.dp, bottom = 4.dp),fontFamily = FontFamily.Serif)
        Text(text = "pepito@mail.com", modifier = Modifier.padding(start = 9.dp, top = 0.dp,
            end = 0.dp, bottom = 7.dp, ),fontFamily = FontFamily.Serif)
        Text(text = "@pepito", modifier = Modifier.padding(start = 9.dp, top = 0.dp,
            end = 0.dp, bottom = 2.dp), fontFamily = FontFamily.Serif)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PresentacionTheme {
        Presentacion()
    }
}