import java.util.*;
class Node {
    int data;
    Node next=null;
}
class LL{
    Node head,temp,current,prev;
    int i=1;
    Scanner sc= new Scanner(System.in);
    
    //method to insert data in linkedlist
    void insert(){
        System.out.println("Enter no of nodes:");
        int n=sc.nextInt();
        while(i<=n) {
            Node new_node= new Node();
            System.out.println("Enter data in node "+i);
            new_node.data=sc.nextInt();
            current=new_node;
            if(head==null){
            head=current;
            }
            else{
                temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                } 
                temp.next=current;
            }
            i++;
          }
        }
        
        //method to display data from linkedlist
    void display(){
        current = head;         
        if(head == null) {    
        System.out.println("List is empty");    
        return;   
    }
    else{    
    System.out.println("Nodes of linked list: ");    
    while(current != null) {     
        System.out.print(current.data + " ");    
        current = current.next;    
    }   
    System.out.println();
}
}
}
public class Main{
public static void main(String[] args) {
LL obj= new LL();
    obj.insert();
    obj.display();
   
}
}
