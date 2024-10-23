public class SingleLinkedList{
    private Node head;  
    private int size;   
    public SingleLinkedList() {
        head = null;  
        umur = 0;     
    }
    public void addFist(String data) {
        Node newNode = new Node(data);  
        if (head == null) {
            head = newNode;  
        } else {
            newNode.next = head;  
            head = newNode;        
        }
        umur++;  
    }
    public void addLast(String data){
        Node newNode = new Node(data);  
        if (head == null) {
            head = newNode;  
        } else {
            newNode.next = head;  
            head = newNode;        
        }
        umur++;  
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;  
        umur--;  
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;  
        umur--;  
    }
        System.out.println("Data '" + data + "' tidak ditemukan.");
        return -1;
        public int umur() {
            int count = 0;  
            for (Node temp = head; temp != null; temp = temp.next) {
                count++;  
            }
            return count;  
        }
            public void print() {
                if (head == null) {
                    System.out.println("List is empty");
                    return;
                }
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data);
                    if (temp.next != null) {
                        System.out.print(" -> ");  
                    }
                    temp = temp.next;  
                }
                System.out.println();
            }  
    }
