import java.util.*;
public class PreFix {

    public static void  prefix(String s1,String s2){
        String a1[] = s1.split("");
        String a2[] = s2.split("");
        int len1 = a1.length;
        int len2 = a2.length;
        int len;
        String result ="";
        len = len1>len2 ? len2:len1;
        for(int i=0 ; i<len ;i++){
            if(!a1[i].equals(a2[i])){
                break;
            }else{
                result += a1[i];
            }
        }
        System.out.print(result);
    }

    public static void main(String args[]){
        PreFix newPrefix = new PreFix();
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        newPrefix.prefix(s1,s2);

    }
}