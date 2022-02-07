/** 
* TITLE: Main.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 4
* PROJECT: Lab 08_RecursiveCount
* LAST MODIFIED: 09/30/2020
* DESCRIPTION: this program counts how many times the number appears in array with 
* recursive method
* 
* ALGORITHM: 
* declare public static void countNumberOf(int n, int[] array, int index, int occur)
* if(index < array.length){
            if(array[index] == n){
               occur++;
               index++;
               call countNumberOf()
            else > index++ > call countNumberOf()
* print number of occur in console
* 
* PACKAGES INCLUDED: no 
*/ 
package L08_RecursiveCount;

public class MainRecursiveCount{
    /**
     * Counts occurence of number in array.
     * @param n integer that need to be checked in array
     * @param array array needs to be checked
     * @param index position of array element to begin check with
     * @param occur integer number of times the number appears in array, initially occur = 0
     */
    public static void countNumberOf(int n, int[] array, int index, int occur){
        if(index < array.length){
            if(array[index] == n){
               occur++;
               index++;
               countNumberOf(n, array, index, occur);
            }
            else{
            index++;
            countNumberOf(n, array, index, occur);
            }
        }else
        System.out.println(n + " appears "+ occur + " times in array." );
    }
    public static void main(String[] args) {
        
        int data[] = { 1, 2, 6, 4, 3, 2 };
        countNumberOf(2, data, 0, 0);
        countNumberOf(6, data, 0, 0);
        countNumberOf(5, data, 0, 0);

    }
}

