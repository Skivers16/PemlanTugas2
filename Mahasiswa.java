public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;

    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

   

    @Override
    public String toString() {
        return nim + " | " + nama + " | " + alamat;
    }
}
