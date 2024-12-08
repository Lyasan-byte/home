
public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi!");
        str.append(" the day is hard").append(" and awfull");
        System.out.println(str.toString());
        System.out.printf("%d this is my %.3f string \n ", 4, 130.6798);

        Person pasal = new Person("pasal", -30439);
        System.out.println(pasal);


    }
}