package cycles;

import java.util.Scanner;

public class Cykly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej maximalni hranici");
        int input = sc.nextInt();
        for (int i = 2; i < input; i++){
            for (int j = 2; j <i; j++) {
                if (i % j != 0){
                    System.out.println(i);
                }
            }
        }


    }
}
