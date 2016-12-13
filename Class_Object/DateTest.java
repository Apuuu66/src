package Class_Object;

import java.util.Date;

/**
 * Created by Snoopy on 2016/12/6.
 */
public class DateTest {
    public static void main(String []args){
        Date date = new Date(30);
        System.out.println("The elapsed time since Jan 1,1970 is "+date.getTime()+" milliseconds");
        //System.out.println(date.toString());
        Date date2 = new Date(60);
        System.out.println("The elapsed time since Jan 1,1970 is "+date2.getTime()+" milliseconds");
        // System.out.println(date2.toString());
        System.out.println(date2.getTime()-date.getTime());
    }
}
