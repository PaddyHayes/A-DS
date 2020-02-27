public class TestEncryptor {
    public static void main(String[] args) {
        String mapping = "RAHJMYUWKXNFQGEBOPZSDCTVLI";
        String plaintext = "SUPER SECRET";

        String ciphertext = Encryptor.encryptSimpleSubstitution(plaintext, mapping);
        System.out.println(ciphertext);//expect "ZDBMPZMHPMS
    }
}
