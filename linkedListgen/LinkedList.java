package linkedListgen;

public class LinkedList {
	
	
	public boolean circularLinkList (ListNode head) {
		
		if(head ==null)
            return false;
		
	  ListNode slow = head;
	  ListNode fast = head.next;
	  
	  while(fast != null && fast.next != null) {
		  
		  if(slow == fast)
			  return true;
		  
		  fast = fast.next;
		  slow = slow;
		  
	  }
		
		
		return false;
	} 
	

	  
	
	public static void main(String args[]) {
		
		LinkedList ll = new LinkedList();
		ListNode ll1 = new ListNode(3);
		ll1.next = new ListNode(2);
		ll1.next.next = new ListNode(0);
		ll1.next.next.next = new ListNode(-3);// [3,2,0,-4]
		ll.circularLinkList(ll1);
		
	}

}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	         val = x;
	         next = null;
	     }
	  }