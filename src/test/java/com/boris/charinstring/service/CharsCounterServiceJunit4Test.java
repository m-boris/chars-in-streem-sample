package com.boris.charinstring.service;

import com.boris.charinstring.model.CharsFrequency;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

public class CharsCounterServiceJunit4Test {

    @Test
    public void calculateCharsFrequencyTest(){
        String inputString = "AAAAA";
        CharsCounterService charsCounterService = new CharsCounterServiceImpl();
        List<CharsFrequency> list = charsCounterService.calculateCharsFrequency( inputString );
        Assert.assertThat( list.size(), CoreMatchers.equalTo( 1 ) );
    }
}
