
// Definisi kelas
public class Mobil {
    // Atribut
    private String merk;
    private String model;
    private int tahun;

    // Konstruktor
    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    // Metode untuk mendapatkan deskripsi mobil
    public String deskripsi() {
        return tahun + " " + merk + " " + model;
    }

    // Metode untuk menyalakan mesin
    public String nyalakanMesin() {
        return "Mesin dinyalakan!";
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020);
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019);

        // Menggunakan metode dari objek
        System.out.println(mobil1.deskripsi());  // Output: 2020 Toyota Corolla
        System.out.println(mobil2.deskripsi());  // Output: 2019 Honda Civic
        System.out.println(mobil1.nyalakanMesin());  // Output: Mesin dinyalakan!
    }
}