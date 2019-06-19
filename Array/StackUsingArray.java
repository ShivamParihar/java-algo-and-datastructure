import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {   
    int top = -1;
    int size;
    Scanner sc= new Scanner(System.in);
        
    public static void main(String args[]) throws Exception{
        
        Demo obj = new Demo();
        
        System.out.print("Enter max size of stack : ");
        obj.size = obj.sc.nextInt();
        
        int stack[] = new int[obj.size];        
        
        loop: 
        while(true){
            System.out.println("ENTER\n1-TO PUSH\n2-TO POP\n3-TO TRAVERSE\n4-TO END PROGRAM");
            switch(obj.sc.nextInt()){            
                case 1: obj.push(stack);break;
                case 2: obj.pop(stack);break;
                case 3: obj.traverse(stack);break;
                case 4: break loop;
                default : System.out.println("Invalid Input");
            }
             
        }
    }
    
    public void push(int stack[]){
        if(top == size-1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            System.out.println("Enter element to push");
            stack[top] = sc.nextInt();
        }
    }
    
    public void pop(int stack[]){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            stack[top--] = 0;            
        }
    }
    
    public void traverse(int stack[]){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println("");
        }
    
    }
}
