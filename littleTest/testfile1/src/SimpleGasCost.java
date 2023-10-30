import org.junit.Test;

import java.util.Arrays;

public class SimpleGasCost {

    private int test1() {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
//        int[] gas = {1, 5, 2, 3, 1};
//        int[] cost = {1, 3, 4, 1, 1};


        int[] spare = new int[gas.length];
        int length = spare.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            spare[i] = gas[i] - cost[(length - 1 + i) % length];
            sum += spare[i];
        }
        System.out.println(Arrays.toString(spare));
        System.out.println(sum);

        if (sum >= 0) {
            int L = 0;
            int R = length - 1;
            int Lsum = 0;
            int Rsum = 0;
            while (L != R) {
                Lsum += spare[L];
                Rsum += spare[R];
                if (Lsum >= Rsum){
                    R--;
                }else {
                    L++;
                }
            }
            return L;
        }
        return -1;
    }

    @Test
    public void test1Result() {
        int i = test1();
        System.out.println(i);
    }

    @Test
    public void candy() {
        int[] ratings = {1, 2, 2};
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i - 1]){
                left[i] = left[i - 1] + 1;
            }
        }
        int count = left[ratings.length - 1];
        for(int i = ratings.length - 2;i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                right[i] = right[i + 1] + 1;
            }
            count += Math.max(left[i],right[i]);
        }
        System.out.println(count);
    }

    @Test
    public void candyAN() {
        int[] ratings = {1, 2, 2};

        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for(int i = 1; i < ratings.length; i++)
            if(ratings[i] > ratings[i - 1]) left[i] = left[i - 1] + 1;
        int count = left[ratings.length - 1];
        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) right[i] = right[i + 1] + 1;
            count += Math.max(left[i], right[i]);
        }
        System.out.println(count);
    }

}
