import java.util.Date;

/**
 * Created by Snoopy on 2016/11/6.
 */
public class stringTest {
    public static void main(String []args){
        String str = "Beginning and Ends";
        System.out.println(str.length());
        if(begin(str))
            System.out.println("ok");
        if(ends(str))
            System.out.println("ok");
        else
            System.out.println("false");
        String Stt = "qiqi";
        if(Stt.equals("qiqi"))
            System.out.println("ok");
        if(Stt.equalsIgnoreCase("QIqi"));
            System.out.println("okk");
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
        System.out.println(str.concat(" "+Stt));
        System.out.println(str.replace('E','e'));
        Date date = new Date();
        System.out.println(date);
        String s = ""+5;
        System.out.println(s);
        s = s+""+5;
        System.out.println(s+1);
        int intnum = new Integer(s).intValue();
        System.out.println(intnum+1);
        int c = 5;
        String sa = new String().valueOf(c);
        System.out.println(sa+2);
    }
    static boolean begin(String st)
    {
        boolean result = st.startsWith("Begin");
        return result;
    }
    static boolean ends (String st)
    {
        boolean result = st.endsWith("nd");
        return result;
    }

}
