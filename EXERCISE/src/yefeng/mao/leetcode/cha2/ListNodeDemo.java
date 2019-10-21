package yefeng.mao.leetcode.cha2;

import java.util.Objects;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/5/22
 **/
public class ListNodeDemo {
    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode44 = new ListNode(4);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode2.next = listNode4;
        listNode4.next = listNode3;
        listNode5.next = listNode6;
        listNode6.next = listNode44;

        System.out.println(ListNodeDemo.addTwoNumbers2(listNode2, listNode5).toString());
        System.out.println(ListNodeDemo.addTwoNumbers(listNode44, null).toString());
    }

    /**
     * 自己写的方法 20190523
     *
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (Objects.isNull(l1)) {
            System.out.println(1);
        }
        ListNode ln1 = Objects.isNull(l1) ? new ListNode(0) : l1;
        ListNode ln2 = Objects.isNull(l2) ? new ListNode(0) : l2;

        int val = ln1.val + ln2.val;
        if (val >= 10) {
            val = val - 10;
            if (ln1.next == null) {
                ln1.next = new ListNode(1);
            } else {
                ln1.next.val = ln1.next.val + 1;
            }
        }
        ListNode l = new ListNode(val);
        l.next = addTwoNumbers(ln1.next, ln2.next);
        return l;
    }

    /**
     * leetCode上的方法
     *
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ln1 = l1, ln2 = l2, ln = result;
        int carry = 0;
        int val1, val2;
        while (ln1 != null && ln2 != null) {
            val1 = ln1 != null ? ln1.val : 0;
            val2 = ln2 != null ? ln2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            ln.next = new ListNode(sum % 10);
            ln = ln.next;
            if (ln1 != null) {
                ln1 = ln1.next;
            }
            if (ln2 != null) {
                ln2 = ln2.next;
            }
        }
        if (carry > 0) {
            result.next = new ListNode(carry);
        }
        return result.next;
    }
}
