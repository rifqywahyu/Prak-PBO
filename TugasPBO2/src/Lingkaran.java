
public class Lingkaran {
    private double jariDouble;
    private int jariInt;
    private double pi = 3.14;
    static double luas;
    
    Lingkaran(double jariJari) {
        jariDouble = jariJari;
    }
    
    double luasLingkaran(){
        luas = pi * Math.pow(jariDouble,2);
        return luas;
    }
    
    int luasLingkaran(int jariJari){
        jariInt = jariJari;
        luas = pi * Math.pow(jariInt,2);
        return (int) luas;
    }
}
