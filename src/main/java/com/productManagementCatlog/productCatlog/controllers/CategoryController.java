package com.productManagementCatlog.productCatlog.controllers;

import com.productManagementCatlog.productCatlog.models.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @GetMapping()
    List<Category> getCategories() {
        List<Category> categoryList = new ArrayList<>();
        Category p1 = new Category();
        p1.setId(1L);
        p1.setName("Route");
        categoryList.add(p1);
        return categoryList;
    }

    @GetMapping("/{id}")
    Category getCategoriesById(@PathVariable Long id) {
        Category p1 = new Category();
        p1.setId(id);
        return p1;
    }

    @PostMapping()
    Category addCategory(Category category) {
        return category;
    }
}
