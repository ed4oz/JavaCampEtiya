package ThirdDay.oopWithNLayeredApp.business;

import ThirdDay.oopWithNLayeredApp.core.logging.Logger;
import ThirdDay.oopWithNLayeredApp.dataAccess.JDBCProductDao;
import ThirdDay.oopWithNLayeredApp.dataAccess.ProductDao;
import ThirdDay.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //business rules
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
