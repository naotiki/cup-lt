package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import cup_lt.generated.resources.Res
import cup_lt.generated.resources.cup
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import net.kodein.cup.widgets.material3.BulletPoints
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.kodein.emoji.Emoji
import org.kodein.emoji.activities.event.Sparkles
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.compose.m3.TextWithPlatformEmoji
import org.kodein.emoji.smileys_emotion.face_affection.HappyCry
import org.kodein.emoji.smileys_emotion.face_smiling.Wink

val preIntro by Slide(stepCount = 6) { step ->
    Text(
        "皆さん、スライドは何で作ってますか？"
    )
    BulletPoints(Modifier.padding(top = 16.dp)) {
        BulletPoint(visible = step >= 1) {
            Text("PowerPoint？")
        }
        BulletPoint(visible = step >= 2) {
            Text("Google スライド？")
        }
        BulletPoint(visible = step >= 3) {
            Text("Canva？")
        }
        BulletPoint(visible = step >= 4) {
            Text("TeX？")
        }
    }

    AnimatedVisibility(visible = step >= 5, modifier = Modifier.padding(top = 16.dp)) {
        TextWithNotoAnimatedEmoji(
            styled(MyStyleSheet) { "いやいや、時代は${+em}Kotlin${-em}！${Emoji.Wink}" },
            style = MaterialTheme.typography.headlineMedium,
        )
    }
}

val intro by Slide {
    Image(
        painterResource(Res.drawable.cup),
        contentDescription = "Compose ur Pres",
        modifier = Modifier
            .size(96.dp)
            .clip(CircleShape)
    )

    TextWithNotoAnimatedEmoji(
        text = "${Emoji.Sparkles}Compose + Kotlinでスライドを作ろう！${Emoji.Sparkles}",
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(top = 16.dp)
    )

}
