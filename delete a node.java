import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
  }  
}
class Main{
  Node head;
  Node add(int d){
    Node temp=new Node(d);
    if(head==null)
    {
      head=temp;
      return head;
    }
    else
    {
      Node t=head;
      while(t.next!=null)
      {
        t=t.next;
      }
      t.next=temp;
      return head;
    }
  }
    void display(Node head)
    {
      Node t=head;
      while(t!=null)
      {
        System.out.println(t.data);
        t=t.next;
      } 
    }
    Node delete(int pos)
    {
      Node m=head;
      for(int i=0;i<pos-2;i++)
      {
           m=m.next;
      }
      Node l=m;
      l.next=m.next.next;
      return head;
    }
    public static void main(String [] args)
    {
      Main obj=new Main();
      Scanner sc =new Scanner(System.in); 
      System.out.println("enter the number of nodes");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
         System.out.println("enter the data part");
         int p=sc.nextInt();
         Node head1=obj.add(p);
      }
       System.out.println("enter the postion which is to be deleted");
       int pos=sc.nextInt();
       Node head1=obj.delete(pos);
       obj.display(head1);
    }
  }
