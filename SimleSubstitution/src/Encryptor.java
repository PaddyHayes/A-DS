public class Encryptor {
    public static String encryptSimpleSubstitution(String plaintext, String mapping){



        String textNoSpace = "";




        for(int i = 0; i < plaintext.length(); i++) {
           if (plaintext.charAt(i) != ' ')
                textNoSpace = textNoSpace + plaintext.charAt(i);
        }
        String ciphertext = "";
        for (int i = 0; i < textNoSpace.length(); i++){
            char ch = textNoSpace.charAt(i);
            int index = ch - 'A';
            ciphertext += mapping.charAt(index);


        }

        return ciphertext;
    }
}
