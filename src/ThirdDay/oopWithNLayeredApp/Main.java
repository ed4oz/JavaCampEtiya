package ThirdDay.oopWithNLayeredApp;

import ThirdDay.oopWithNLayeredApp.business.ProductManager;
import ThirdDay.oopWithNLayeredApp.core.logging.DatabaseLogger;
import ThirdDay.oopWithNLayeredApp.core.logging.FileLogger;
import ThirdDay.oopWithNLayeredApp.core.logging.Logger;
import ThirdDay.oopWithNLayeredApp.dataAccess.JDBCProductDao;
import ThirdDay.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 9000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        ProductManager productManager = new ProductManager(new JDBCProductDao(), loggers);
        productManager.add(product1);

    }
}
