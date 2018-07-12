package com.example.android.jokeprovider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GoodJokes {

    public String tellAGoodJoke(){
        Random randomGenerator = new Random();
        List<String> jokeList = Arrays.asList(
                "Why Should you stand in the corner if it gets cold?  \nBecause its always 90 degrees!",
                "How do you keep a man from drowning?  \nget his wife off his back!",
                "What does a computer eat for a snack? \nMicrochips!",
                "What computer sings the best?\nA Dell!",
                "What's Forrest Gumps's password ?\n1forrest1",
                "What did the spider do on a computer?\nMade a website!"
        );
        int next = randomGenerator.nextInt(jokeList.size());
        return jokeList.get(next);
    }


}
