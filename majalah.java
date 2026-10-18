public class majalah extends pustaka{
    private String edisi;

    public majalah(String judul, String pengarang, String edisi){
    super(judul, pengarang);
    this.edisi = edisi;
    }
    @Override 
    public String toString(){
        return super.toString() + " | Edisi: "+ edisi;




    }


}
