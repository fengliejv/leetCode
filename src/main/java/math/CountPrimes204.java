package math;

/**
 * Created by fengliejv on 2017/10/2.
 */

public class CountPrimes204 {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        int count =0;
        int[] bitmap = new int[n];
        bitmap[0]=1;
        bitmap[1]=1;
        for (int i = 2; i < n; i++) {
            int max = n%i==0?n/i:n/i+1;
            for(int j=i;j<max;j++){
                if(bitmap[i*j]!=1){
                    bitmap[i*j]=1;
                }
            }
        }
        for(int i:bitmap){
            if(i==0){
                count++;
            }
        }
        return count;
    }
}
