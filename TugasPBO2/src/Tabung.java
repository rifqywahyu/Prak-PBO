
public class Tabung extends Lingkaran {
    double tinggiTabung;
    private double volume;

    public Tabung(double jariJari){
        super(jariJari);
    }
    
    @Override
    double luasLingkaran (){
        return luas;
    }
    
    double Volume (double tinggi){
        tinggiTabung = tinggi;
        volume = luasLingkaran() * tinggiTabung;
        return volume;
    }
}
