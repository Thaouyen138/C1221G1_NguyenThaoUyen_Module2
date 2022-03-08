package ss12_java_collection_fame_work.bai_tap;

import java.util.Comparator;

public class ProductManagerSort extends Product implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
