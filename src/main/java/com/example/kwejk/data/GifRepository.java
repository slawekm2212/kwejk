package com.example.kwejk.data;

import com.example.kwejk.Controller.CategoryController;
import com.example.kwejk.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    public final static List<Gif> ALL_GIFS = Arrays.asList(

            new Gif("android-explosion", "mols", true, 0),
            new Gif("ben-and-mike", "mika", false, 1),
            new Gif("book-dominos", "nen", true, 0),
            new Gif("compiler-bot", "bot", false, 2),
            new Gif("cowboy-coder", "username", true, 0),
            new Gif("infinite-andrew", "username", true, 0)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;

    }

    public static List<Gif> getFavoritesGifs() {
        List<Gif> favoritesGifs = new ArrayList<>();
        for (Gif value : ALL_GIFS) {
            if (value.getFavorite() == true) {
                favoritesGifs.add(value);
            }
        }
        return favoritesGifs;
    }

    public static List<Gif> findGifByCategoryId(int id) {
        List<Gif> gifsByCategory = new ArrayList<>();
        for (Gif value : ALL_GIFS) {
            if (value.getCategoryId() == id) {
                gifsByCategory.add(value);
            }
        }
        return gifsByCategory;
    }
}

