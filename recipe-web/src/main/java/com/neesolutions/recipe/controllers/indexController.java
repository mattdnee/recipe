package com.neesolutions.recipe.controllers;

import com.neesolutions.recipe.domain.Category;
import com.neesolutions.recipe.domain.UnitOfMeasure;
import com.neesolutions.recipe.repositories.CategoryRepository;
import com.neesolutions.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class indexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public indexController(
            @Autowired CategoryRepository categoryRepository,
            @Autowired UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "index.html", "/index.html", "index", "/index"})
    public String index(){
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat id: "+category.get().getId()+" uom id: "+unitOfMeasure.get().getId());
        return "index";
    }
}
