package uaspbo1;

public class Pegawai {
    //atribut dan enkapsulasi
    private String nama;
    private String nip;
    
    //konstruktor
    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    
    //polimorfisme
    public String displayInfo(){
        return "Nama: "+getNama()+
                "\nNIp: "+getNip();
    }
}