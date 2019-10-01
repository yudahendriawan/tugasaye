package inheritanceintan;

public class Kalab extends Dosen {
    private String laboratorium;
    
    public Kalab(String laboratorium, String nama, String nik, String jurusan){
        super(nama, nik, jurusan);
        this.laboratorium = laboratorium;
    }

    public Kalab() {
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public void setLaboratorium(String laboratorium) {
        this.laboratorium = laboratorium;
    }
    
    public void viewKalab(){
        System.out.println("Laboratorium : "+getLaboratorium());
    }
    
    public void view(){
        super.view();
        System.out.println("");
    }
    
}
