
public class LimasSegitiga extends Segitiga {
    double tinggiLimas;
    private double volume;
    
    public LimasSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    @Override
    double luasSegitiga(){
        return luas;
    }
    
    double Volume(double tinggi){
        tinggiLimas = tinggi;
        volume = luasSegitiga() * tinggiLimas * 1.0/3.0;
        return volume;
    }
}
