package program;

/**
 *
 * @author Taufik_Amaryansyah
 */
public class Handphone {
    //deklarasi
    private String merk, tipe, warna;
    private double harga,diskon;

    //setter
    public void setMerk(String merk){
        this.merk=merk;
    }
    public void setTipe(String tipe){
        this.tipe=tipe;
    }
    public void setWarna(String colour){
        this.warna=colour;
    }
    public void setHarga(double harga){
        this.harga=harga;
    }
    //getter
    public String getMerk(){
        return merk;
    }
    public String getTipe(){
        return tipe;
    }
    public String getWarna(){
        return warna;
    }
    public double getHarga(){
        return harga;
    }
    // Method tambahan
    public void HargaDiskon() {
        this.harga = harga-(harga*10/100);
        System.out.println("Harga Hp \t: " + harga);
    }
    public void keterangan(){
        System.out.println("Hargas Sesudah Diskon \t: "+ getHarga());
    }
   
}
