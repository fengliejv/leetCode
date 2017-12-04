package array;

/**
 * Created by fengliejv on 2017/12/3.
 */
public class SuperUglyNumber313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] primes_index = new int[primes.length];
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = Integer.MAX_VALUE;
            int index=0;
            for (int j = 0; j <primes.length ; j++) {
                int val = res[primes_index[j]]*primes[j];
                if(val<=res[i-1]){
                    val=res[++primes_index[j]]*primes[j];
                }
                if(val<res[i]){
                    res[i]=val;
                    index=j;
                }
            }
            primes_index[index]++;
        }
        return res[n - 1];
    }
}
