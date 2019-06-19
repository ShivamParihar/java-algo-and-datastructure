import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        String numbers[] = br.readLine().trim().split(" ");
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }
        
        int to_find = Integer.parseInt(br.readLine());
        
        boolean is_present = false;
        for(int i=0;i<n;i++){
            if(nums[i] == to_find){
                is_present = true;
                break;
            }
        }
        
        if(is_present)
            System.out.println("Number is Present");
        else
            System.out.println("Number is not present");
    }
}
