package LOVE_BABBAR_450;

import java.util.HashSet;
import java.util.Set;

public class Union_2_arrays {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> st = new HashSet<>();
        int i = 0 , j = 0;
        while (i < n && j < m)
        {
            st.add(a[i]);
            st.add(b[j]);
            i++;
            j++;
        }

        while(i < n)
        {
            st.add(a[i]);
            i++;
        }
        while(j < m)
        {
            st.add(b[j]);
            j++;
        }



        return st.size();
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3};
        System.out.println(doUnion(a,5,b,3));
    }
}
