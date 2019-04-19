package twosum;


import java.util.Objects;

public class Solution {


    public static void printListNode(ListNode... nodes) {
        // 打印两个倒序链表
        for (ListNode node : nodes) {
            Objects.requireNonNull(node);
            while (null != node.val) {
                if (null != node.next) {
                    System.out.print(node.val + "--->");
                    node = node.next;
                } else {
                    System.out.print(node.val + "\r\n");
                    break;
                }
            }
        }
    }


    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p, q, temp;
        p = l1;
        q = l2;
        temp = result;
        int sum0 = 0;
        while (null != p || null != q) {
            // (2-->4-->3)
            // (5-->6-->4)
            int x = (null != p) ? p.val : 0;
            int y = (null != q) ? q.val : 0;
            System.out.printf("x--->[%s],", x);
            System.out.printf("y--->[%s]\n", y);
            //  2 + 5 + 0 = 7
            int sum = sum0 + x + y;
            System.out.printf("sum = {%s}\n", sum);
            sum0 = sum / 10;
            System.out.printf("sum0 = {%s}\n", sum0);
            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (sum0 > 0) {
            temp.next = new ListNode(sum0);
        }
        return result.next;
    }


    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        printListNode(l1, l2);
        printListNode(addTwoNumber(l1, l2));

    }

}
