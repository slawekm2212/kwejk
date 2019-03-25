package com.example.kwejk.data;

import com.example.kwejk.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//adnotacja @componet pozwala nam na wykorzystanie @autowired
// czyli wstrzykniecie zaleznosci repozytorium do kontrolera
@Component
public class CategoryRepository {
    public static final List<Category> ALL_CATERGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(1, "sport"),
            new Category(2, "it")
    );

    public static List<Category> getCatergoryList() {
        return ALL_CATERGORIES;
    }

    public static Category getCategoryById(int id) {
        return ALL_CATERGORIES.get(id);
    }

}
