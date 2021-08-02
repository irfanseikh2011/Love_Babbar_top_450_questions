package LOVE_BABBAR_450;

public class Kadane_Algorithm {
    public static int findLargestSum(int a[],int n)
    {
        int maxUntil = Integer.MIN_VALUE;
        int maxEnding = 0;
        for(int i = 0 ; i < n ; i++)
        {
            maxEnding += a[i];
            if(maxUntil < maxEnding)
                maxUntil = maxEnding;

            if(maxEnding < 0)
                maxEnding = 0;
        }
        return maxUntil;
    }

    public static void main(String[] args) {
        int a[] = {-2,-3,4,-1,-2,1,4,-3};
        System.out.println(findLargestSum(a,7));
    }
}
