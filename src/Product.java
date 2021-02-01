public class Product {

    private String name;
    private int code;
    private Price price;

    public Product(String name, int code, Price price){
        this.name = name;
        this.code = code;
        this.price = price;
    }
    public Price getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public int getCode(){
        return code;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(Price newPrice){
        this.price = newPrice;
    }
}
