package org.example;

public class StoppedState implements MusicaState {
    @Override
    public void clicarPlay(MusicPlayer player) {
        player.setEstado(new PlayingState());
    }

    @Override
    public void clicarStop(MusicPlayer player) {
    }

    @Override
    public String getStatus() {
        return "PARADO";
    }
}