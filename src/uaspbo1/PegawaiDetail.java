package uaspbo1;

public class PegawaiDetail extends Pegawai {

    // Overriding
    public PegawaiDetail(String nama, String nip) {
        super(nama, nip);
    }

    public int getTahunMasuk() {
        return Integer.parseInt(getNip().substring(8, 14));
    }

    public String getDepartemen() {
        String kodeDepartemen = getNip().substring(15);
        switch (kodeDepartemen) {
            case "001":
                return "Departemen Teknologi Informasi";
            case "002":
                return "Departemen Keuangan";
            case "003":
                return "Departemen SDM";
            // Tambahkan case untuk kode departemen lain
            default:
                return "Departemen lain";
        }
    }

    public String getGender() {
        String kodeGender = getNip().substring(14, 15);
        switch (kodeGender) {
            case "1":
                return "Laki - Laki SIGMA";
            case "2":
                return "Perempuan SKIBIDI";
            // Tambahkan case untuk kode departemen lain
            default:
                return "Tidak Ada";
        }
    }

    // Polimorfisme overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun Masuk: " + getTahunMasuk() +
                "\nDepartemen: " + getDepartemen() +
                "\nGender: " + getGender();
    }
}