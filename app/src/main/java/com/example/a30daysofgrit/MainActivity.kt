package com.example.a30daysofgrit


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofgrit.model.Grit
import com.example.a30daysofgrit.model.GritCollection
import com.example.a30daysofgrit.ui.theme.A30DaysOfGritTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A30DaysOfGritTheme {
                GritApp()
            }
        }
    }
}

@Composable
fun GritApp() {
    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(GritCollection.girts) {
                ///grit->
                GritItem(
                    it,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

@Composable
fun GritItem(grit: Grit,modifier: Modifier= Modifier){
    var expanded by remember { mutableStateOf(false) }

    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.tertiaryContainer
        else MaterialTheme.colorScheme.primaryContainer
    )

    Card(modifier= modifier,
//        shape = RoundedCornerShape(7.dp),
        onClick = {
            expanded=!expanded
        },
    ) {
        Column(
            modifier=Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                ).background(color=color)
        ) {
            Text(
                text = stringResource(grit.day),
                style = MaterialTheme.typography.displaySmall,
                modifier=Modifier
                    .padding(top = 5.dp, start = 15.dp, end = 15.dp)
            )

            Text(
                text = stringResource(grit.title),
                style = MaterialTheme.typography.displayMedium,
                modifier= Modifier.padding(top=3.dp, start = 15.dp, bottom = 3.dp, end = 15.dp)
            )

            Image(
                painter = painterResource(grit.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(194.dp)
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
            )

            if (expanded){
                Text(
                    text = stringResource(grit.grit),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier= Modifier.padding(top=3.dp, start = 15.dp, bottom = 5.dp, end = 15.dp)
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier= Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
            ){
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
    )
}



@Preview
@Composable
fun GritItemPreview(){
    A30DaysOfGritTheme {
        GritItem(
            Grit(
                day = R.string.day1,
                title = R.string.title1,
                image = R.drawable.image1,
                grit = R.string.quote1
            )
        )
    }
}