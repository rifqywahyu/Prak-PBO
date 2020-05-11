import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pilih,jumlah;
        String nama,nim;
        double nilaiTulis, nilaiCoding, nilaiWawancara, nilaiMicro, nilaiJaringan;
        
        do {
            System.out.println("\n--- MENU PENDAFTARAN ---");
            System.out.println("1) Seleksi Asisten Lab");
            System.out.println("2) Seleksi Admin Lab");
            System.out.println("3) Keluar");
            System.out.println("Pilihan : ");
            pilih = input.nextByte();
            if(pilih == 1) {
                System.out.println("\n --- FORM PENDAFTARAN ASISTEN LAB ---");
                System.out.println("Input Jumlah Data : ");
                jumlah = input.nextByte();
                try {
                    if(jumlah < 1) {
                        throw new RuntimeException("Jumlah Data Tidak Bisa < 1");
                    }
                    for(int i = 1; i <= jumlah; i++) {
                        System.out.println("\nInput Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.println("Input NIM : ");
                        nim = input.nextLine();
                        System.out.println("Input Nilai Test Tulis : ");
                        nilaiTulis = input.nextDouble();
                        System.out.println("Input Nilai Test Praktek Coding : ");
                        nilaiCoding = input.nextDouble();
                        System.out.println("Input Nilai Test Wawancara : ");
                        nilaiWawancara = input.nextDouble();
                        System.out.println("Input Nilai Test Microteaching : ");
                        nilaiMicro = input.nextDouble();
                        
                        if(nilaiTulis > 100 || nilaiTulis < 1 || nilaiCoding > 100 || nilaiCoding <1 || nilaiWawancara > 100 || nilaiWawancara < 1 || nilaiMicro > 100 || nilaiMicro < 1) {
                            throw new RuntimeException("Besar Nilai Invalid");
                        }
                        
                        Seleksi selek = new Seleksi(nilaiTulis, nilaiCoding, nilaiWawancara, nilaiMicro);
                        
                        System.out.println("\nHasil Akhir : " + selek.hitungRata());
                        if (selek.hitungRata() > 85) {
                            System.out.println("Hasil Seleksi : " + selek.cariHasil());
                            System.out.println(nim + ", " + nama + " Dinyatakan Lolos Dalam Seleksi Asisten Lab. Selamat!");
                        }
                        else {
                            System.out.println("Hasil Seleksi : " + selek.cariHasil());
                            System.out.println(nim + ", " + nama + " Dinyatakan Gagal Dalam Seleksi Asisten Lab. Maaf!");
                        }
                        
                    }
                }
                catch(Exception e) {
                    System.err.println(e);
                }
            }
            else if(pilih == 2) {
                System.out.println("\n --- FORM PENDAFTARAN ADMIN LAB ---");
                System.out.println("Input Jumlah Data : ");
                jumlah = input.nextByte();
                try {
                    if(jumlah < 1) {
                        throw new RuntimeException("Jumlah Data Tidak Bisa < 1");
                    }
                    for(int i = 1; i <= jumlah; i++) {
                        System.out.println("\nInput Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.println("Input NIM : ");
                        nim = input.nextLine();
                        System.out.println("Input Nilai Test Tulis : ");
                        nilaiTulis = input.nextDouble();
                        System.out.println("Input Nilai Test Praktek Coding : ");
                        nilaiCoding = input.nextDouble();
                        System.out.println("Input Nilai Test Wawancara : ");
                        nilaiWawancara = input.nextDouble();
                        System.out.println("Input Nilai Test Praktek Jaringan : ");
                        nilaiJaringan = input.nextDouble();
                        
                        if(nilaiTulis > 100 || nilaiTulis < 1 || nilaiCoding > 100 || nilaiCoding <1 || nilaiWawancara > 100 || nilaiWawancara < 1 || nilaiJaringan > 100 || nilaiJaringan < 1) {
                            throw new RuntimeException("Besar Nilai Invalid");
                        }
                        
                        Seleksi selek = new Seleksi(nilaiTulis, nilaiCoding, nilaiWawancara, nilaiJaringan);
                        
                        System.out.println("\nHasil Akhir : " + selek.hitungRata());
                        if (selek.hitungRata() > 85) {
                            System.out.println("Hasil Seleksi : " + selek.cariHasil());
                            System.out.println(nim + ", " + nama + " Dinyatakan Lolos Dalam Seleksi Admin Lab. Selamat!");
                        }
                        else {
                            System.out.println("Hasil Seleksi : " + selek.cariHasil());
                            System.out.println(nim + ", " + nama + " Dinyatakan Gagal Dalam Seleksi Admin Lab. Maaf!");
                        }
                        
                    }
                }
                catch(Exception e) {
                    System.err.println(e);
                }
            }
            else if(pilih == 3) {
                System.out.println("\nKeluar Dari Program. . .");
            }
            else {
                System.out.println("\nInput Pilihan Tidak Tersedia. . .");
            }
        } while(pilih!=3);
    }
    
}
