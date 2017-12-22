package string;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class LicenseKeyFormatting482 {
    public String licenseKeyFormatting(String S, int K) {

        StringBuilder sb = new StringBuilder();
        S=S.replace("-","");
        if(S.length()<=K){
            return S.toUpperCase();

        }
        int res = S.length()%K;
        if(res!=0){
            sb.append(S.substring(0,res).toUpperCase()+"-");
        }
        int n = S.length()/K;
        for (int i = 0; i < n-1; i++) {
            String s = S.substring(res+K*i,res+K*(i+1)).toUpperCase();
//            System.out.println(s);
            sb.append(s+"-");
        }
        sb.append(S.substring(S.length()-K,S.length()).toUpperCase());
        return sb.toString();
    }
}
