import org.junit.Test;

import java.util.Arrays;

public class SimpleGasCost {

    private int test1() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
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
                if (Lsum >= Rsum) {
                    R--;
                } else {
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

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        int count = left[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
            count += Math.max(left[i], right[i]);
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
        for (int i = 1; i < ratings.length; i++)
            if (ratings[i] > ratings[i - 1]) left[i] = left[i - 1] + 1;
        int count = left[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) right[i] = right[i + 1] + 1;
            count += Math.max(left[i], right[i]);
        }
        System.out.println(count);
    }

    @Test
    public void trap() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int length = height.length;
        int result = 0;
        for (int i = 1; i < length - 1; i++) {
            int max_left = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > max_left) {
                    max_left = height[j];
                }
            }

            int max_right = 0;
            for (int j = i + 1; j <= length - 1; j++) {
                if (height[j] > max_right) {
                    max_right = height[j];
                }
            }
            int min = Math.min(max_right, max_left);
            if (min > height[i]) {
                result += min - height[i];
            }
        }
        System.out.println(result);
    }

    @Test
    public void trap2() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int length = height.length;
        int[] max_left = new int[length];
        int[] max_right = new int[length];

        for (int i = 1; i < length; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]){
                sum += min - height[i];
            }
        }
        System.out.println(sum);
    }

}
