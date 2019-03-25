package com.example.kwejk.Controller;

import com.example.kwejk.data.CategoryRepository;
import com.example.kwejk.data.GifRepository;
import com.example.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {
    @Autowired
    GifRepository gifRepository;

    @GetMapping("/search")
    public String search(@RequestParam String name, ModelMap modelMap) {
        List<Gif> result = gifRepository.searchGifsByName(name);
        modelMap.put("gifs", result);
        return "home";

    }

}

//<input name="q" type="search" placeholder="Wyszukiwanie..." required="required" autocomplete="off"/>