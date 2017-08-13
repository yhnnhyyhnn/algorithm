package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by luokai on 2017/8/13.<br>
 * 一个字符串中都是括号，判断正括号与反括号能否一一对应<br>
 * 如：{[(]}这个字符串不匹配，[{()}]这个字符串匹配
 */
public class MatchBrace {

    public boolean  match(String str){
        Stack<Character> stack = new Stack<>();

        List<Character> leftArray = new ArrayList<>();
        leftArray.add('(');
        leftArray.add('[');
        leftArray.add('{');
        List<Character> rightArray = new ArrayList<>();
        rightArray.add(')');
        rightArray.add(']');
        rightArray.add('}');

        for(int i=0;i<str.length();i++){
            if(leftArray.contains(str.charAt(i))){
                stack.push(str.charAt(i));
            }
            if(rightArray.contains(str.charAt(i))){
                if(stack.empty()){
                    return false;
                }
                char c = stack.pop();
                if(str.charAt(i) - c > 2){
                    return false;
                }
            }
        }

        if(!stack.empty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "()[([]}){}]{}";
        MatchBrace mb = new MatchBrace();

        System.out.println(mb.match(str));
    }
}
