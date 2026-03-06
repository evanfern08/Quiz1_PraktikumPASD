public class Dosen09 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen09(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    // Menampilkan Info Dosen
    public void tampilkanInfo() {
        System.out.println("NIDN                : " + nidn);
        System.out.println("Nama                : " + nama);
        System.out.println("Tahun Masuk         : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan  : " + jenjangPendidikan);
        System.out.println("Prodi               : " + prodi);
    }
    // Mengubah Prodi
    public void ubahProdi(String prodiBaru) {
        prodi = prodiBaru;
    }

     // Mengubah Pendidikan
    public void ubahPendidikan(String pendidikanBaru) {
        jenjangPendidikan = pendidikanBaru;
     }
}