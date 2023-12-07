package String;


import java.util.Arrays;

public class string {
    public static void main(String[] args) {
//        String song = "Dream on;Aerosmith;(1973)";
//        String[] texts = {"first", "second", "another"};
//        System.out.println(texts[1]);
//
//        String[] splits = song.split(";");
//        System.out.println(Arrays.toString(splits));
//        String songName = splits[0];
//        String composer = splits[1];
//        String YearOfRelease = splits[2];

        //vytahnuti cisel
        String hello = "Hello";
        String something = hello.substring(0,4);
        System.out.println(hello + " sub(0,4): " + something);
        String SpanishSuffix = hello.substring(1,3);

        //parsing - z textu cislo
        System.out.println("5" + "2");
        String number = "456";
        System.out.println(number + 42);
        int parsing = Integer.parseInt(number);
        System.out.println(parsing + 42);
        //z cisla text
        int text = 1234;
        String actualTest = String.valueOf(text);
    }
}
