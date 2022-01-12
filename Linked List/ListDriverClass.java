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
public class ListDriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	ListReferenceBased<String> myList = new ListReferenceBased<>();
    	myList.add("15");
    	myList.add("25");
    	myList.add("35");
    	myList.add("45");
    	myList.printList();
        System.out.println();
        System.out.println("remove the index number 2");
        myList.remove(2);
        myList.printList();
        System.out.println();
        myList.removeAll();
        myList.printList();
        System.out.println("After operating removeAll, I tried to operate isEmpty method");
        System.out.println(myList.isEmpty());
        System.out.println();
        myList.add("15");
    	myList.add("25");
    	myList.add("35");
    	myList.add("45");
        myList.printList();
        System.out.println();
        System.out.println("check the size of current linked list");
        System.out.println(myList.size());
        System.out.println("check the index number 2");
        System.out.println(myList.get(2));
        
    }
    
}
