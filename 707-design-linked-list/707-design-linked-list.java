class MyLinkedList {

   ListNode head;
    public MyLinkedList() {}
    
    public int get(int index) {
        ListNode list = head;
        int i = 0;
        while(list != null){
            if(i == index){
                return list.val; 
            }
            i ++;
            list = list.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        if(head == null)
        {
            head = new ListNode(val); 
            return;
        }
        ListNode p = new ListNode(-1, head);
        p.next = new ListNode(val, head);
        head = p.next;
    }
    
    public void addAtTail(int val) {
        if(head == null) 
        {
            head = new ListNode(val); 
            return;
        }
        
        ListNode p = head;
        while(p.next != null)
        {
            p = p.next;
        }
        p.next = new ListNode(val, null);
    }
    
    public void addAtIndex(int index, int val) {
        ListNode demo = new ListNode(-1, head);
        ListNode curr = demo;
        int i = 0; 
        while(curr != null)
        {
            if(i == index)
            {
                curr.next = new ListNode(val, curr.next);
                break;
            }
            curr = curr.next;
            i++;
        }
        head = demo.next;
    }
    
    public void deleteAtIndex(int index) {
        ListNode pointer = new ListNode(-1, head);
        ListNode slow = pointer;
        ListNode fast = head;
        int i = 0;
        while(fast != null){
            if(i == index){
                slow.next = fast.next;
                break;
            }
            i++;
            slow = slow.next;
            fast = fast.next;
        }
        head = pointer.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */