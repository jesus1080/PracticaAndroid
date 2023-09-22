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
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarjeta()
            Contacto()
        }
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
        Datos(name = "Jesus Ruiz Velasco", ocupacion = "Cientifico de Datos")
    }
}
@Composable
fun ImagePre() {
    Image(
        painter = painterResource(R.drawable.otra),
        contentDescription = "Contact profile picture",
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
   )
}

@Composable
fun Datos(name: String, ocupacion: String) {
    Column() {
        Text(name)
        Text(ocupacion)
    }

}
@Composable
fun Contacto() {
    Column(
        modifier = Modifier.size(200.dp).offset(x=90.dp,y=630.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text( "Telefono")
        Text( "Correo")
        Text( "Redes!")
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PresentacionTheme {
        Tarjeta()
        Contacto()
    }
}