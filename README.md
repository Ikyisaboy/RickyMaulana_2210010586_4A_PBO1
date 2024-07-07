# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NIP pegawai, dan memberikan output berupa informasi detail dari NIP tersebut seperti tahun masuk, departemen, dan gender.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. *Class* adalah template atau blueprint dari object. Pada kode ini, Pegawai, PegawaiDetail, dan PegawaiBeraksi adalah contoh dari class.

bash
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
    ...

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
    ...

public class PegawaiBeraksi {
public static void main(String[] args) {
        // Error handling
        try {
            // IO sederhana
            Scanner scanner = new Scanner(System.in);

            // Array
            PegawaiDetail[] pegawai = new PegawaiDetail[2];

            // Perulangan biasa
            for (int i = 0; i < pegawai.length; i++) {
                System.out.print("Masukkan Nama Pegawai " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIP Pegawai " + (i + 1) + ": ");
                String nip = scanner.nextLine();

                // Objek
                pegawai[i] = new PegawaiDetail(nama, nip);
            }

            // Perulangan array
            for (PegawaiDetail data : pegawai) {
                System.out.println("====================");
                System.out.println("Data Pegawai: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format NIP: "  + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
}
}
}

    ...



2. *Object* adalah instance dari class. Pada kode ini, pegawai[i] = new PegawaiDetail(nama, nip); adalah contoh pembuatan object.

bash
pegawai[i] = new PegawaiDetail(nama, nip);


3. *Atribut* adalah variabel yang ada dalam class. Pada kode ini, nama dan nip adalah contoh atribut.

bash
String nama;
String nip;


4. *Constructor* adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Pegawai dan PegawaiDetail.

bash
public Pegawai(String nama, String nip) {
    this.nama = nama;
    this.nip = nip;
}

public PegawaiDetail(String nama, String nip) {
    super(nama, nip);
}


5. *Mutator* atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setNama dan setNip adalah contoh method mutator.

bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNip(String nip) {
    this.nip = nip;
}


6. *Accessor* atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getNama, getNip, getTahunMasuk, getDepartemen, getGender, adalah contoh method accessor.

bash
public String getNama() {
    return nama;
}

public String getNip() {
    return nip;
}


7. *Encapsulation* adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama dan nip dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

bash
private String nama;
private String nip;


8. *Inheritance* adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, PegawaiDetail mewarisi Pegawai dengan sintaks extends.

bash
public classPegawaiDetail extends Pegawai {
    ...
}


9. *Polymorphism* adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di Mahasiswa merupakan overloading method displayInfo dan displayInfo di MahasiswaDetail merupakan override dari method displayInfo di Mahasiswa.

bash

@Override
public String displayInfo() {
    return super.displayInfo() +
                "\nTahun Masuk: " + getTahunMasuk() +
                "\nDepartemen: " + getDepartemen() +
                "\nGender: " + getGender();
}
}


10. *Seleksi* adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getFakultas dan seleksi switch dalam method getProdi.

bash
public String getDepartemen() {
    String kodeDepartemen = getNip().substring(15);
    switch (KodeDepartemen) {
    case "001":
        return "Departemen Teknologi Informasi";
    case "002":
        return "Departemen Keuangan";
    case "003":
        return "Departemen SDM";
    // Tambahkan case untuk kode departemen lain   
    default
        return "Departemen lain";
    }
}

public String getProdi() {
    switch(getNpm().substring(4, 6)) {
        case "01":
            return "Teknik Informatika";
        case "02":
            return "Sistem Informasi";
        default:
            return "Prodi lain";
    }
}


11. *Perulangan* adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

bash
for (int i = 0; i < pegawai.length; i++) {
    // Objek
    pegawai[i] = new PegawaiDetail(nama, nip);
}


12. *Input Output Sederhana* digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pegawai " + (i + 1) + ": ");
String nama = scanner.nextLine();
System.out.print("Masukkan Nip Pegawai " + (i + 1) + ": ");
String nip = scanner.nextLine();

System.out.println("====================");
System.out.println("Data Pegawai: ");
System.out.println(data.displayInfo());


13. *Array* adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2]; adalah contoh penggunaan array.

bash
PegawaiDetail[] pegawai = new PegawaiDetail[2];


14. *Error Handling* digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

bash
try {
} catch (NumberFormatException e) {
    System.out.println("Kesalahan format nomor: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan format NIP: " + e.getMessage());
} catch (Exception e) {
    System.out.println{("Kesalahan umum: " + e.getMessage());


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | *TOTAL*      | *100* |

## Pembuat

Nama: Ricky Maulana
NPM: 2210010586
