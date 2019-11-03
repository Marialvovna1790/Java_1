import java.util.Scanner ;
/*
Написать метод, которому в качестве параметра передается строка,
 обозначающая имя, метод должен вывести в консоль сообщение
 «Привет, указанное_имя!»
 */
public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        seventh(name);
    }
    public static void seventh(String name){
        System.out.printf("Привет, %s!", name);
    }
}

