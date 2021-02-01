public class Main {
    public static void main(String[] args) {
        /*Price newPrice = new Price(12,234);
        Price newPrice2 = new Price(123,23);
        Product test = new Product("Кефир",12, newPrice);
        System.out.println(test.getName());
        test.setName("Сок");
        System.out.println(test.getName());
        System.out.println(test.getPrice().getRubles());
        System.out.println(test.getPrice().getKopeeks());
        test.setPrice(newPrice2);
        System.out.println(test.getName());
        System.out.println(test.getPrice().getRubles());
        System.out.println(test.getPrice().getKopeeks());
        */
        PriceList New = new PriceList();
        Price kefirPrice = new Price(45,12)
        Product kefir = new Product("Кефир", 1, kefirPrice);
        New.addNewProduct(kefir);
        System.out.printf();
    }
}