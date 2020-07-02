import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        for (int i = 0; i < 4; i++) {
            arr.removeFirst();
            System.out.println(arr);
        }

        System.out.println("====================");
        //test arraycopy
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints = new int[6];
        ints[1] = 11;
        ints[2] = 12;
        ints[3] = 13;
        ints[4] = 14;
        ints[5] = 15;
        System.arraycopy(num1, 2, num1, 3, 5);
        for (int i : num1) {
            System.out.print(i);
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
        System.out.println("====================");


    }
}
