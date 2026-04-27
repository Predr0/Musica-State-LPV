package org.example;

public class PlayingState implements MusicaState {
    @Override
    public void clicarPlay(MusicPlayer player) {
        player.setEstado(new PausedState());
    }

    @Override
    public void clicarStop(MusicPlayer player) {
        player.setEstado(new StoppedState());
    }

    @Override
    public String getStatus() {
        return "TOCANDO";
    }
}