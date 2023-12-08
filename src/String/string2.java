package String;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        //string input
        //string password
        //over, ze uzivatel zadal sprvance heslo

        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String pssword = "secret";
//        if (input.equals(pssword)){
//            System.out.println("je spravne");
//        }
//        else {
//            System.out.println("je spatne");
//        }

        //promena rc = rodne cislo
        //over zda je spravne napsano
        //over zda se jedna o muze/zenu
        String rc = "015911/1234";
        //kontrola lomitka
        if (rc.charAt(6) == '/'){
            System.out.println("lomitko OK");
            //delka 11 znaku
            if (rc.length() == 11){
                System.out.println("delka rc OK");
                if (rc.charAt(2) == 5 || rc.charAt(6) == 6){
                    System.out.println("jedna se o zanu");
                }
                else {
                    System.out.println("jedna se o muze");
                }
            }
        }

        //prochazi hesla
        //urci, zda uzivatel trefil alespon jedno heslp
        String[] passwords = {"alkohol", "sobota", "klic", "strom"};
        System.out.println("Zadej heslo");
        String input = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].equals(input)){
                System.out.println("uhadl jste heslo");
                break;
            }
        }

        //pole jmen
        String[] names = {"Adam Klima", "Jan Boháč", "Jan Whatever", "Franc Josef"};
        //vypis z pole vsechny Honzi
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")){
                System.out.println(names[i]);
            }
        }


    }
}
