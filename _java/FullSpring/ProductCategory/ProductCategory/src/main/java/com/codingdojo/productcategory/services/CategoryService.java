package com.codingdojo.productcategory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.productcategory.models.Category;
import com.codingdojo.productcategory.models.Product;
import com.codingdojo.productcategory.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	// adding the category repository as a dependency
    private final CategoryRepository categoryRepository;
   
    public CategoryService(CategoryRepository categoryRepository) {
    	super();
        this.categoryRepository = categoryRepository;
    }
    
    // returns all the categories
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
    
    // creates a category
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    // retrieves a category
    public Category findCategory(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()) {
            return optionalCategory.get();
        } else {
            return null;
        }
    }
    
    // retrieves a list of all categories for a particular product
    public List<Category> categoriesNotContainsProducts(Product product){
    	return categoryRepository.findByProductsNotContains(product);
    }
    
    // updates a category
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    // deletes a category
    public void deleteCategory(Long id) {
    	categoryRepository.deleteById(id);
    }
}
