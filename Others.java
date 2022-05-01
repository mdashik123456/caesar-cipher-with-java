import java.io.IOException;
import java.util.Scanner;

public class Others {

    public String art = "\n\n" +
            ",adPPYba,  ,adPPYYba,  ,adPPYba,  ,adPPYba, ,adPPYYba,  8b,dPPYba,    \n" +
            "a8                 Y8  a8P_____88  I8               `Y8  88P'    Y8  \n" +
            "8b          ,adPPPPP88 8PP            Y8ba,  ,adPPPPP88  88            \n" +
            "8a     aa   88      88  8b     aa  aa    8I  88      88  88           \n" +
            "''Ybbd8      8bbdP Y8    Ybbd8     8YbbdP    8bbdP88Y8   88\n" +
            " \n" +
            "                          88                                 \n" +
            "          88              88                                 \n" +
            "                          88                                 \n" +
            ",adPPYba, 88 8b,dPPYba,   88,dPPYba,   ,adPPYba,  8b,dPPYba,  \n" +
            "a8        88 8P       8a  88P     8a  a8P_____88  88P'    Y8  \n" +
            "8b        88 88       d8  88       88 8PP         88          \n" +
            "8a     aa 88 88b     a8   88       88  8b     aa  88          \n" +
            "  8Ybbd8  88 88 YbbdP     88       88    Ybbd8    88          \n" +
            "             88                                             \n" +
            "             88           ";

    public char[] alphabet = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '@', '#', '$', '%', '^', '&', '*', '(',
            ')', '_', '-', '=', '+', '/', '|', '?', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C',
            'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '@', '#',
            '$', '%', '^', '&', '*', '(', ')', '_', '-', '=', '+', '/', '|', '?' };

    // Display Clear
    public void Clear_Screen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Art Animation
    public void Animation() {
        System.out.println("\n\n\t\t\tThe Project is");
        for (int i = 0; i < art.length(); i++) {
            System.out.print(art.charAt(i));
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("\n\n\t\tEncryption and Decryption\n");
        System.out.println("\t\tPress \"ENTER\" to continue\n");

        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}
