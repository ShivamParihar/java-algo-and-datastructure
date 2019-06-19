import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int n = Integer.parseInt(br.readLine().trim());
        String line = br.readLine();
        String[] numbers = line.split(" ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }
        
        for(int i=1;i<n;i++){
            int value = nums[i];
            int j = i-1;  
            while(j>=0 && nums[j] > value){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = value;
        }
        
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}
