public class Main {
    public static void main(String[] args) {

        String name = "HELLO World";

        System.out.println(name.concat(" !!!"));
        method();
    }

    public static void method(String ... varargs) {
        for (String i : varargs){
            System.out.println(i);
        }
    }

}