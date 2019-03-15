package com.example.kwejk.Controller;

import com.example.kwejk.data.GifRepository;
import com.example.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getAllGifs();
        modelMap.put("gifs", gifs);
        return "home";
    }

}
