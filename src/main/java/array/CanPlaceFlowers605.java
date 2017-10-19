package array;

/**
 * Created by fengliejv on 2017/10/19.
 */
public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        if(flowerbed.length<n){
            return false;
        }
        boolean avai = false;
        if(flowerbed[0]==0){
            if(flowerbed.length>1&&flowerbed[1]==0){
                n--;
                avai=false;
            }else {
                avai = true;
            }
        }
        for (int i = 1; i < flowerbed.length-1; i++) {
            if(flowerbed[i]!=0){
                avai=false;
            }else {
                if(avai){
                    if(flowerbed[i+1]==0){
                        n--;
                        avai=false;
                    }else {
                        avai = true;
                    }
                }else {
                    avai=true;
                }
            }
        }
        if(avai&&flowerbed[flowerbed.length-1]==0){
            n--;
        }
        return n>0?false:true;
    }
}
