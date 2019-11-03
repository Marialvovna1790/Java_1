/*
3. Написать метод, вычисляющий выражение a * (b + (c / d))
и возвращающий результат, где a, b, c, d – входные параметры этого метода;
 */
public class Methods {
    public static void main(String[] args){
        int a = getSum(8,3);
        int b = getSum(6,6);
        System.out.println(a);
        System.out.println(b);
    }

    static int getSum(int x, int y){
        return x + y;
    }
}
