package number;

/**
 * Created by fengliejv on 2017/10/10.
 */
public class ReverseInteger7 {
    public int reverse(int x) {
        // ArrayList<Character> input = new ArrayList<Character>();
        //char[] input = new char[1000000];
        int mod=0;
        if(x<0){
            mod=-1;
            x=-x;
        }
        StringBuffer input = new StringBuffer();
        int res=0;
        int returns=0;
        int i=0;
        while(x!=0){
            res=x%10;
            x=x/10;
            //input[i++]=(char) (res+'0');
            //input.add((char) (res+'0'));
            input.append(res);
        }
        try{
//			String a =  input.toString();
//			System.out.print(a);
            returns= Integer.parseInt(input.toString());
            //System.out.println(returns);
        }
        catch (Exception e) {
            //	System.out.println(e.toString());
            returns= 0;
        }

        return mod==0?returns:-returns;
//		Iterator<Character> iterator = input.iterator();
//		while(iterator.hasNext())
//			System.out.print(iterator.next());
    }
}
