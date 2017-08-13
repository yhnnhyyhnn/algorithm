package others;

/**
 * Created by luokai on 2017/8/13<br>
 * 字符串进行加法计算，不使用Integer.parse方法对字符串进行转换<br>
 * 0-9对应的ascii码为48-57
 */
public class StringCalc {

    public long calc(String s1,String s2) throws Exception {
        //相同的位数进行相加，如果字符串长度不一致，需要在前面补0
        int len1 = s1.length();
        int len2 = s2.length();
        int dis = len1 - len2;

        StringBuffer sb = new StringBuffer();
        if(dis > 0){//第一个字符串比第二个字符串长，第二个字符串需要补0
            for(int i=0;i<dis;i++){
                sb.append('0');
            }
            s2 = sb.append(s2).toString();
        }
        if(dis < 0){//第一个字符串比第二个字符串短，第一个字符串需要补0
            for(int i=0;i<-dis;i++){
                sb.append('0');
            }
            s1 = sb.append(s1).toString();
        }

        boolean carry = false;//是否有进位
        long result = 0;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)<48 || s1.charAt(i) > 57 || s2.charAt(i) < 48 || s2.charAt(i) > 57){
                throw new Exception("字符串只能包含0-9");
            }
            int i1 = s1.charAt(i) - 48;
            int i2 = s2.charAt(i) - 48;
            int res = i1 + i2;
            if(carry){
                res += 1;
            }
            if(res > 10){
                carry = true;
                res = res%10;
            }else{
                carry = false;
            }
            if(i < s1.length()-1){
                result += res*Math.pow(10,s1.length()-1-i);
            }else{
                result += res;
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        StringCalc sc = new StringCalc();
        long result = sc.calc("13921","2233432");
        System.out.println(result);
    }
}
