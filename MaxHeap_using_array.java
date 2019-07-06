package datastructure;

import java.io.*;
import java.util.*;
import java.math.*;
public class GFG {
    final int HEAP_SIZE = 20;
    int heap[] = new int[HEAP_SIZE];
    int heap_index = 0;
    Scanner sc = new Scanner(System.in);
            
    public static void main(String[] args) throws Exception{
        GFG obj = new GFG();
        loop:
        while(true){
            System.out.println("1. To insert element\n"
                             + "2. To delete root\n"
                             + "3. To print heap\n"
                             + "4. To end program");
            int choice = obj.sc.nextInt();
            
            switch(choice){
                case 1: obj.insert();break;
                case 2: obj.delete();break;
                case 3: obj.printHeap();break;
                case 4: break loop;
                default: System.out.println("Invalid input");
            }
        }
    }
    
    void insert(){
        if(heap_index >= HEAP_SIZE){
            System.out.println("Heap is full");return;
        }
        System.out.println("Enter element to insert");
        heap[heap_index] = sc.nextInt();   
        heapify_bottom_up(heap_index++);
    }
    
    void heapify_bottom_up(int index){
        int parent_index = (index-1)/2;
        if(parent_index >= 0 && heap[parent_index] < heap[index]){
            heap[index] = heap[parent_index] + heap[index] -(heap[parent_index] = heap[index]);
            heapify_bottom_up(parent_index);
        }        
    }
    
    void delete(){
        if(heap_index == 0){
            System.out.println("Heap is empty");return;
        }
        //swap last element with root and then delete
        heap_index--;
        heap[0] = heap[heap_index] + heap[0] -(heap[heap_index] = heap[0]);
        heap[heap_index] = 0;        
        heapify_top_down(0);
    }
    
    void heapify_top_down(int index){
        int max = index;
        int left = 2*index + 1;
        int right = 2*index + 2;
        if(left < heap_index && heap[left] > heap[max])
            max = left;
        if(right < heap_index && heap[right] > heap[max])
            max = right;
        if(max != index){
            heap[max] = heap[index] + heap[max] -(heap[index] = heap[max]);
            heapify_top_down(max);        
        }        
    }
    
    void printHeap(){
        if(heap_index == 0){
            System.out.println("Heap is empty");return;
        }
        for(int i=0;i<heap_index;i++)
            System.out.print(heap[i]+" ");
        System.out.println("");
    }
    
}