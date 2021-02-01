public class Price {

    private int rubles;
    private int kopeeks;

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
    public int getRubles(){
        return rubles;
    }
    public int getKopeeks(){
        return kopeeks;
    }

}
