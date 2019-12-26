package com.boris.charinstring;

import com.boris.charinstring.model.CharsFrequency;
import com.boris.charinstring.service.CharsCounterService;
import com.boris.charinstring.service.CharsCounterServiceImpl;

import java.util.List;

public class CharInStringMain {

    public static void main( String arg[] ){
        if ( arg.length==0 ){
            System.out.println( "Missing input string argument" );
            System.exit( 1 );
        }
        CharsCounterService charsCounterService = new CharsCounterServiceImpl();
        List<CharsFrequency> list = charsCounterService.calculateCharsFrequency( arg[0] );
        if ( !list.isEmpty() ){
            System.out.printf( "Character, Frequency\n" );
            list.forEach( cf ->
                System.out.printf( "%c\t\t - %d\n", cf.getCharacter(), cf.getFrequency() )

            );
        }
        System.exit( 0 );
    }
}
