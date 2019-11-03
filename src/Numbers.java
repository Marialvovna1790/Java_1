/* 4 Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода;
*/
import java.util.Scanner ;
public class Numbers {
    public static void main(String[] args){
        int F = Formula();
        System.out.println(F);
    }
    static int Formula(){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        return a * (b + (c / d));
    }
}
