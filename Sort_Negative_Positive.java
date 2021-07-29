package LOVE_BABBAR_450;

public class Sort_Negative_Positive {
    public static void sort(int a[],int n)
    {
        int left = 0 , right = n -1, temp = 0;
        while(left<=right)
        {
            if(a[left]<0 && a[right]<0)
            {
                left++;
            }

            else if(a[left]>0 && a[right]<0)
            {
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }

            else if(a[left] > 0 && a[right]>0)
            {
                right--;
            }
            else
            {
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,-1,-3,4,-5};
        sort(a,6);
        for (int elem: a) {
            System.out.print(elem+" ");
        }
    }
}
