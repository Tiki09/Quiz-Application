package com.quizapplication.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quizapplication.R

@Preview
@Composable
fun ButtonBoxPreview() {
//    ButtonBox(text = "Generate Quiz", padding = 10.dp)
}

@Composable
fun ButtonBox(
    text: String,
    padding: Dp,
    onButtonClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(padding)
            .clickable { onButtonClick() }
            .fillMaxWidth()
            .clip(RoundedCornerShape(40.dp))
            .height(50.dp)
            .background(color = colorResource(id = R.color.blue_grey)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 25.sp,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
        )
    }
}
