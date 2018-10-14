package program;
/**
 *
 * @author Taufik_Amaryansyah
 */
import java.util.Scanner;
public class utama {
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        Handphone Hp = new Handphone();
        System.out.print("Masukan Merk HP : ");
        Hp.setMerk(s.nextLine());
        System.out.print("Masukan Tipe Hp : ");
        Hp.setTipe (s.nextLine());
        System.out.print("Masukan warna Hp : ");
        Hp.setWarna (s.nextLine());
        System.out.print("Masukan Harga Hp : ");
        double sHarga = s.nextDouble();
        Hp.setHarga(sHarga);
        //output
        System.out.println("=================================");
        System.out.println("Daftar Harga Ponsel & Spesifikasi");
        System.out.println("=================================");
        System.out.println("Merk Hp \t: " + Hp.getMerk());
        System.out.println("Tipe Hp \t: "+ Hp.getTipe());
        System.out.println("Warna Hp \t: "+ Hp.getWarna());
        Hp.HargaDiskon();
        System.out.println("Harga Sebelum Diskon \t: "+ Hp.getHarga());
        Hp.keterangan();
    }
    
}
