import java.util.Scanner ;
/*
 6 Написать метод, которому в качестве параметра передается целое число,
 метод должен вернуть true, если число отрицательное;
 */
public class Sravni {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        System.out.println (Chet (a));

    }

    static boolean Chet(int a) {
    if (a > 0)
        return true;
    else
        return false;

    }
}

