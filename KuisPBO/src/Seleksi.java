
public class Seleksi implements HasilSeleksi{
    protected double nilai1, nilai2, nilai3, nilai4, ratarata;
    protected String hasil;
    
    public Seleksi(double nilai1, double nilai2, double nilai3, double nilai4) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
    }
    
    public double hitungRata() {
        ratarata = (nilai1 + nilai2 + nilai3 + nilai4) / 4.0;
        return ratarata;
    }
    
    @Override
    public String cariHasil() {
        if(ratarata > 85) {
            hasil = "LULUS";
            return hasil;
        }
        else {
            hasil = "GAGAL";
            return hasil;
        }
    }
}
