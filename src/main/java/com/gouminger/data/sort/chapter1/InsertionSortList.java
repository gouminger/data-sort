package com.gouminger.data.sort.chapter1;

//对链表进行插入排序
public class InsertionSortList {

    /**
     * 给定单个链表的头head，使用 插入排序 对链表进行排序，并返回排序后链表的头。
     * 插入排序算法的步骤:
     * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
     * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
     * 重复直到所有输入数据插入完为止。
     * 下面是插入排序算法的一个图形示例。部分排序的列表(黑色)最初只包含列表中的第一个元素。每次迭代时，从输入数据中删除一个元素(红色)，并就地插入已排序的列表中。
     * 对链表进行插入排序。
     */
    public static void main(String[] args) {
        ListNode head3 = new ListNode(3);
        ListNode head1 = new ListNode(1, head3);
        ListNode head2 = new ListNode(2, head1);
        ListNode head4 = new ListNode(4, head2);
        ListNode res = insertionSortList(head4);
        System.out.println(res);
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        //把head插入sortList中
        ListNode sortList = insertionSortList(head.next);
        if (head.val < sortList.val) {
            head.next = sortList;
            return head;
        }
        ListNode result = sortList;
        boolean swap = false;
        while (sortList.next != null) {
            if (head.val > sortList.next.val) {
                sortList = sortList.next;
            } else {
                head.next = sortList.next;
                sortList.next = head;
                swap = true;
                break;
            }
        }
        if (!swap) {
            head.next = null;
            sortList.next = head;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
