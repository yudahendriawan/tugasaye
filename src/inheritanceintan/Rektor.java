package inheritanceintan;

public class Rektor extends Dosen {
     private int tahunMulai, jabatanKe;



    public Rektor(int tahunMulai, int jabatanKe, String nama, String nik, String jurusan) {
        super(nama, nik, jurusan);
        this.tahunMulai = tahunMulai;
        this.jabatanKe = jabatanKe;
    }

    public Rektor() {
    }

    public int getTahunMulai() {
        return tahunMulai;
    }

    public void setTahunMulai(int tahunMulai) {
        this.tahunMulai = tahunMulai;
    }

    public int getJabatanKe() {
        return jabatanKe;
    }

    public void setJabatanKe(int jabatanKe) {
        this.jabatanKe = jabatanKe;
    }
     
    public void viewRektor(){
        super.view();
        System.out.println("Tahun Mulai  : "+getTahunMulai());
        System.out.println("Jabatan Ke   : "+getJabatanKe());
    }
    
    
}
