package net.ezra.ui.mit


import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.ui.theme.AppTheme



@Composable
fun MITScreen(navController: NavHostController) {




    Column {
        Text("Mit Page",
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            color = Color(0xff23D310),


            )
        

    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MITScreen(rememberNavController())
}

