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
        int h = n-1;
        int l = 0;
        while(l<h){
            int mid = (l+h)/2;
            if(to_find == nums[mid]){
                is_present = true;break;
            }
            else if(to_find > nums[mid]){
                l = mid+1;
            }
            else{
                h= mid-1;
            }
        }
        
        if(is_present)
            System.out.println("Number is Present");
        else
            System.out.println("Number is not present");
    }
}
