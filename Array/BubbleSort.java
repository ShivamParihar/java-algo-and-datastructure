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
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    nums[j] = nums[j] + nums[j+1] -( nums[j+1] = nums[j]);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}
