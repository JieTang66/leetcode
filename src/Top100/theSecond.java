package Top100;

public class theSecond {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		/*
		 * 1.将当前节点初始化为返回列表的哑结点，进位carry初始化为0
		 * 2.遍历列表l1,l2直至他们的尾端
		 * 3.设定sum = l1Val + l2Val + carry,更新进位的值carry = sum/10
		 * 4.建立一个新的节点，数值为sum%10，设置为当前节点的下一个节点
		 * 5.将当前节点移到下一个节点
		 * 6.将链表l1,l2也前进到下一个节点
		 * */
		
		/*
		 * 对于链表问题，返回结果为头结点时，
		 * 通常需要先初始化一个预先指针 pre，
		 * 该指针的下一个节点指向真正的头结点head。
		 * 使用预先指针的目的在于链表初始化时无可用节点值，
		 * 而且链表构造过程需要指针移动，
		 * 进而会导致头指针丢失，无法返回结果
		 * */
		ListNode n = new ListNode(0);
		ListNode cur = n;
		int carry = 0;
		while(l1 != null || l2 != null || carry != 0) {
			int l1Val = l1!=null ? l1.val : 0;
			int l2Val = l2!=null ? l2.val : 0;
			int sum = l1Val + l2Val + carry;
			carry = sum/10;
			cur.next = new ListNode(sum%10);
			cur = cur.next;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		return n.next;
		
	}
}


