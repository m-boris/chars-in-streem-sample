package com.boris.charinstring.service;

import com.boris.charinstring.model.CharsFrequency;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;



class CharsCounterServiceImplTest {

    @Test
    public void calculateCharsFrequencyTest(){
        String inputString = "AAA";
        CharsCounterService charsCounterService = new CharsCounterServiceImpl();
        List<CharsFrequency> list = charsCounterService.calculateCharsFrequency( inputString );
        Assertions.assertAll(
                ()-> Assertions.assertEquals( 1, list.size() ),
                ()-> Assertions.assertEquals('A', list.get(0).getCharacter()  ),
                ()-> Assertions.assertEquals( inputString.length(), list.get(0).getFrequency() )
        );
        // just another option with hamcrest matcher
        assertThat( list.size(), Matchers.equalTo( 1 )  );
    }

}