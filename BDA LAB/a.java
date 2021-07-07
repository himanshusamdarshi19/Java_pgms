Import java.util.LinkedList; 
Import java.util.Queue; 
Public class QueueExample
{ 
Public static void main (String [] args) 
{ 
Queue<Integer> q = new Linked List<> (); 
// adds elements {0, 1, 2, 3, 4} to queue 
for (int i=0; i<5; i++) 
q.add (I); 
// Display contents of the queue. 	
System.out.println ("Elements of queue-"+q); 
// to remove the head of queue. 
Intremovedele = h.remove (); 
System.out.println ("removed element-" + removedele); 
System.out.println (q); 
// to view the head of queue 
In head = q.peek (); 
System.out.println ("head of queue-" + head); 
// Rest all methods of collection interface, 
// Like size and contains can be used with this 
// implementation. 
Int size = q.size (); 
System.out.println ("Size of queue-" + size); 
} 
} 	
