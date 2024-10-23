public class Main {
    public static void main(String[] args) {
    SingleLinkedList sll = new SingleLinkedList(); 
        System.out.println("Menambahkan objek ke dalam linked list:");
        sll.add("Vadel");
        sll.add("Loli");
        sll.add("Agus");
        sll.add("Fufu Fafa");
        sll.print();
        System.out.println("\nJumlah node dalam linked list: " + sll.umur());
        
        System.out.println("\nMenghapus objek dari linked list:");
        sll.delete(); 
        sll.print();
        System.out.println("\nJumlah node setelah penghapusan: " + sll.umur());
        }
        
}
