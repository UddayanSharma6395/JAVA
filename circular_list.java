public class Circular_Linked_List {
   public static class Node{
             int data;
             Node next;
    }
    public static class LinkedlIst1{
       Node Head;
       Node Tail;
       int size;
       void addLast(int val){
           Node node = new Node();
           node.data= val;
           if(size == 0){
               Head=Tail=node;
           }
           Tail.next=node;
           Tail=node;
           node.next=Head;
           size++;
       }
       void  display(){
           Node temp = Head;
           while (temp.next != Head){
               System.out.print(temp.data+ " ");
               temp=temp.next;
           }
           System.out.print(temp.data);

       }
       void addFirst(int elem){
           Node node = new Node();
           node.data=elem;
           node.next=null;
           if(size ==0){
               Head= Tail= node;
           }

           else {
               node.next = Head;
               Head = node;
           }
           Tail.next=Head;
           size++;

       }
       void DeleteFirst(){

           Head=Head.next;
           size--;
           Tail.next=Head;
       }
       

    }

    public static void main(String[] rgs) {
         LinkedlIst1  ll = new LinkedlIst1();
         ll.addLast(30);
         ll.addLast(40);
         ll.addLast(50);
         ll.addLast(60);
         ll.addLast(70);
         ll.addLast(80);
         ll.addFirst(10);
         ll.addFirst(10);
         ll.addFirst(10);
         ll.addFirst(10);
         ll.display();
         ll.DeleteFirst();
        System.out.println("****");
         ll.display();
   }

}
