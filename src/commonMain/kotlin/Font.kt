import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.ExperimentalResourceApi
import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontWeight
import cup_lt.generated.resources.BIZUDGothic_Bold
import cup_lt.generated.resources.BIZUDGothic_Regular
import cup_lt.generated.resources.Res
import org.jetbrains.compose.resources.Font
@OptIn(ExperimentalResourceApi::class)
@Composable
fun SlideFontFamily() = FontFamily(
    Font(Res.font.BIZUDGothic_Regular, weight = FontWeight.Normal),
    Font(Res.font.BIZUDGothic_Bold, weight = FontWeight.Bold)
)

@Composable
fun SlideTypography() = Typography().run {

    val fontFamily = SlideFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = fontFamily),
        displayMedium = displayMedium.copy(fontFamily = fontFamily),
        displaySmall = displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = titleLarge.copy(fontFamily = fontFamily),
        titleMedium = titleMedium.copy(fontFamily = fontFamily),
        titleSmall = titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = bodyLarge.copy(fontFamily =  fontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = bodySmall.copy(fontFamily = fontFamily),
        labelLarge = labelLarge.copy(fontFamily = fontFamily),
        labelMedium = labelMedium.copy(fontFamily = fontFamily),
        labelSmall = labelSmall.copy(fontFamily = fontFamily)
    )
}