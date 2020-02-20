package Top100;



public class Nineteen {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode start = pre;
		ListNode end = pre;
		
		for(int i = 0;i<=n;i++) {
			start = start.next;
		}
		
		while(start.next!=null) {
			start=start.next;
			end = end.next;
		}
		end.next=end.next.next;
		return pre.next;
	}
}
