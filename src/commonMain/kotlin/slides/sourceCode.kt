package slides

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.X
import androidx.compose.ui.text.TextStyle
import net.kodein.cup.PreparedSlide
import net.kodein.cup.PreparedSlideScope.slideContent
import net.kodein.cup.sa.SourceCode
import net.kodein.cup.sa.SourceCodeThemes
import net.kodein.cup.sa.rememberSourceCode

val amazingHtml by PreparedSlide(stepCount = 4) {

    val sourceCode = rememberSourceCode(language = "html") {
        val bad by marker(onlyShown(0))
        val good by marker(hidden(0))
        val second by marker(hidden(0..1))
        val bold by marker(highlighted(3))

        // language=html
        """
        <p>
            This is ${bad}freaking${X}${good}really${X}
        ${second}    ${bold}<b>${X}Amazing!${bold}</b>${X}${X}
        </p>
    """.trimIndent()
    }

    slideContent {
        SourceCode(
            sourceCode,
            theme = SourceCodeThemes.darcula,
            step = it
        )
    }
}

