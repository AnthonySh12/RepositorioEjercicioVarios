

package Automatas;

public class Automatas {
    public boolean validarCadena(String cadena){
        int i = 0;
        if (i < cadena.length() && cadena.charAt(i) == 'a') {
            i++;
        } else {
            return false;
        }

        if (i < cadena.length() && cadena.charAt(i) == 'b') {
            while (i < cadena.length() && cadena.charAt(i) == 'b') {
                i++;
            }
        } else {
            return false;
        }

        if (i < cadena.length() && cadena.charAt(i) == 'c') {
            i++;
            if (i < cadena.length() && cadena.charAt(i) == 'a') {
                i++;
            } else {
                return false;
            }
        } else {
            return false;
        }

        return i == cadena.length();
    }

    public static boolean validarClave(String clave){
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (char c : clave.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneCaracterEspecial = true;
            }

            if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial) {
                return true;
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
    }
}
