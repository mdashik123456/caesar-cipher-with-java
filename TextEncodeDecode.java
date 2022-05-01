public class TextEncodeDecode extends Others {

    public void cipher_text(String text, int shift, String choice) {

        char[] cipher = new char[500];

        char[] text_array = text.toCharArray();

        int position = 0;

        if (choice.equals("decode")) {
            shift *= -1;
        }
        for (int ch = 0; ch < text_array.length; ch++) {
            for (int alph = 0; alph < alphabet.length; alph++) {
                if (text_array[ch] == alphabet[alph]) {
                    position = alph;
                    cipher[ch] = alphabet[position + shift];
                    break;
                } else if (text_array[ch] == ' ') {
                    cipher[ch] = ' ';
                }
            }
        }
        text = String.valueOf(cipher);
        System.out.println("The " + choice + "d text is : \"" + text + "\"");
    }
}