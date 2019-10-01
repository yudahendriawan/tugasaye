package inheritanceintan;

public class Dekan extends Dosen{
    private String fakultas;



    public Dekan(String fakultas, String nama, String nik, String jurusan) {
        super(nama, nik, jurusan);
        this.fakultas = fakultas;
    }

    public Dekan() {
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    public void viewDekan(){
        System.out.println("Fakultas     : "+getFakultas());
    }
    
}
