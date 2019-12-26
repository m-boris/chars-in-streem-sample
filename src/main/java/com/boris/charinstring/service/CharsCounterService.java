package com.boris.charinstring.service;

import com.boris.charinstring.model.CharsFrequency;

import java.util.List;

public interface CharsCounterService {

    List<CharsFrequency> calculateCharsFrequency( String inputStr );
}
