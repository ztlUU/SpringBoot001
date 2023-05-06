import com.ztl.pojo.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Demo {

    public static void main(String[] args) {

        //单向链表反向打印
        Node head = new Node(1);
        Node temp = head;
        for(int i=2;i<1000;i++){
            temp.next = new Node(i);
            temp = temp.next;
        }


        //正常打印链表：
        temp = head;
        while(temp !=null){
            System.out.print(temp.val+",");
            temp = temp.next;
        }
        System.out.println();

        //反序打印
        temp = head;
        print(temp);

    }

    public static void print(Node node){
        if(node==null) return;
        print(node.next);
        System.out.print(node.val+",");
    }

}

class Node{
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
}