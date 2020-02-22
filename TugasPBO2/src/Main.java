import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        byte pilihan;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1) Segitiga");
            System.out.println("2) Lingkaran");
            System.out.println("3) Keluar");
            System.out.println("Input pilihan : ");
            pilihan = input.nextByte();
            if (pilihan == 1) {
                double alas, tinggiAlas, tinggi;
                
                System.out.print("Alas : ");
                alas = input.nextDouble();
                System.out.print("Tinggi alas : ");
                tinggiAlas = input.nextDouble();
                System.out.print("Tinggi untuk volume : ");
                tinggi = input.nextDouble();
                
                System.out.println("\n--- Segitiga ---");
                Segitiga segi3 = new Segitiga(alas, tinggiAlas);
                System.out.println("Luas Segitiga(Double) : " + segi3.luasSegitiga());
                System.out.println("Luas Segitiga(Int) : " + segi3.luasSegitiga((int) alas, (int) tinggiAlas));
                
                System.out.println("\n--- Prisma Segitiga ---");
                PrismaSegitiga prisma3 = new PrismaSegitiga(alas, tinggi);
                System.out.println("Volume Prisma Segitiga : " + prisma3.Volume(tinggi));
                
                System.out.println("\n--- Limas Segitiga ---");
                LimasSegitiga limas3 = new LimasSegitiga(alas, tinggi);
                System.out.println("Volume Limas Segitiga : " + limas3.Volume(tinggi));
            }
            else if (pilihan == 2) {
                double jariJari, tinggi;
                
                System.out.print("Jari-jari : ");
                jariJari = input.nextDouble();
                System.out.print("Tinggi : ");
                tinggi = input.nextDouble();
                
                System.out.println("\n--- Lingkaran ---");
                Lingkaran ling = new Lingkaran(jariJari);
                System.out.println("Luas Lingkaran(Double) : " + ling.luasLingkaran());
                System.out.println("Luas Lingkaran(Int) : " + ling.luasLingkaran((int)jariJari));
                
                System.out.println("\n--- Tabung ---");
                Tabung tab = new Tabung(jariJari);
                System.out.println("Volume Tabung : " + tab.Volume(tinggi));
                
                System.out.println("\n--- Kerucut ---");
                Kerucut keruc = new Kerucut(jariJari);
                System.out.println("Volume Kerucut : " + keruc.Volume(tinggi));
            }
            else if (pilihan == 3) {
                System.out.println("\nAnda keluar. . .");
            }
        } while(pilihan != 3);
    }
    
}
