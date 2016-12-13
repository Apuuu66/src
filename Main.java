import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int list [] = {2,8,5,3,6};
        InsertionSort.insertionSort(list);
        for(int u:list)
            System.out.print(u+" ");
    }
}