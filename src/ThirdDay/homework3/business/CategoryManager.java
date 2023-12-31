package ThirdDay.homework3.business;

import ThirdDay.homework3.core.logging.Logger;
import ThirdDay.homework3.dataAccess.CategoryDao;
import ThirdDay.homework3.entities.Category;


import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Category> dbCategory;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> category, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.dbCategory = category;
        this.loggers = loggers;
    }

    public void add(Category category) {
        for (Category c : dbCategory) {
            if (c.getName() == (category.getName())) {
                System.out.println("Kategori ismi tekrar edemez");
            }
        }
        categoryDao.add(category);
        for (Logger l : loggers) {
            l.log(category.getName());
        }
    }
}
