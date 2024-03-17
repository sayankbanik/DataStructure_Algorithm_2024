package dynamicarray;

import java.sql.SQLOutput;

public class DynamicArray {
    private int[] data; // reference [I@c818063

    public int nextElementIndex;
    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }
    public int size(){
        // return the number of elements present in the array
        return nextElementIndex;
    }
    public boolean isEmpty(){
        // check if there is any element is present in array or not
        return nextElementIndex==0;
    }
    public int get(int i){
        // return the element at index 'i'
        if(i>=nextElementIndex){
            // throw error
            return -1;
        }
        return data[i];
    }
    public void set(int i, int val){
        // replace a new value 'val' at index 'i'
        if(i>=nextElementIndex){
            // throw error
            return;
        }
        data[i] = val;
    }
    public void add(int val){
        // add value at the end of array
        if(nextElementIndex == data.length){
            increaseCapacity();
        }
        data[nextElementIndex] = val;
        nextElementIndex++;
        //print();
    }
    private void increaseCapacity(){
        int[] temp = data;  // [I@c818063
        data = new int[2*temp.length];  // [I@d8573636
        for(int i=0;i<temp.length;i++){
            data[i] = temp[i];
        }
    }
    public void print(){
//        for(int x : data)
//            System.out.print(x+" ");
        for(int i=0;i<nextElementIndex;i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
    public int removeLast(){
       int temp = data[nextElementIndex-1];
       nextElementIndex--;
       data[nextElementIndex] = 0;
        return temp;
    }
}
