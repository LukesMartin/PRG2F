package test;

import java.util.Scanner;

public class test_string {
    public static void main(String[] args) {
        //cv1
        Scanner sc = new Scanner(System.in);
        System.out.println("napis telefonní cislo s +420 na zacatku");
        String tel = sc.nextLine();
        if (tel.length() == 13) {
            System.out.println("delka je spravna");
        }
        //cv2
        String[] spanishPhrases = {"El Camino", "La Bomba", "Elephant", "Lancelot"};
        for (int i = 0; i < spanishPhrases.length; i++) {
            if (spanishPhrases[i].contains("El ")){
                System.out.println(spanishPhrases[i]);
            }
            if (spanishPhrases[i].contains("La ")){
                System.out.printf(spanishPhrases[i]);
            }
        }

        System.out.println("");

        //cv3
        String[] text = {"jedna", "dva", "tri", "ctyri"};
        System.out.println(text[0].toUpperCase());
        System.out.println(text[3].toUpperCase());
        System.out.println(text[1]);
        System.out.println(text[2]);
    }

}
