package LOVE_BABBAR_450;

class Pair{
    int max;
    int min;
}

public class Max_Min {
    public static Pair max_and_min(int arr[])
    {
        Pair p = new Pair();
        int n = arr.length;
        int i = 0;
        if(n%2==0)
        {
            if(arr[0]>arr[1])
            {
                p.max = arr[0];
                p.min = arr[1];
            }
            else
            {
                p.max = arr[1];
                p.min = arr[0];
            }
            i = 2;
        }
        else
        {
            p.min = arr[0];
            p.max = arr[0];
            i = 1;
        }
        while(i < n-1)
        {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > p.max) {
                    p.max = arr[i];
                }
                if (arr[i + 1] < p.min) {
                    p.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > p.max) {
                    p.max = arr[i + 1];
                }
                if (arr[i] < p.min) {
                    p.min = arr[i];
                }
            }
            i+=2;
        }
        return p;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Pair p = max_and_min(arr);
        System.out.println("Max = "+p.max+"Min = "+p.min);
    }
}
