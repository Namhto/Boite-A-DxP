package com.namhto.dxpbox

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var bogoss: ImageView
    private lateinit var caisse: ImageView
    private lateinit var reptile: ImageView
    private lateinit var mediaPlayerBogoss: MediaPlayer
    private lateinit var mediaPlayerCaisse: MediaPlayer
    private lateinit var mediaPlayerReptile: MediaPlayer
    private val random: Random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bogoss = findViewById(R.id.bogoss)
        bogoss.setOnClickListener { playBogoss() }

        caisse = findViewById(R.id.caisse)
        caisse.setOnClickListener { playCaisse() }

        reptile = findViewById(R.id.reptile)
        reptile.setOnClickListener { playReptile() }

        mediaPlayerBogoss = MediaPlayer.create(this, R.raw.david)
        mediaPlayerCaisse = MediaPlayer.create(this, R.raw.isma1)
        mediaPlayerReptile = MediaPlayer.create(this, R.raw.reptile1)
    }

    private fun playBogoss() {
        mediaPlayerBogoss.stop()
        mediaPlayerBogoss.release()
        mediaPlayerBogoss = initMediaPlayerBogoss(random.nextInt(9))
        mediaPlayerBogoss.start()
    }

    private fun playCaisse() {
        mediaPlayerCaisse.stop()
        mediaPlayerCaisse.release()
        mediaPlayerCaisse = initMediaPlayerCaisse(random.nextInt(4))
        mediaPlayerCaisse.start()
    }

    private fun playReptile() {
        mediaPlayerReptile.stop()
        mediaPlayerReptile.release()
        mediaPlayerReptile = initMediaPlayerReptile(random.nextInt(1))
        mediaPlayerReptile.start()
    }

    private fun initMediaPlayerBogoss(choice: Int): MediaPlayer {
        return when (choice) {
            0 -> MediaPlayer.create(this, R.raw.alexandre)
            1 -> MediaPlayer.create(this, R.raw.antoine)
            2 -> MediaPlayer.create(this, R.raw.cyril)
            3 -> MediaPlayer.create(this, R.raw.david)
            4 -> MediaPlayer.create(this, R.raw.julien)
            5 -> MediaPlayer.create(this, R.raw.maxime)
            6 -> MediaPlayer.create(this, R.raw.othman)
            7 -> MediaPlayer.create(this, R.raw.quentin)
            8 -> MediaPlayer.create(this, R.raw.thierry)
            9 -> MediaPlayer.create(this, R.raw.thomas)
            else -> MediaPlayer.create(this, R.raw.david)
        }
    }

    private fun initMediaPlayerCaisse(choice: Int): MediaPlayer {
        return when (choice) {
            0 -> MediaPlayer.create(this, R.raw.isma1)
            1 -> MediaPlayer.create(this, R.raw.isma2)
            2 -> MediaPlayer.create(this, R.raw.isma3)
            3 -> MediaPlayer.create(this, R.raw.isma4)
            else -> MediaPlayer.create(this, R.raw.isma1)
        }
    }

    private fun initMediaPlayerReptile(choice: Int): MediaPlayer {
        return when (choice) {
            0 -> MediaPlayer.create(this, R.raw.reptile1)
            else -> MediaPlayer.create(this, R.raw.reptile1)
        }
    }
}
