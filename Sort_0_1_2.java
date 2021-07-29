package LOVE_BABBAR_450;

public class Sort_0_1_2 {
    public static void sort(int arr[],int n)
    {
        int lo = 0 , hi = n - 1 , mid = 0 , temp = 0;
        while (mid <= hi)
        {
            switch (arr[mid])
            {
                case 0:
                {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    lo++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                {
                    temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,1,0,0,1,2};
        sort(arr,6);
        for (int elem:arr) {
            System.out.print(elem+" ");
        }
    }
}
