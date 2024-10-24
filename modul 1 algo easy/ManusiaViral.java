public class ManusiaViral {
    String nama;
    String skills;
    int umur;
    String hobi;
    ManusiaViral next; 

    public ManusiaViral(String nama, String skills, int umur, String hobi) {
        this.nama = nama;
        this.skills = skills; 
        this.umur = umur;
        this.hobi = hobi;
        this.next = null;
    }
}