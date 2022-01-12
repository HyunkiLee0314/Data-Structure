/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdriverclass;

/**
 *
 * @author Hyunki
 */
public class ListReferenceBased<T> implements ListInterface<T> {
    private Node head; 
    private int numItems;
    public ListReferenceBased(){
    	numItems = 0;
        head =null;
    }
    private Node find(int givenPosition){
        Node curr = head; // First, grab head.
        for (int idx = 0; idx < givenPosition; idx++){ // Scan LinkedList
            curr = curr.getNext();
        }
        return curr;
    }
    
    @Override
    public void add(int newPosition, T newEntry) throws IndexOutOfBoundsException{
        if (newPosition >=0 && newPosition < numItems+1){ // Check newPosiont is valid
            if(newPosition == 0) { // If newEntry's position is 0(head)
                Node newNode = new Node(newEntry, head); // Make new node.
                newNode.setNext(head); // Past head is my next.
                head = newNode; // I'm head now.
            } else {
                Node prev = find(newPosition-1); // Find front node from my position
                Node newNode = new Node(newEntry, prev.getNext()); // My next node is prev's next
                prev.setNext(newNode); // I'm a prev's next
            }
            numItems++;
        }else{
            throw new ListIndexOutOfBoundsException("List index out of bounds on add");
        }
    }
    
    public void add(T newEntity) throws IndexOutOfBoundsException{
    	if(numItems == 0) {
            Node newNode = new Node(newEntity);
    		head = newNode;
    	}else {
            Node lastNode = find(numItems-1);
            Node newNode = new Node(newEntity);
            lastNode.setNext(newNode);
    	}
        numItems++;
    }

	@Override
    @SuppressWarnings("unchecked")
	public T remove(int givenPosition) throws IndexOutOfBoundsException{
        if (givenPosition >=0 && givenPosition < numItems){
            if(givenPosition == 0){
            	Node tmp = head;
                head = head.getNext();
                numItems--; // dec
                return (T) tmp.getItem();
            } else {
                Node prev = find(givenPosition -1); // Grab prev node
                Node curr = prev.getNext(); // remove target
                prev.setNext(curr.getNext()); // Set prev's next to target's next
                numItems--; // dec
                return (T) curr.getItem();
                
            }
        } else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on remove");
        }
    }
    
	@Override
    public void removeAll(){
        head = null;
        numItems = 0;
    }

	@Override
    @SuppressWarnings("unchecked")
    public T get(int givenPosition) throws IndexOutOfBoundsException{
        if (givenPosition >= 0 && givenPosition < numItems){
            Node curr = find(givenPosition);
			return (T) curr.getItem();
        }
        else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on get");
        }
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    public void printList() {
    	Node tmp = head;
    	for(int i = 0; i < numItems; i++) {
    		System.out.print(tmp.getItem());
    		if(tmp.getNext() != null) {
    			System.out.print(" -> ");
    		}
    		tmp = tmp.getNext();
    	}
    }

    void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
