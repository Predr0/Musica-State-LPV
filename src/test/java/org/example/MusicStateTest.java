package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicStateTest {

    @Test
    void deveIniciarParado() {
        MusicPlayer player = new MusicPlayer();
        assertEquals("PARADO", player.getStatus());
    }

    @Test
    void deveMudarParaTocandoAoDarPlay() {
        MusicPlayer player = new MusicPlayer();
        player.clicarPlay();
        assertEquals("TOCANDO", player.getStatus());
    }

    @Test
    void devePausarSeEstiverTocando() {
        MusicPlayer player = new MusicPlayer();
        player.clicarPlay(); // Tocando
        player.clicarPlay(); // Pausar
        assertEquals("PAUSADO", player.getStatus());
    }

    @Test
    void deveRetomarSeEstiverPausado() {
        MusicPlayer player = new MusicPlayer();
        player.clicarPlay();
        player.clicarPlay();
        player.clicarPlay();
        assertEquals("TOCANDO", player.getStatus());
    }

    @Test
    void devePararMusicaDeQualquerEstado() {
        MusicPlayer player = new MusicPlayer();

        player.clicarPlay();
        player.clicarStop();
        assertEquals("PARADO", player.getStatus());

        player.clicarPlay();
        player.clicarPlay();
        player.clicarStop();
        assertEquals("PARADO", player.getStatus());
    }
}