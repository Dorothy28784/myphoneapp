package com.dorothy.myphoneapp

import ForgotPasswordScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dorothy.myphoneapp.ui.screens.authentication.login.LoginScreen
import com.dorothy.myphoneapp.ui.screens.authentication.signup.SignupScreen
import com.dorothy.myphoneapp.ui.theme.MyPhoneAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPhoneAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ForgotPasswordScreen( modifier = Modifier.padding(innerPadding))
                }


                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyPhoneAppTheme {


    }
}