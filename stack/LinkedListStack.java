/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

import java.util.EmptyStackException;

/**
 *
 * @author hlee152
 */
public class LinkedListStack<T> implements StackInterface<T> {
    private Node topNode;//keeps the address of the first node
    private int num = 0; // creat num which will count entries
    @Override
    public T pop() {
        T top = peek();
        topNode = topNode.next;
        num --;
        return top;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return topNode.getData();
        }
    }

    @Override
    public void push(T newEntry) {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
        num ++;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }

    @Override
    public T peek2() {
        if(num <2){ // When the entry is fewer than two, return null
            return null;
        }else{ // When the entry is more than one, return the second value without any changing.
           T topFirst = pop(); // eliminating top value
           T topSecond = peek(); // taking the second value.(now it's position is the top).
           push(topFirst);// adding the original top value to make corret order.
           return topSecond; // returning the second value.
        }
    }
    //to demonstrate the peek2() method, I create toString method
    public String toString(){
        if(topNode == null){
            return "[]";
        }
        
            Node temp = topNode;
            String str = "[";
            while(temp.next != null){
                str += temp.getData() + ",";
                temp = temp.next;
            }
            str += temp.getData();
            return str + "]";
        }
    
    
    private class Node{
        private T data;
        private Node next;
        
        public Node(T dataPortion){
            // data = dataPortion; next = linkPortion;
            this(dataPortion, null);
            
        }
        
        public Node(T dataPortion, Node linkPortion){
            data = dataPortion;
            next = linkPortion;
            
        }
        
        public void setData(T newData){
            data = newData;
        }
        public T getData(){
            return data;
        }
        
        public Node getNextNode(){
            return next;
        }
        
        public void setNextData(Node nextNode){
            next = nextNode;
        }
    }
}
