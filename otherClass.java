import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by iGrove on 2016/10/26.
 */
public class otherClass {
    void  change(){
        declarePrivate ca = new declarePrivate();
        ca.setPrivateVar(15);
        System.out.println(ca.getPrivateVar());
    }
    public static void main(String[]args){
        otherClass Test = new otherClass();
        Test.change();
        declarePrivate cd = new declarePrivate();
        cd.setPrivateVar(20);
        System.out.println(cd.getPrivateVar());
    }
}
