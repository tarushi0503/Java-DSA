import java.util.Scanner;

public class LinkedList {
    
    Node head;
    
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }
    
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Node temp = new Node(-1);
        for(int i=0; i<n;i++) {
            if(temp.data == -1) {
                llist.head = new Node(Integer.parseInt(sc.nextLine()));
                temp = llist.head;
            }else{
                String in = sc.nextLine();
                if(in != "") {
                    temp.next = new Node(Integer.parseInt(in));
                    temp = temp.next;
                }
            }
        }
        
        // printing the Linked List
        System.out.println("Linked List:");
        temp = llist.head;
        int cnt=0;
        for(int i=0; i<n; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }
}
