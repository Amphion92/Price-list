import java.util.Objects;

public class Product {

    private String name;
    private Price price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) &&
                price.equals(product.price);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public Product(String name, Price price){
        this.name = name;
        this.price = price;
    }
    public Price getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
}
