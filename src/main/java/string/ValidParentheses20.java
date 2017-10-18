package string;

import java.util.Stack;

/**
 * Created by fengliejv on 2017/9/16.
 */
public class ValidParentheses20 {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char ch:chars){
            char br = getbracket(ch);
            if(br==' '){
                stack.push(ch);
            }else {
                if(stack.empty()){
                    return false;
                }
                if(stack.peek()!=br){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    public char getbracket(char ch){
        if(ch==')'){
            return '(';
        }
        if(ch==']'){
            return '[';
        }
        if(ch=='}'){
            return '{';
        }
        return ' ';
    }
//    public boolean isValid(string s) {
//
//        char[] chars = s.toCharArray();
//        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
//        for(char ch :chars){
//            if(hashMap.containsKey(ch)){
//                int value = hashMap.get(ch);
//                value++;
//                hashMap.put(ch,value);
//            }else hashMap.put(ch, 1);
//            if(ch==')'){
//                if(!hashMap.containsKey('(')){
//                    return false;
//                }
//                int v1 = hashMap.get(')');
//                if(v1>hashMap.get('(')){
//                    return false;
//                }
//            }
//
//            if(ch==']'){
//                if(!hashMap.containsKey('[')){
//                    return false;
//                }
//                int v1 = hashMap.get(']');
//                if(v1>hashMap.get('[')){
//                    return false;
//                }
//            }
//
//            if(ch=='}'){
//                if(!hashMap.containsKey('{')){
//                    return false;
//                }
//                int v1 = hashMap.get('}');
//                if(v1>hashMap.get('{')){
//                    return false;
//                }
//            }
//        }
//
//        if(hashMap.containsKey('(')){
//            if(!hashMap.containsKey(')')){
//                return false;
//            }
//            if(hashMap.get('(')!=hashMap.get(')')){
//                return false;
//            }
//        }
//        if(hashMap.containsKey('[')){
//            if(!hashMap.containsKey(']')){
//                return false;
//            }
//            if(hashMap.get('[')!=hashMap.get(']')){
//                return false;
//            }
//        }
//        if(hashMap.containsKey('{')){
//            if(!hashMap.containsKey('}')){
//                return false;
//            }
//            if(hashMap.get('{')!=hashMap.get('}')){
//                return false;
//            }
//        }
//
//        return true;
//    }
}
