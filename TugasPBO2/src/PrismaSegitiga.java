
public class PrismaSegitiga extends Segitiga {
    double tinggiPrisma;
    private double volume;
    
    public PrismaSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    @Override
    double luasSegitiga(){
        return luas;
    }
    
    double Volume(double tinggi){
        tinggiPrisma = tinggi;
        volume = luasSegitiga() * tinggiPrisma;
        return volume;
    }
}
