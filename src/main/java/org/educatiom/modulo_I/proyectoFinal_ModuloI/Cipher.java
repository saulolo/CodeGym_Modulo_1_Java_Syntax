package org.educatiom.modulo_I.proyectoFinal_ModuloI;

/**
 * Clase que implementa un cifrado César.
 */
public class Cipher {

    public static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,'\":-!? ".toCharArray();

    /**
     * Cifra un texto utilizando el cifrado César.
     * @param text El texto a cifrar.
     * @param shift El desplazamiento de caracteres.
     * @return El texto cifrado.
     */
    public String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            int index = indexOf(c);
            if (index != -1) {
                int newIndex = (index + shift) % ALPHABET.length;
                encrypted.append(ALPHABET[newIndex]);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    /**
     * Descifra un texto cifrado utilizando el cifrado César.
     * @param encryptedText El texto cifrado a descifrar.
     * @param shift El desplazamiento de caracteres.
     * @return El texto descifrado.
     */
    public String decrypt(String encryptedText, int shift) {
        return encrypt(encryptedText, ALPHABET.length - shift);
    }

    /**
     * Obtiene el índice de un carácter en el alfabeto.
     * @param c El carácter a buscar.
     * @return El índice del carácter en el alfabeto, o -1 si no se encuentra.
     */
    private int indexOf(char c) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
