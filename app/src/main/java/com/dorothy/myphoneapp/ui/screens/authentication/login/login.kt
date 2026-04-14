package com.dorothy.myphoneapp.ui.screens.authentication.login

import android.R.attr.value
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dorothy.myphoneapp.R
import com.dorothy.myphoneapp.ui.components.LottieAnimationWidget
import com.dorothy.myphoneapp.ui.components.`pagepadding`
import com.dorothy.myphoneapp.ui.components.pagepadding
import com.dorothy.myphoneapp.ui.theme.primaryColor
import com.dorothy.myphoneapp.ui.theme.secondaryColor

@Composable
fun LoginScreen(modifier: Modifier) {
    //     inputs
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(`pagepadding`).fillMaxSize()

    ) {
        //   lottie animation
        LottieAnimationWidget(R.raw.moon, 300.dp)

//        // welcome message
         Text(
             text = "Login to get started",
             style = TextStyle(
                 fontSize = 24.sp,
                 fontWeight = FontWeight.Bold,
                 color = primaryColor

             )
         )

        Spacer(modifier=Modifier.height(24.dp))


        //    email input
        OutlinedTextField(
            value = emailInput,
            onValueChange = { emailInput = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Email",
                    tint = primaryColor
                )
            },

            placeholder = {
                Text(text = "eg.dm@example.com")
            },
            maxLines = 1,
            shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors  = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier=Modifier.height(24.dp))
        //  password input
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.outline_password_24),
                    contentDescription = "Email"
                )
            },
            label = {

            },

            maxLines = 1,  shape = RoundedCornerShape(24.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors  = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = secondaryColor,
                unfocusedBorderColor = primaryColor
            ),

            modifier = Modifier.fillMaxWidth()
        )
        //  button
        OutlinedButton(
            onClick = {}
        ) {
            Text(text = "login",
                modifier = Modifier.padding(horizontal = 24.dp))
        }

        //row
        Row(){
            Text(text = "Forgot Password")
            Text(text = "No account?")
        }

    }


}


