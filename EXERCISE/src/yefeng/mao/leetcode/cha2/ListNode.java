package yefeng.mao.leetcode.cha2;

/**
 * @description: 链表结构
 * @author: YF.Mao
 * @create: 2019/5/22
 **/
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode listNode = next;
        StringBuilder result = new StringBuilder(Integer.toString(val));
        while (listNode != null) {
            result.append("->").append(Integer.toString(listNode.val));
            listNode = listNode.next;
        }
        return result.toString();
    }
}
