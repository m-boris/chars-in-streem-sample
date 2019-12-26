package com.boris.charinstring.model;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicLong;

public class CharsFrequency {

    private final Character character;
    private AtomicLong frequency;

    public CharsFrequency(Character character) {
        this.character = character;
        this.frequency = new AtomicLong();
    }

    public void incrementFrequency(){
        this.frequency.incrementAndGet();
    }

    public long getFrequency(){
        return this.frequency.get();
    }

    public Character getCharacter() {
        return character;
    }
}
