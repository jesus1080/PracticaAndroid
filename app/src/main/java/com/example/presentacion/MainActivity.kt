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
import androidx.compose.ui.graphics.vector.ImageVector


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
        Datos(name = "Pepito Dino Dino", ocupacion = "Cientifico de Datos")
    }
}
@Composable
fun ImagePre() {
    Image(
        painter = painterResource(R.drawable.pepito),
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
        modifier = Modifier
            .size(300.dp)
            .offset(x = 50.dp, y = 500.dp)
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        Contact(icon = Icons.Rounded.Phone, item = "322222222")
        Contact(icon = Icons.Rounded.Email, item = "pepito@mail.com")
        Contact(icon = Icons.Rounded.Share, item = "@dino4444")
    }
}

@Composable
fun Contact(icon:ImageVector,item:String){

    Row(){
        Icon(imageVector = icon, contentDescription = item)
        Spacer(modifier = Modifier.size(30.dp))
        Text(text = item)
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