package collections_framework_streams.collection.list;

import java.util.*;

public class likedlist {
//    Node head;
//    private int size;
//
//    likedlist() {
//        this.size = 0;
//    }
//
//    // Variable size
//    // Non-Contiguous Memory
//    // Insert in O(1)
//    // Search in O(n)
//
//     class Node{
//         dataTypes.String data;
//         Node next;
//
//         Node(dataTypes.String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }
//
//     public void addFirst(dataTypes.String data){
//         Node newNode = new Node(data);
//         if (head == null) {
//                head = newNode;
//                return;
//         }
//
//         newNode.next = head;
//         head = newNode;
//     }
//
//     public  void addLast(dataTypes.String data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//
//         Node currentNode = head;
//         while(currentNode.next != null) {
//             currentNode = currentNode.next;
//         }
//         currentNode.next = newNode;
//     }
//
//     //print
//    public void printList() {
//         if (head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node currentNode = head;
//        while(currentNode != null) {
//            System.out.print(currentNode.data + " -> ");
//            currentNode = currentNode.next;
//        }
//        System.out.println("NULL");
//    }
//
//    public void  deleteFirst(){
//         if (head == null) {
//             System.out.println("The list is empty");
//             return;
//         }
//         size--;
//         head = head.next;
//    }
//
//    public void deleteLast() {
//        if (head == null) {
//            System.out.println("The list is empty");
//            return;
//        }
//
//        size--;
//        if (head.next == null) {
//            head = null;
//            return;
//        }
//
//        Node secondLast = head;
//        Node lastNode = head.next;
//        while (lastNode.next != null) {
//            lastNode = lastNode.next;
//            secondLast = secondLast.next;
//        }
//
//        secondLast.next = null;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public static void main(dataTypes.String[] args) {
//            likedlist list = new likedlist();
//            list.addFirst("a");
//            list.addFirst("is");
//            list.printList();
//
//            list.addLast("list");
//            list.printList();
//
//            list.addFirst("this");
//            list.printList();
//
//
//            list.deleteFirst();
//            list.printList();
//
//            list.deleteLast();
//            list.printList();
//
//        System.out.println(list.getSize());
//        list.addFirst("this");
//        System.out.println(list.getSize());
//    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");


        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i =0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }

}
