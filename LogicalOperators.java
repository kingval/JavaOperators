package C.Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a < b && a > b); //false
        System.out.println(a < b || a > b); //false
        System.out.println(!(a < b && a > b)); //false
    }

}
