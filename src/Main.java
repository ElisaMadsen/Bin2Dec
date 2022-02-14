import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Udskriv programs funktion til skærm
        System.out.println("Calculating from binary number to decimal number");

        //Oprette et objekt af Scanner
        Scanner scanner = new Scanner(System.in); //System.in = tager imod input fra keyboard

        //Skriv til skærm at bruger skal indtaste binært tal
        System.out.println("Please type your binary number:  ");

        int numberInput = scanner.nextInt();
        System.out.println(binaryToDecimal(numberInput));

    }

    public static int binaryToDecimal(int binaryNumber){

        int decimal = 0;
        int amountOfDigits = 0;
        while(true){

            if(binaryNumber == 0){
                break;

            } else {
                int temp = binaryNumber % 10; //Modulus af binært tal med 10
                decimal += temp * Math.pow(2, amountOfDigits); //Tager tidligere tal og ganger med 2^amountOfDigigts
                binaryNumber = binaryNumber / 10; //Binært tal divideret med 10
                amountOfDigits++; //amountOfDigits bliver plusset op
            }
        }
        return decimal;
    }

}
