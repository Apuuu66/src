/**
 * Created by iGrove on 2016/10/26.
 */
public class declarePrivate {
    private int privateVar = 10;
    void change(){
        privateVar = 20;
    }
    public int getPrivateVar(){
        return privateVar;
    }
    public boolean setPrivateVar(int value){
        privateVar = value;
        return true;
    }
}
