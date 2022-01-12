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
public interface StackInterface<T> {
    public T pop();
    public T peek();
    public void push(T newEntry);
    public boolean isEmpty();
    public void clear();
    public T peek2();
    
}
