package Banker;

import java.sql.Array;
import java.util.List;

/**
 * Created by lxb on 15/11/4.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class addTwoNumbers {

    public static void main(String[] args){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        int[] a = {9,9,9};
        int[] b = {1,1};
        int i = 0;
        ListNode l11 = new ListNode(0);
        ListNode l22 = new ListNode(0);
        do{
            l1.val = a[i++];
            if(i == a.length) l1.next = null;
            else {
                l1.next = new ListNode(0);
                if(i == 1) l11 = l1;
                l1 = l1.next;
            }
        } while(i < a.length);

        int j = 0;
        do{
            l2.val = b[j++];

            if(j == b.length) l2.next = null;
            else {
                l2.next = new ListNode(0);
                if(j == 1) l22 = l2;
                l2 = l2.next;
            }
        } while(j < b.length);




        ListNode res = add(l11, l22);

        while(res != null){
            System.out.print(res.val + "->");
            res = res.next;
        }


    }

    public static ListNode add(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode res1 = new ListNode(0);
        int carry = 0;
        int mark = 1;
        while(l1 != null && l2 != null){
            res.next = new ListNode(0);
            res = res.next;
            int sum = 0;
            if(l1.val + l2.val + carry >= 10) {
                sum = l1.val + l2.val - 10 + carry;
                carry = 1;
                res.val = sum;
            }
            else {
                res.val = l1.val + l2.val + carry;
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            if(mark == 1) res1 = res;
            mark++;
        }
        while(l1 != null){
            res.next = new ListNode(0);
            res = res.next;
            if(l1.val + carry >= 10) {
                res.val = l1.val + carry - 10;
                carry = 1;
            }
            else{
                res.val = l1.val + carry;
                carry = 0;
            }
            l1 = l1.next;
        }

        while(l2 != null){
            res.next = new ListNode(0);
            res = res.next;
            if(l2.val + carry >= 10) {
                res.val = l2.val + carry - 10;
                carry = 1;
            }
            else{
                res.val = l2.val + carry;
                carry = 0;
            }
            l2 = l2.next;
        }

        if(carry != 0){
            res.next = new ListNode(1);
            res.next.next = null;
        }
        return res1;
    }
}
