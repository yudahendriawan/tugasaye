package inheritanceintan;

public class Inheritance {

    public static void main(String[] args) {
        Dosen dosen = new Dosen("Intan", "06111740000021", "Matematika");
        Rektor rektor = new Rektor (2019, 1, "Ayu", "06111740000021", "Matematika");
        Dekan dekan = new Dekan ("FMKSD", "Puspitasari", "06111740000021", "Matematika");
        Kalab kalab = new Kalab ("ILKOM", "Intan Puspitasari", "06111740000021", "Matematika");
        
        dosen.view();
        System.out.println("==================================================");
        rektor.view();
        rektor.viewRektor();
        System.out.println("==================================================");
        dekan.view();
        dekan.viewDekan();
        System.out.println("==================================================");
        kalab.view();
        kalab.viewKalab();
        
    }
    
}
