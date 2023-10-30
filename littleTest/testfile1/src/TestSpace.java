import org.junit.Test;

import java.util.*;

public class TestSpace {
    private Map<Integer,Integer> test3Map;

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

    @Test
    public void test3(){
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(nums);
        System.out.println(list);
        System.out.println(list.get(1));

        int index = 0;
        System.out.println(++index);
        System.out.println(index);
    }

    @Test
    public void test4(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 2);
        map.put(2, 2);
        System.out.println(map.toString());
    }
}
