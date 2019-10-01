package inheritanceintan;

public class Dosen {
    
    private String nama, nik, jurusan;

    public Dosen() {
    }

    public Dosen(String nama, String nik, String jurusan) {
        this.nama = nama;
        this.nik = nik;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void view(){
        System.out.println("Nama         : "+getNama());
        System.out.println("NIK          : "+getNik());
        System.out.println("Jurusan      : "+getJurusan());
    }
}
