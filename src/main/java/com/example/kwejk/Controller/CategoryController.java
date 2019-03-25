package com.example.kwejk.Controller;

import com.example.kwejk.data.CategoryRepository;
import com.example.kwejk.data.GifRepository;
import com.example.kwejk.model.Category;
import com.example.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    GifRepository gifRepository;

    // @requestmapping przekierowuje request z
    // przegladarki do konkretnej metody
    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getCatergoryList();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String getCategoryId(
            @PathVariable int id, ModelMap modelMap) {
        List<Gif> gifs = gifRepository.findGifByCategoryId(id);
        modelMap.put("gifs", gifs);
        modelMap.put("category", categoryRepository.getCategoryById(id));
        return "category";
    }

}
