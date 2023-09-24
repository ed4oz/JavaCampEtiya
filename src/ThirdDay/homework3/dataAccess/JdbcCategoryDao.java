package ThirdDay.homework3.dataAccess;

import ThirdDay.homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile veritabanına eklendi: "+ category.getName());
    }
}
