import com.sun.tools.javac.Main;

public class Solution24 {
    class Solution {
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public ListNode swapPairs(ListNode head) {
            if(head==null || head.next==null ){
                return head;
            }
            ListNode newlist1=head;
            ListNode newlist2=head.next;
            //trans.next=head.next;
            newlist1.next = swapPairs(newlist2.next);
            newlist2.next = newlist1;
            // trans=head.val;
            // trans2=head.next.next;
            // head.val=head.next.val;
            // head.next=head;
            // head.next.val=trans;
            // head.next.next=trans2;
            // if(head.next.next==null){
            //     return newlist;
            // }

            return newlist2;
            //return swapPairs(head.next.next);
        }
//        int trans;
//        ListNode a=new ListNode();
//        public ListNode swapPairs(ListNode head) {
//            if(head==null || head.next==null ){
//                return head;
//            }
//            trans=head.val;
//            head.next.val=head.val;
//            head.val=trans;
//            if(head.next.next==null){
//                return head;
//            }
//            return swapPairs(head.next.next);
//        }

    }
}
