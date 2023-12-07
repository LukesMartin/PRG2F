package cycles;

public class randomLoops {
    public static void main(String[] args) {
        //kolik pokusů trvá než padnou 2 stejná čísla kdyý jsou náhodná
        //a když jsou od 0 do 20
        int num1 = (int)(Math.random()*21);
        int num2 = (int)(Math.random()*21);
        int tries = 1;
        System.out.println(num1 + ", " + num2);
        while (num1 != num2){
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            tries++;//tries = tries + 1
            System.out.println(num1 + ", " + num2);
        }
        System.out.println("pokusu celkem:" + tries);

        //vygeneruj 100* 2 náhodná čísla. vypiš, kolikrat padly stejne
        System.out.println("----------------");
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            System.out.println(num1 + ", " + num2);
            if (num1 == num2){
                counter++;
            }
        }
        System.out.println("stejna cisla padla " + counter + "x");

        }
    }

