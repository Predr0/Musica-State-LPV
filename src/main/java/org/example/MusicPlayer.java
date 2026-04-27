package org.example;

public class MusicPlayer {
    private MusicaState estado;

    public MusicPlayer() {
        this.estado = new StoppedState();
    }

    public void setEstado(MusicaState estado) {
        this.estado = estado;
    }

    public void clicarPlay() {
        estado.clicarPlay(this);
    }

    public void clicarStop() {
        estado.clicarStop(this);
    }

    public String getStatus() {
        return estado.getStatus();
    }
}