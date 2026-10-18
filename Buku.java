public class Buku extends pustaka {
    private int jumlahHalaman;

    public Buku(String judul, String pengarang, int jumlahHalaman){
        super(judul, pengarang);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    @Override 
    public String toString(){
        return super.toString() + " | Halaman: " + jumlahHalaman;




    }

}
