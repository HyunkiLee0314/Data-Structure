/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

/**
 *
 * @author hlee152
 */
public class DriverStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LinkedListStack<String> myStack = new LinkedListStack<String>();
       
        myStack.push("1");
        System.out.println(myStack.peek2()); // when the stack has fewer than two entry, return null.
        
        
        myStack.push("2");
        myStack.push("3");
        
        System.out.println(myStack.peek2());/* the stack has more than one entry. In this case "1"."2"."3"
                                             * Therefore the second entry("2") from the top entry("3") will return
                                             */
        
        
        System.out.println(myStack); // The order of entries does not changed
        
        
        
        
        
        
        
        
        
        
        
        /* // TODO code application logic here
        LinkedListStack<String> myStack = new LinkedListStack<String>();
        System.out.println(myStack.isEmpty());
        myStack.push("1");
        System.out.println(myStack.isEmpty());
        
        ArrayStack<String> myArrayStack = new ArrayStack<String>();
        System.out.println(myArrayStack.isEmpty());
        myArrayStack.push("1");
        System.out.println(myArrayStack.isEmpty());
        
        ArrayStack<String> myArrayStack = new ArrayStack<String>();
        myArrayStack.push("1");
        System.out.println(myArrayStack.peek2()); // when the stack has fewer than two entry, return null.
        myArrayStack.push("2");
        myArrayStack.push("3");
        System.out.println(myArrayStack.peek2()); /* the stack has more than one entry. In this case "1"."2"."3"
                                                   * Therefore the second entry("2") from the top entry("3") will return.
                                                   */
       /* 
         VectorStack<String> myVectorStack = new VectorStack<String>();
        System.out.println(myVectorStack.isEmpty());
        myVectorStack.push("1");
        System.out.println(myVectorStack.isEmpty());
        
        
        BalanceChecker bc = new BalanceChecker();
        System.out.println(bc.checkBalanced("a{b[c(d+e)/2-f]+1}"));
        */
        
        
       
    }
    
}
