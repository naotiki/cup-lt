import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
/*import io.sellmair.evas.Events
import io.sellmair.evas.States
import io.sellmair.evas.compose.installEvas*/
import net.kodein.cup.Presentation
import net.kodein.cup.Slides
import net.kodein.cup.cupApplication
import net.kodein.cup.laser.laser
import net.kodein.cup.speaker.speakerWindow
import net.kodein.cup.widgets.material3.cupScaleDown
import org.jetbrains.compose.reload.DevelopmentEntryPoint
import org.kodein.emoji.compose.EmojiService
import slides.*


fun main() {
    /*
        val events = Events()
        val states = States()*/
    cupApplication(
        // TODO: Change title
        title = "Kotlinでスライドを作ろう！"
    ) {
        //installEvas(events, states) {
        DevelopmentEntryPoint {
            // Hot reload用にここに書かないといけない
            val presentationSlides = remember {
                // TODO: Write your own slides!
                Slides(
                    preIntro,
                    intro,
                    whatIsCuP,
                    amazingHtml
                )
            }
            remember {
                // https://github.com/kosi-libs/Emoji.kt?tab=readme-ov-file#initializing-the-emoji-service
                EmojiService.initialize()
            }
            MaterialTheme(
                // TODO: Apply your theme
                colorScheme = darkColorScheme(),
                typography = SlideTypography().cupScaleDown()
            ) {
                Presentation(
                    slides = presentationSlides,
                    configuration = {
                        // TODO: Configure plugins
                        speakerWindow()
                        laser()
                    },
                    backgroundColor = MaterialTheme.colorScheme.background
                ) { slidesContent ->
                    CompositionLocalProvider(
                        LocalContentColor provides MaterialTheme.colorScheme.onBackground
                    ) {
                        slidesContent()
                    }
                }
            }
        }
        //}
    }
}


