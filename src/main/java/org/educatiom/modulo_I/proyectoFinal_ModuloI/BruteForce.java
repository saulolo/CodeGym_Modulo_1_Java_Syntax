package org.educatiom.modulo_I.proyectoFinal_ModuloI;

/**
 * Clase que intenta descifrar un texto cifrado mediante fuerza bruta.
 */
public class BruteForce {

    /**
     * Intenta descifrar un texto cifrado mediante fuerza bruta.
     * @param encryptedText El texto cifrado a descifrar.
     * @return El texto descifrado si se encuentra una clave válida, o null si no se encuentra.
     */
    public String decryptByBruteForce(String encryptedText) {
        Cipher cipher = new Cipher();
        for (int shift = 0; shift < Cipher.ALPHABET.length; shift++) {
            String decryptedText = cipher.decrypt(encryptedText, shift);
            if (isValidDecryptedText(decryptedText)) {
                return decryptedText;
            }
        }
        return null;
    }

    /**
     * Verifica si el texto descifrado contiene palabras comunes en inglés.
     * @param decryptedText El texto descifrado a verificar.
     * @return {@code true} si el texto contiene al menos una palabra común; {@code false} en caso contrario.
     */
    private boolean isValidDecryptedText(String decryptedText) {
        String[] commonWords = {"the", "and", "is", "it", "of", "to", "a", "in", "on", "that", "for", "with", "as", "this"};
        for (String word : commonWords) {
            if (decryptedText.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
