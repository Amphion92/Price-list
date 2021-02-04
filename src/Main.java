public class Main {
    public static void main(String[] args) {
        Price priceOnKefir = new Price(12,50);
        Product Kefir = new Product("Кефир", priceOnKefir);
        PriceList shop = new PriceList();
        shop.addNewProduct(34, Kefir);
        System.out.println(shop.getProductByCode(34).getName());
        shop.setName(34, "Молоко");
        System.out.println(shop.getProductByCode(34).getName());
        System.out.println(shop.countPriceByCodeAndQuantity(34,100).getRubles());
        System.out.println(shop.countPriceByCodeAndQuantity(34,100).getKopeeks());
    }
}