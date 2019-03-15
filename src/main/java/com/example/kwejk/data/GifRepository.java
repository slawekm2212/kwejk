package com.example.kwejk.data;

import com.example.kwejk.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    public final static List<Gif> ALL_GIFS = Arrays.asList(
            
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", false, 2),
            new Gif("book-dominos", "nen", true, 1),
            new Gif("compiler-bot", "bot", false, 3),
            new Gif("cowboy-coder", "username", true, 1),
            new Gif("infinite-andrew", "username", true, 1)
    );
    public static List<Gif> getAllGifs() {
        return ALL_GIFS;

    }
}
