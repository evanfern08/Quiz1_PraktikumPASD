import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA DOSEN =====");

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

        Dosen09 dosen = new Dosen09(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);

        System.out.println("\n==== DATA DOSEN ====");
        dosen.tampilkanInfo();
        System.out.println("\n==== UBAH DATA DOSEN ====");
        System.out.print("Prodi Baru: ");
        String prodiBaru = sc.nextLine();
        dosen.ubahProdi(prodiBaru);

        System.out.print("Pendidikan Baru: ");
        String pendidikanBaru = sc.nextLine();
        dosen.ubahPendidikan(pendidikanBaru);

        System.out.println("\n=== DATA SETELAH DIUBAH===");
        dosen.tampilkanInfo();
    }
}
