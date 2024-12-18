import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.ExperimentalResourceApi
import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontWeight
import cup_lt.generated.resources.*
import cup_lt.generated.resources.NotoSansJP_Thin
import cup_lt.generated.resources.Res
import org.jetbrains.compose.resources.Font
@OptIn(ExperimentalResourceApi::class)
@Composable
fun SlideFontFamily() = FontFamily(
    Font(Res.font.NotoSansJP_ExtraLight, weight = FontWeight.ExtraLight),
    Font(Res.font.NotoSansJP_Light, weight = FontWeight.Light),
    Font(Res.font.NotoSansJP_Thin, weight = FontWeight.Thin),
    Font(Res.font.NotoSansJP_Regular, weight = FontWeight.Normal),
    Font(Res.font.NotoSansJP_Medium, weight = FontWeight.Medium),
    Font(Res.font.NotoSansJP_Bold, weight = FontWeight.Bold),
    Font(Res.font.NotoSansJP_Black, weight = FontWeight.Black),
    Font(Res.font.NotoSansJP_ExtraBold, weight = FontWeight.ExtraBold),
    Font(Res.font.NotoSansJP_SemiBold, weight = FontWeight.SemiBold),
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