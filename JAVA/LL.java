package JAVA;

public class LL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void add(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }

    public void display(){
        Node c=head;
        if(head==null){
            System.out.println("empty");
        }
        while(c != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(c.data + " ");    
            c = c.next;     
        }    
    }


     public void reverse(){
        Node prev=null;
        Node forw=null;
        Node curr=head;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        head=prev;
    }

    public void delete(int data){
        Node prev=null;
        Node curr=head;
        while(curr!=null || curr.data!=data){
            prev=curr;
            curr=curr.next;
        }
        if(curr!=null){
            prev.next=curr.next;
        }
        else{
            System.out.println("value not present in linked list");
        }
    }

    public static void main(String[] args){
        LL a=new LL();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(6);
        a.display();
        a.delete(3);
        a.display();  
        a.reverse();
        a.display();  
       
}
}
