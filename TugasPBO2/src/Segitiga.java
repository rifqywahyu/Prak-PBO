
public class Segitiga {
    
    private double alasDouble, tinggiDouble;
    private int alasInt, tinggiInt;
    static double luas;
    
    Segitiga(double alas, double tinggi) {
        alasDouble = alas;
        tinggiDouble = tinggi; 
    }
    
    double luasSegitiga() {
        luas = alasDouble * tinggiDouble / 2.0 ;
        return luas;
    }
    
    int luasSegitiga(int alas, int tinggi) {
        alasInt = alas;
        tinggiInt = tinggi;
        luas = alasInt * tinggiInt / 2 ;
        return (int) luas;
    }
    
}
