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
public interface ListInterface<T> {
    public void add(int newPosition, T newEntry) throws IndexOutOfBoundsException;
    
    public T remove(int givenPosition) throws IndexOutOfBoundsException ;
    
    public void removeAll();
    
    public T get(int givenPosition) throws IndexOutOfBoundsException;
    
    public int size();
    
    public boolean isEmpty();

   
}
