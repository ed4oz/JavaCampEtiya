package ThirdDay.homework3.dataAccess;

import ThirdDay.homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori hibernate ile veritabanına eklendi: "+ category.getName());
    }
}
