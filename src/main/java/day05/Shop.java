package day05;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product item) {
        products.add(item);
    }

    public List<ProductNumberByType> getProductNumberByType() {
        List<ProductNumberByType> result = new ArrayList<>();

        for (Product actual : products) {
            ProductNumberByType productNumberByType = containsProduct(actual, result);
            if (productNumberByType != null) {
                productNumberByType.addCount();
            } else {
                result.add(new ProductNumberByType(actual.getType()));
            }
        }
        return result;
    }

    private ProductNumberByType containsProduct(Product actual, List<ProductNumberByType> result) {
        for (ProductNumberByType pwp : result) {
            if (actual.getType() == pwp.getType()) {
                return pwp;
            }
        }
        return null;
    }
}
