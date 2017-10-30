package array;

/**
 * Created by fengliejv on 2017/10/30.
 */
public class BitandbitCharacters717 {
    public boolean isOneBitCharacter(int[] bits) {
        int index=0;
        for (int i = 0; i < bits.length; i++) {
            if(bits[i]==1){
                i++;
                index=1;
            }else {
                index=0;
            }
        }
        if(index==1){
            return false;
        }else {
            return true;
        }
    }
}
