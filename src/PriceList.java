import java.util.*;

public class PriceList {
    private Map<Integer,Product> priceList = new HashMap<>();

    public void addNewProduct(Integer code, Product product){
        priceList.put(code, product);
    }
    public void removeProduct(Integer code){
        priceList.remove(code);
    }
    public Product getProductByCode(Integer code){
        return priceList.get(code);
    }
    public void setName(Integer code, String newName){
        priceList.get(code).setName(newName);
    }
    public Price countPriceByCodeAndQuantity(Integer code, int quantity){
        int copeeks = (priceList.get(code).getPrice().getKopeeks()) + (priceList.get(code).getPrice().getRubles() * 100);
        return new Price(0,copeeks*quantity);
    }
}
