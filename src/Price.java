public class Price {

    private int rubles;
    private int kopeeks;

    @Override
    public String toString() {
        return String.format("%d.%02d", rubles, kopeeks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        if (rubles != price.rubles) return false;
        return kopeeks == price.kopeeks;
    }

    @Override
    public int hashCode() {
        int result = rubles;
        result = 31 * result + kopeeks;
        return result;
    }

    public Price(int rubles, int kopeeks){
        this.kopeeks = kopeeks;
        this.rubles = rubles;
        if (kopeeks > 100){
            while (this.kopeeks > 100){
                this.rubles += kopeeks / 100;
                this.kopeeks %= 100;
            }
        }
    }
    public Price(int kopeeks){
        this(0, kopeeks);
    }
    public int getRubles(){
        return rubles;
    }
    public int getKopeeks(){
        return kopeeks;
    }
    public int getFullPriceInKopeeks(){
        return rubles*100 + kopeeks;
    }

}
