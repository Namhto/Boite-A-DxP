package com.namhto.dxpbox

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayerBogoss: MediaPlayer
    private lateinit var mediaPlayerCaisse: MediaPlayer
    private lateinit var mediaPlayerReptile: MediaPlayer
    private lateinit var mediaPlayerJmlp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayerBogoss = MediaPlayer.create(this, R.raw.david)
        mediaPlayerCaisse = MediaPlayer.create(this, R.raw.isma1)
        mediaPlayerReptile = MediaPlayer.create(this, R.raw.reptile1)
        mediaPlayerJmlp = MediaPlayer.create(this, R.raw.neestcepas)
    }

    private fun playBogoss(trackId: Int) {
        mediaPlayerBogoss.stop()
        mediaPlayerBogoss.release()
        mediaPlayerBogoss = MediaPlayer.create(this, trackId)
        mediaPlayerBogoss.start()
    }

    private fun playCaisse(trackId: Int) {
        mediaPlayerCaisse.stop()
        mediaPlayerCaisse.release()
        mediaPlayerCaisse = MediaPlayer.create(this, trackId)
        mediaPlayerCaisse.start()
    }

    private fun playReptile(trackId: Int) {
        mediaPlayerReptile.stop()
        mediaPlayerReptile.release()
        mediaPlayerReptile = MediaPlayer.create(this, trackId)
        mediaPlayerReptile.start()
    }

    private fun playJmlp(trackId: Int) {
        mediaPlayerJmlp.stop()
        mediaPlayerJmlp.release()
        mediaPlayerJmlp = MediaPlayer.create(this, trackId)
        mediaPlayerJmlp.start()
    }

    fun bogossAlexandre(v: View) = playBogoss(R.raw.alexandre)
    fun bogossAntoine(v: View) = playBogoss(R.raw.antoine)
    fun bogossCyril(v: View) = playBogoss(R.raw.cyril)
    fun bogossDavid(v: View) = playBogoss(R.raw.david)
    fun bogossJulien(v: View) = playBogoss(R.raw.julien)
    fun bogossMaxime(v: View) = playBogoss(R.raw.maxime)
    fun bogossOthman(v: View) = playBogoss(R.raw.othman)
    fun bogossQuentin(v: View) = playBogoss(R.raw.quentin)
    fun bogossThierry(v: View) = playBogoss(R.raw.thierry)
    fun bogossThomas(v: View) = playBogoss(R.raw.thomas)

    fun caisse1(v: View) = playCaisse(R.raw.isma1)
    fun caisse2(v: View) = playCaisse(R.raw.isma2)
    fun caisse3(v: View) = playCaisse(R.raw.isma3)
    fun caisse4(v: View) = playCaisse(R.raw.isma4)

    fun reptile1(v: View) = playReptile(R.raw.reptile1)
    fun reptile2(v: View) = playReptile(R.raw.reptile2)
    fun reptile3(v: View) = playReptile(R.raw.reptile3)

    fun maximeUmUm(v: View) = playReptile(R.raw.maxime1)
    fun maximeEncule(v: View) = playReptile(R.raw.maxime2)
    fun maximeOui(v: View) = playReptile(R.raw.maxime4)
    fun maximeOuiOui(v: View) = playReptile(R.raw.maxime3)
    fun maximeOuiOuiOui(v: View) = playReptile(R.raw.maxime5)

    fun jeanne(v: View) = playJmlp(R.raw.jeanne)
    fun auSecours(v: View) = playJmlp(R.raw.ausecours)
    fun nEstCePas(v: View) = playJmlp(R.raw.neestcepas)
}
