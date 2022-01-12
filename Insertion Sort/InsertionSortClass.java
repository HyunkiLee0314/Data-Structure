/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverclass;

/**
 *
 * @author Hyunki
 */
public class InsertionSortClass implements SortADTInterface {
    static int i = 0;
    static int j = 0;
    static int k = 0;
    
    public void insertionSort(int arr[]){
       
        
        for( i = 1; i < arr.length; i++){
            j = arr[i];
            
            for (k = i-1; (k > -1) && ( arr[k]> j); k--){
                arr[k+1] = arr[k];
            }
            arr[k+1]=j;
        }
        
        
    }
    public void printArray(int arr[]){
        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ ",");
        }
        
        
    }
    
}
