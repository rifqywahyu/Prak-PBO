
public class Kerucut extends Lingkaran {
    double tinggiKerucut;
    private double volume;
    
    public Kerucut(double jariJari){
        super(jariJari);
    }
    
    @Override
    double luasLingkaran(){
        return luas;
    }
    
    double Volume(double tinggi){
        tinggiKerucut = tinggi;
        volume = luasLingkaran() * tinggiKerucut * 1.0/3.0;
        return volume;
    }
}
