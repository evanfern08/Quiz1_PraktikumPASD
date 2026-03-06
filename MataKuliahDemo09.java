import java.util Scanner;
public class MataKuliahDemo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen09[] daftarDosen = new Dosen09[jumlah];

        // input data dosen
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));
            
            System.out.print("NIDN: ");
            String nidn = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Tahun Masuk: ");
            int tahunMasuk = sc.nextInt();
            sc.nextLine();

            System.out.print("Jenjang Pendidikan: ");
            String jenjangPendidikan = sc.nextLine();

            System.out.print("Prodi: ");
            String prodi = sc.nextLine();

            daftarDosen[i] = new Dosen09(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
        }

        // Input data Mata Kuliah
        System.out.println("\n===== INPUT DATA MATA KULIAH =====");

        System.out.print("Kode MK: ");
        String kodeMK = sc.nextLine();

        System.out.print("Nama MK: ");
        String namaMK = sc.nextLine();

        System.out.print("SKS: ");
        int sks = sc.nextInt();

        System.out.print("Jumlah Dosen Pengampu: ");
        int jmlPengampu = sc.nextInt();

        MataKuliah09 mataKuliah = new MataKuliah09(kodeMK, namaMK, sks, jmlPengampu);

        // Menambahkan dosen pengampu ke mata kuliah
        System.out.println("\nDaftar Dosen:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(i + ". " + daftarDosen[i].nama);

        // memilih dosen pengampu
        for (int i = 0; i1 < jmlPengampu; i1++) {

            System.out.print("Pilih indeks dosen pengampu ke-" + (i1 + 1) + ": ");
            int pilihan = sc.nextInt();

            MataKuliah09 mk;
            mk.tambahDosen(daftarDosen[pilihan]);

         // tampilkan data
        System.out.println("\n=== DATA MATA KULIAH ===");
        mk.tampilkanInfo();

        // ubah data
        sc.nextLine();

        System.out.print("\nNama MK Baru: ");
        String namaBaru = sc.nextLine();
        mk.ubahNamaMK(namaBaru);

        System.out.print("SKS Baru: ");
        int sksBaru = sc.nextInt();
        mk.ubahSKS(sksBaru);

        System.out.println("\n=== DATA SETELAH PERUBAHAN ===");
        mk.tampilkanInfo();
        }
    }
}