import org.junit.Test;

import java.util.Arrays;

public class TestSpace {
    @Test
    public void test1(){
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);
    }

    @Test
    public void test2(){
        int[] citations = {3, 0, 6, 1, 5};
        int result = 0;
        int n = citations.length, tot = 0;
        int[] counter = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n) {
                counter[n]++;
            } else {
                counter[citations[i]]++;
            }
        }
        for (int i = n; i >= 0; i--) {
            tot += counter[i];
            if (tot >= i) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
