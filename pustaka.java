public class pustaka{
    private String judul;
    private String pengarang;
    private boolean tersedia;
    public pustaka(String judul, String pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tersedia = true;
    }
    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;        
    }
    public String getJudul() {
        return this.judul;
    }

    @Override 
    public String toString(){
        String status = tersedia ? "Tersedia" : "Dipinjam";
      return "Judul: "+ judul +" | Pengarang: " + pengarang + " | Status: " + status;
    }


    }
