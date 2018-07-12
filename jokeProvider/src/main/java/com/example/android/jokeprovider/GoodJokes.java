package com.example.android.jokeprovider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GoodJokes {

    public String tellAGoodJoke(){
        Random randomGenerator = new Random();
        List<String> jokeList = Arrays.asList(
                "Why Should you stand in the corner if it gets cold?  \n\nBecause its always 90 degrees!",
                "How do you keep a man from drowning?  \n\nget his wife off his back!",
                "What does a computer eat for a snack?  \n\nMicrochips!",
                "What computer sings the best? \n\nA Dell!",
                "What's Forrest Gumps's password ? \n\n1forrest1",
                "What did the spider do on a computer? \n\nMade a website!"
        );
        int next = randomGenerator.nextInt(jokeList.size());
        return jokeList.get(next);
    }


}
