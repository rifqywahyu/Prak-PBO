import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Nama;
        int nilai[] = new int[5];
        int tertinggi, terendah;
        float ratarata = 0;
        
        System.out.print("Input Nama : ");
        Nama = input.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
            ratarata += nilai[i];
        }
        
        tertinggi = nilai[0];
        terendah = nilai[0];
        
        for (int i = 0; i < 5; i++) {
            if (tertinggi < nilai[i]) {
                tertinggi = nilai[i];
            }
            else if (terendah > nilai[i]) {
                terendah = nilai[i];
            }
        }
        
        ratarata = ratarata / 5;
        
        System.out.println("");
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("Rata-rata Nilai : " + ratarata);
    }
    
}
