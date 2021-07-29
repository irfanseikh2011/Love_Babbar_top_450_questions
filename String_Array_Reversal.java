package LOVE_BABBAR_450;

public class String_Array_Reversal {
    public static void reverse(int[] arr)
    {
        int temp = 0;
        int i = 0, j = arr.length - 1;
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int a[] = {1,2,3};
        reverse(a);
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
