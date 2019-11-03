import java.util.Scanner ;
/*
 *8 Написать метод, который определяет, является ли год високосным,
 * и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class Visokosny_god {
 public static void main(String[] args){
     Scanner in = new Scanner (System.in);
     int year = in.nextInt ();
     System.out.println (God(year));

 }
    public static boolean God(int year){
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}

/*
9 Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:

void myMethod(int a, String b) {}
void myMethod(String b, int a) {}

Ответ: сингатура это название + набор параметров
если их порядок или тип отличается, а название то же - это другая сингатура
если же название отличается - другой метод
eще такие методы называются перегруженными методами.
 */

