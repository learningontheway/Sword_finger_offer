package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author 宋伟聪
 * @date 2020/7/6 下午 2:33
 */
public class test {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead.next==null) return null;
        ListNode fast=pHead.next.next;
        ListNode low=pHead.next;
        while(fast!=low){
            if(fast.next!=null)
                fast=fast.next.next;
            else break;
            low=low.next;
        }
        if(fast.next==null) return null;
        low=pHead;
        while(low!=fast){
            low=low.next;
            fast=fast.next;
        }
        return fast;
    }
}
