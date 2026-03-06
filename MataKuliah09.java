public class MataKuliah09 {

    String kodeMK;
    String namaMK;
    int sks;
    Dosen09[] dosenPengampu;
    int jumlahDosen;

    public MataKuliah09(String kodeMK, String namaMK, int sks, int kapasitasDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new Dosen09[kapasitasDosen];
        this.jumlahDosen = 0;
    }

    // Menampilkan info MataKuliah
    public void tampilkanInfo() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + namaMK);
        System.out.println("SKS         : " + sks);

        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("- " + dosenPengampu[i].nama);
        }
    }

    // Mengubah nama Mata Kuliah
    public void ubahNamaMK(String namaMK) {
        namaMK = namaMK;
    }

    // Mengubah SKS dengan Validasi
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2){
            sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }

    // Menambah dosen pengampu
    public void tambahDosen(Dosen09 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Kapasitas dosen pengampu sudah penuh!");
        }
    }
}