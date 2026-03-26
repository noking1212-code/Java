import java.util.*;

public class trap_water {
    public static int trapWater(int height[]) {
        int n = height.length;
        int mll[] = new int[n];
        int mrl[] = new int[n];

        // max left
        mll[0] = height[0];
        for (int i = 1; i < n; i++) {
            mll[i] = Math.max(height[i], mll[i - 1]);
        }

        // max right
        mrl[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mrl[i] = Math.max(height[i], mrl[i + 1]);
        }

        // water calc
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(mll[i], mrl[i]);
            sum += waterLevel - height[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print(trapWater(height));
    }
}