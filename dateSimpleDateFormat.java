/**
 * Created by Snoopy on 2016/11/9.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateSimpleDateFormat {
    public static void main(String []args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        System.out.println(sdf.format(date));
    }
}
