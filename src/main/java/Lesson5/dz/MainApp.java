package Lesson5.dz;

public class MainApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);

//            Product product = new Product("Egg", 40);
//            productDao.saveOrUpdate(product);
//            Product product = new Product("Apple", 65);
//            productDao.save(product);
//            productDao.update(6L, "Banana");
//            System.out.println(productDao.findAll());
//            System.out.println(productDao.findById(1L));
//            System.out.println(productDao.findAll());
//
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shotdown();
        }
    }
}

