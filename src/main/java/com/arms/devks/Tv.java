package com.arms.devks;

import org.springframework.stereotype.Component;

@Component
public class Tv {

    String name;
    int channel;
    boolean power;

    public void power() {
        power = !power;
    }

    public void channelUp() {
        ++channel;
    }

    public void channelDown() {
        --channel;
    }

}
