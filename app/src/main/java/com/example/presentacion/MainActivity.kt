package com.example.presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentacion.ui.theme.PresentacionTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarjeta()
        }
    }
}

@Composable
fun Tarjeta(){
    Column {
        ImagePre()
        Datos(name = "Jesus Ruiz Velasco", ocupacion = "Cientifico de Datos")
        Contacto(name = "Cualesquira")
    }
}
@Composable
fun ImagePre() {
    Image(
        painter = painterResource(R.drawable.otra),
        contentDescription = "Contact profile picture",
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
fun Contacto(name: String) {
    Text(text = "Hello $name!")
}










@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PresentacionTheme {
        Greeting("Android")
    }
}