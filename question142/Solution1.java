package question142;

import java.util.HashSet;

public class Solution1 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while(null != cur.next){
            if(hashSet.contains(cur.next)){
                return cur.next;
            }
            cur = cur.next;
            hashSet.add(cur);
        }
        return null;
    }
}
