public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Cara menanam sawit", "Wowok", 320);
        majalah majalah1 = new majalah("Persediaan lapangan pekerjaan", "Adi", "Edisi Oktober 2026");

        System.out.println("=== Status Awal Pustaka ===");
        System.out.println("Buku    : " + buku1.toString());
        System.out.println("Majalah : " + majalah1.toString());

        System.out.println("\n=== Proses Peminjaman ===");
        buku1.setTersedia(false);
        System.out.println("Mahasiswa telah meminjam buku " + buku1.getJudul());

        System.out.println("\n=== Status Setelah Peminjaman ===");
        System.out.println("Buku    : " + buku1.toString());
        System.out.println("Majalah : " + majalah1.toString());
    }
}