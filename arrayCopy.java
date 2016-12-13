/**
 * Created by Snoopy on 2016/11/26.
 */

public class arrayCopy {
    public static void main(String []args){
        int [] sourceArray = {1,2,3,4,5,6,7,8,9,10};
        int [] targetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray,2,targetArray,0,sourceArray.length-2);
        for(int u:targetArray)
            System.out.print(u +" ");
        System.out.println();
        String [] stringArray = {"1","2","3","4","5","6","7","8","9","10"};
        String [] targetString = new String[stringArray.length];
        System.arraycopy(stringArray,3,targetString,0,6);
        for(String r:targetString)
           System.out.print(r+" ");


    }
}
