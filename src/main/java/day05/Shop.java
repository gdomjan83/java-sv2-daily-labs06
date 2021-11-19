package day05;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(Product item) {
        products.add(item);
    }

    public List<ProductWithPiece> giveProductNumberByType() {
        List<ProductWithPiece> result = new ArrayList<>();
        for (Product actual : products) {
            ProductWithPiece productWithPiece = containsProduct(actual, result);
            if (productWithPiece != null) {
                productWithPiece.addCount();
            } else {
                result.add(new ProductWithPiece(actual.getType()));
            }
        }
        return result;
    }

    private ProductWithPiece containsProduct(Product actual, List<ProductWithPiece> result) {
        for (ProductWithPiece pwp : result) {
            if (actual.getType() == pwp.getType()) {
                return pwp;
            }
        }
        return null;
    }
}
