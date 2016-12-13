/**
 * Created by Snoopy on 2016/11/26.
 */
public class countLettersInArray {
    public static void main(String []args){
        char []chars = creatArray();
        System.out.println("The Lowercase Letters Are:");
        displayArray(chars);
        int counts [] = countLetters(chars);
        System.out.println();
        System.out.println("The Occurrences Of Each Are:");
        displayCounts(counts);
    }

    private static char[] creatArray() {
        char []chars = new char[100];
        for(int i = 0; i < chars.length; i++)
            chars[i] = randomCharacter.getRandomLowerCaseLetter();
        return chars;
    }

    private static void displayArray(char[] chars) {
        for(int i = 0; i < chars.length; i++)
            if((i+1) % 10 == 0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i]+ " ");
    }


    private static int[] countLetters(char[] chars) {
        int counts [] = new int[26];
        for(int i = 0; i<chars.length; i++)
            counts[chars[i]-'a']++;
        return counts;
    }

    private static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++)
            if((i+1)%10 == 0)
                System.out.println("("+(char)(i+'a')+":"+counts[i]+")");
            else
                System.out.print("("+(char)(i+'a')+":"+counts[i]+")");

    }
}
