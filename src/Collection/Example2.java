package Collection;

import java.util.Arrays;
import java.util.Collections;

public class Example2  {
    public static void main(String[] args) {
        Integer [] arr = {1,1,3,3,4,0,6,10,5};

        for(int i = 0; i< arr.length; i++){
            if(arr[i] >= 3){
                System.out.println(arr[i]);
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
