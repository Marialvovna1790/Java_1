/*
5 Написать метод, принимающий на вход два числа, и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
*/
import java.util.Scanner ;
public class TrFls {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        System.out.println(doThree(a,b));
    }

    static boolean doThree(int a, int b) {

        int sum = a + b;
        if (sum > 10 && sum < 20)
            return true;
        else
            return false;
    }
}