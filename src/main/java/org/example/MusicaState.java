package org.example;

public interface MusicaState {
    void clicarPlay(MusicPlayer player);
    void clicarStop(MusicPlayer player);
    String getStatus();
}