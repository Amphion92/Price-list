import java.util.*;

public class PriceList {
    private Map<Integer,Product> priceList = new HashMap<>();
    public Price countPriceByCodeAndQuantity(Integer code, int quantity){
        return new Price(priceList.get(code).getPrice().getFullPriceInKopeeks()*quantity);
    }
    public Product getProductByCode(Integer code){
        return priceList.get(code);
    }
    public void addNewProduct(Integer code, Product product){
        if (priceList.putIfAbsent(code, product) != null){
            throw new IllegalArgumentException("Продукт с таким кодом уже существует!");
        }
    }
    public boolean removeProduct(Integer code){
        return priceList.remove(code) != null;
    }
    public void changeName(Integer code, String newName){
        Product product = getProductByCode(code);
        if (product == null) throw new IllegalArgumentException("Продукта с таким кодом не существует!");
        Price price = product.getPrice();
        Product newProduct = new Product(newName, price);
        priceList.put(code, newProduct);
    }
    public void changePrice(Integer code, Price price){
        Product product = getProductByCode(code);
        if (product == null) throw new IllegalArgumentException("Продукта с таким кодом не существует!");
        String name = product.getName();
        Product newProduct = new Product(name, price);
        priceList.put(code, newProduct);
    }

}
