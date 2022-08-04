import javax.swing.*;
import java.io.*;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.LinkedList;


public class Solution {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (llist == null) {
            return node;
        }
        SinglyLinkedListNode mynode = llist;
        int p = 1;
        while (mynode.next != null) {
            if (p == position) {
                node.next = mynode.next;
                mynode.next = node;
                break;
            }
            p++;
            mynode = mynode.next;
            System.out.println(mynode);
        }
        return llist;

    }

    public static void main(String[] args) {
//        LinkedList list = new LinkedList();

        SinglyLinkedList l = new SinglyLinkedList();

        Scanner scanner = new Scanner(System.in);

//       int x;
//       for(int i=0;i< mynode.nextInt();i++) {
//
//           list.add(mynode);
//
//        x=1;
//         mynode.nextInt();
//        System.out.println(x);
//                break;
//       }
//        System.out.println(""+mynode.nextInt());
        System.out.println("How many number you would like to add?:");
        int number = scanner.nextInt();
        System.out.println("number is: " + number);


        for (int i = 0; i < number; i++)
        {
            System.out.print("the value is=" + i);
            l.insertNode(scanner.nextInt());

        }

        // ----------------------------------------------------------------------
        SinglyLinkedListNode m = l.head;


        // smallest value
        // outer loop. loop through the list
        while (m != null) {
            int s = Integer.MAX_VALUE;
            int t = Integer.MAX_VALUE;
            // inner loop , loop though the list
            while (m != null) {
                // compare date with next data
                if (t > m.data) {
                    // if m.data smaller than s save m.data in s
                    t = m.data;

                }
                m = m.next;

            }

            // rearrange  the list--------------------------------------------------------

                if (t != 0) {
                    m = l.head;
                    m = m.next;
                    s = m.data;
                    m = m.next;
                    m.data = s;
                }
                if (t != 0) {
                    m = l.head;
                    s = m.data;
                    m = m.next;
                    m.data = s;
                }
                if (t != 0) {
                    m = l.tail;
                    s = m.data;
                    m = l.head;
                    m.data = s;

                }
                if (t != 0) {
                    m = l.head;
                    m = m.next;
                    s = m.data;
                    m = l.tail;
                    m.data = s;
                }
                    if (t != 0) {
                        m = l.head;
                        s = m.data;
                        m = m.next;
                        m.data = s;

                    }
                    if (t != 0) {
                        m = l.head;
                        m.data = t;
                    }


            //----------------------------------------------------------------------------


            SinglyLinkedListNode n = l.head;
            while (n != null) {
                System.out.println(" "+n.data);

                n = n.next;


            }
                   break;
        }
    }
}





