/**
 * Created by Snoopy on 2016/11/6.
 */
public class stringBuffer {
    public static void main(String []args){
       String str = "what far!";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);
        stringBuffer.append(false);
        char []sa = {'q','r','y'};
        char []s = new char[]{'a','b','c','d','e'};
        stringBuffer.append(sa,1,1);
        stringBuffer.insert(2,"qwe");
        stringBuffer.insert(2,false);
        System.out.println(stringBuffer);
        String st = new String(stringBuffer).toString();
        System.out.println(st);
        System.out.println(st+12);

    }
}
