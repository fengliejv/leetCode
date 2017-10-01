package array;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class RemoveElement27 {
    public int removeElement(int[] A, int elem) {
        int m = 0;
        for(int i = 0; i < A.length; i++){

            if(A[i] != elem){
                A[m] = A[i];
                m++;
            }
        }

        return m;
    }
}
