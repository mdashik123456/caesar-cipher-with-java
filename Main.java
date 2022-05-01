// Caesar Cipher with Object oriented Concept

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TextEncodeDecode txtEncodeDecode = new TextEncodeDecode();
        txtEncodeDecode.Clear_Screen();
        txtEncodeDecode.Animation();
        int shift = 0;
        String choice, Text;

        while (true) {
            txtEncodeDecode.Clear_Screen();
            System.out.println(txtEncodeDecode.art); // run art again and again

            System.out.print("Type 'encode' to encrypt\nType 'decode' to decrypt\n==> ");
            choice = input.nextLine();

            if (choice.equals("encode") || choice.equals("decode")) {
                System.out.print("Type your messege : ");
                Text = input.nextLine();

                System.out.print("Type the shift number : ");
                shift = input.nextInt();
                // % for large shift
                shift = shift % (txtEncodeDecode.alphabet.length / 2);

                txtEncodeDecode.cipher_text(Text, shift, choice);
            } else {
                System.out.println("\nWrong Selection\nYou need to type 'encode' to encrypt or 'decode' to decrypt\n");
            }

            // For run this script again
            System.out.print("\nDo you want to continue ? (Y/N) : ");
            char isContinue = input.next().charAt(0);
            if (isContinue == 'N' || isContinue == 'n')
                break;
            input.nextLine(); // String can't take user input after Int or any data type input.
        }
        System.out.println("\n\t\tGoodBye\n\n");
    }
}