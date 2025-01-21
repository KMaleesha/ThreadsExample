package Collection;

import java.util.ArrayList;

public class FindSum {
    public static void main(String[] args) {
        Integer [] arr = {1,3,7,9,2,6,7,4,8,0};
        int sum = 8;
        int count =0;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(sum == arr[j] + arr[i]){
                System.out.println(arr[i]+ " , " + arr[j]); 
                count++;
            }
            }
        }
        System.out.println(count);
    }
}
