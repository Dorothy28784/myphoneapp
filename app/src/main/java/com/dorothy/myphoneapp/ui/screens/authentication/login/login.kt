package com.dorothy.myphoneapp.ui.screens.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.dorothy.myphoneapp.R

@Composable
fun LoginScreen(modifier: Modifier){
    //     inputs
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier

        ){
            //   lottie animation
            LottieAnimationWidget()
            //    email input
            OutlinedTextField(
                value =  emailInput,
                onValueChange = { emailInput= it },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription="Email"
                    )
                },

                placeholder = {
                    Text(text ="eg.dm@example.com")
                },
                maxLines = 1,
                modifier = Modifier.fillMaxWidth()
            )



            //  password input
            OutlinedTextField(
                value =  passwordInput,
                onValueChange = { passwordInput= it },
                leadingIcon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.outline_password_24),
                        contentDescription="Email"
                    )
                },

                placeholder = {
                    Text(text ="eg.1234")
                },
                maxLines = 1,
                modifier = Modifier.fillMaxWidth()
            )
            //  button
        }

}


@Composable
fun LottieAnimationWidget() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.moon))
    val progress by animateLottieCompositionAsState(composition,
        iterations = LottieConstants.IterateForever
        )
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.size(350.dp)
    )
}


