package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
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
import org.kodein.emoji.smileys_emotion.face_smiling.Wink

val whatIsCuP by Slide { step ->
    Column(
        Modifier.fillMaxSize().padding(10.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text("Compose ur Pres", style = MaterialTheme.typography.headlineLarge)
        BulletPoints {
            BulletPoint() {
                Text("Androidアプリ開発でも使われるUIライブラリ Composeを使ってスライドを作れるライブラリ")
            }
            BulletPoint() {
                Text("今年の7月にいきなり登場した")
            }

        }
    }

}