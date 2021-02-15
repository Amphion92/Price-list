import org.junit.*;
import static org.junit.Assert.*;
public class Tests {

    Price price1 = new Price(10,50);
    Price price2 = new Price(50,25);
    Price price3 = new Price(570,512);

    Product product1 = new Product("Bread", price1);
    Product product2 = new Product("Milk", price2);
    Product product3 = new Product("Car", price3);

    PriceList priceList1 = new PriceList();

    @Test
    public void PriceListTest(){
        assertEquals(10, price1.getRubles());
    }
    @Test
    public void priceListIsExist(){
        assertNotNull(priceList1);
    }
    @Test
    public void addNewProduct(){
        priceList1.addNewProduct(23,product1);
        priceList1.addNewProduct(53,product2);
        priceList1.addNewProduct(83,product3);
        assertEquals(product1, priceList1.getProductByCode(23));
        assertEquals(product2, priceList1.getProductByCode(53));
        assertEquals(product3, priceList1.getProductByCode(83));
        assertNull(priceList1.getProductByCode(832));
    }
    @Test
    public void changePrice(){
        priceList1.addNewProduct(23,product1);
        priceList1.addNewProduct(53,product2);
        priceList1.addNewProduct(83,product3);

        assertEquals(price1, priceList1.getProductByCode(23).getPrice());
        assertEquals(price2, priceList1.getProductByCode(53).getPrice());
        assertEquals(price3, priceList1.getProductByCode(83).getPrice());

        priceList1.changePrice(23, price3);
        priceList1.changePrice(53, price1);
        priceList1.changePrice(83, price2);

        assertEquals(price3, priceList1.getProductByCode(23).getPrice());
        assertEquals(price1, priceList1.getProductByCode(53).getPrice());
        assertEquals(price2, priceList1.getProductByCode(83).getPrice());
    }
    @Test
    public void changeName(){
        priceList1.addNewProduct(23,product1);
        priceList1.addNewProduct(53,product2);
        priceList1.addNewProduct(83,product3);

        assertEquals("Bread", priceList1.getProductByCode(23).getName());
        assertEquals("Milk", priceList1.getProductByCode(53).getName());
        assertEquals("Car", priceList1.getProductByCode(83).getName());

        priceList1.changeName(23,"Kefir");
        priceList1.changeName(53,"Cheese");
        priceList1.changeName(83,"Icecream");

        assertEquals("Kefir", priceList1.getProductByCode(23).getName());
        assertEquals("Cheese", priceList1.getProductByCode(53).getName());
        assertEquals("Icecream", priceList1.getProductByCode(83).getName());
    }
    @Test
    public void removeProduct(){
        priceList1.addNewProduct(23, product1);
        assertNotNull(priceList1.getProductByCode(23));
        priceList1.removeProduct(23);
        assertNull(priceList1.getProductByCode(23));
    }
    @Test
    public void countPriceByCodeAndQuantity(){
        priceList1.addNewProduct(23,product1);
        priceList1.addNewProduct(53,product2);
        priceList1.addNewProduct(83,product3);

        assertEquals(1050,priceList1.countPriceByCodeAndQuantity(23,100).getRubles());
        assertEquals(0,priceList1.countPriceByCodeAndQuantity(23,100).getKopeeks());

        assertEquals(1155,priceList1.countPriceByCodeAndQuantity(53,23).getRubles());
        assertEquals(75,priceList1.countPriceByCodeAndQuantity(53,23).getKopeeks());

        assertEquals(439391,priceList1.countPriceByCodeAndQuantity(83,764).getRubles());
        assertEquals(68,priceList1.countPriceByCodeAndQuantity(83,764).getKopeeks());

    }
}
