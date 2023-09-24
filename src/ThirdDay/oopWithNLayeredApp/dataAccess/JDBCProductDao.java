package ThirdDay.oopWithNLayeredApp.dataAccess;

import ThirdDay.oopWithNLayeredApp.entities.Product;

public class JDBCProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
