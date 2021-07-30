package LOVE_BABBAR_450;

public class Rotate_by_one {
    public static void rotate(int arr[], int n)
    {
        int temp = 0;
        temp = arr[n-1];
        for(int i = n - 2; i >= 0 ; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        rotate(a,5);
        for (int elem:a) {
            System.out.print(elem+" ");
        }
    }
}
