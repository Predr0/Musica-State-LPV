package org.example;

public class PausedState implements MusicaState {
    @Override
    public void clicarPlay(MusicPlayer player) {
        player.setEstado(new PlayingState());
    }

    @Override
    public void clicarStop(MusicPlayer player) {
        player.setEstado(new StoppedState());
    }

    @Override
    public String getStatus() {
        return "PAUSADO";
    }
}