import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {   
    int front=0, rear=0, filled=0;
    int size;
    Scanner sc= new Scanner(System.in);
        
    public static void main(String args[]) throws Exception{
        
        Demo obj = new Demo();
        
        System.out.print("Enter max size of queue : ");
        obj.size = obj.sc.nextInt();
        
        int queue[] = new int[obj.size];        
        
        loop: 
        while(true){
            System.out.println("Enter\n1-To unqueue\n2-to dequeue\n3-To traverse\n4-To end program");
            switch(obj.sc.nextInt()){            
                case 1: obj.enqueue(queue);break;
                case 2: obj.dequeue(queue);break;
                case 3: obj.traverse(queue);break;
                case 4: break loop;
                default : System.out.println("Invalid Input");
            }
        }
    }
    
    public void enqueue(int queue[]){
        if(filled == size){
            System.out.println("Queue is full");
        }
        else{
            System.out.println("Enter element to enqueue");
            queue[rear++] = sc.nextInt();
            filled++;
            rear = rear%size;
        }
    }
    
    public void dequeue(int queue[]){
        if(filled == 0){
            System.out.println("Queue is empty");
        }
        else{
            queue[front++] = 0;
            front = front%size;
            filled--;
        }
    }
    
    public void traverse(int queue[]){
        if(filled == 0){
            System.out.println("Queue is empty");
        }
        else{
            int i = front;
            int count = filled;
            while(count-- > 0){
                i = i%size;
                System.out.print(queue[i]+" ");
                i++;
            }
            System.out.println("");
        }
    
    }
}
