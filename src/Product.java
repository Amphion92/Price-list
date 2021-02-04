public class Product {

    private String name;
    private Price price;

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
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Price newPrice){
        this.price = newPrice;
    }
}
