package com.boris.charinstring.service;

import com.boris.charinstring.model.CharsFrequency;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CharsCounterServiceImpl implements CharsCounterService {

    public List<CharsFrequency> calculateCharsFrequency(String inputStr) {
        ConcurrentHashMap<Character, CharsFrequency> map = new ConcurrentHashMap();
        inputStr.chars()
                .mapToObj(c -> (char) c)
                .forEach( c-> {
                    incrementAnSafeCharFrequency(map, c);
                } );
        return map.values().stream().collect(Collectors.toList());
    }

    private void incrementAnSafeCharFrequency(ConcurrentHashMap<Character, CharsFrequency> map, Character c) {
        CharsFrequency charsFrequency = map.get( c );
        if ( charsFrequency==null ){
            charsFrequency = new CharsFrequency( c );
            map.putIfAbsent( c, charsFrequency );
            charsFrequency = map.get( c );
        }
        charsFrequency.incrementFrequency();
    }
}
