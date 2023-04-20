package Latihan2;
import java.util.Scanner;

// Superclass
class Karyawan
{
    String nama;
    int tunjangan_anak = 500000;
    int total_upah;
    int total_gaji;
}

// Subclass
class KaryawanTetap extends Karyawan
{
    int gaji_pokok = 1500000;

    //method untuk menghitung total gaji 
    public void totalGaji()
    {
        Scanner nm = new Scanner (System.in);
        System.out.print("Masukkan Nama             : ");
        nama = nm.nextLine();

        total_gaji = gaji_pokok + tunjangan_anak;
        System.out.println("Total Gaji Sebesar Rp " + total_gaji); 
    }

}

//Subclass
class KaryawanKontrak extends Karyawan
{
    int upah_harian = 200000;
    int jumlah_hari_masuk;

    //method untuk menghitung total upah
    public void totalUpah()
    {
        Scanner nm = new Scanner(System.in);
        System.out.print("Masukkan Nama             : ");
        nama = nm.nextLine();

        Scanner hari = new Scanner (System.in);
        System.out.print("Masukan Jumlah Hari Masuk : ");       
        jumlah_hari_masuk = hari.nextInt();

        total_upah = (upah_harian * jumlah_hari_masuk) + tunjangan_anak;
        System.out.println("Total Upah Sebesar Rp " + total_upah); 
    }
}

public class Karyawan2
{
    public static void main(String[] args)
    {
        int pil;
        Scanner ulang = new Scanner(System.in);

        do
        {
            Scanner input = new Scanner(System.in);
            
            KaryawanTetap karyawantetap = new KaryawanTetap();
            KaryawanKontrak karyawankontrak = new KaryawanKontrak();

            System.out.println();
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.print("Masukkan Pilihan : ");
            pil = input.nextInt();
            System.out.println();

            if (pil == 1)
            {
                karyawantetap.totalGaji();
            }
            else if (pil == 2)
            {
                karyawankontrak.totalUpah();
            }
            else 
            {
                System.out.println("Maaf, Tidak tersedia");
            }
            System.out.print("Input Pilihan lagi [Y/T]? ");
        } while (ulang.nextLine().equalsIgnoreCase("Y"));
    }
    
}


