
package CadenaCaracteres;

public class Caracteres {
    public static int vocalCont(String frase){
        int cont = 0;
        String vocales = "aeiouAEIOU";
        for(int i = 0; i < frase.length(); i++){
            char a = frase.charAt(i);
            if(vocales.indexOf(a) != -1){
                cont++;
            }
        }
        return cont;
    }

    public void convertirFrase(String fraseC){
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;

        for(char c : fraseC.toCharArray()){
            if(Character.isLetter(c)){
                if(mayuscula){
                    resultado.append(Character.toUpperCase(c));
                }else{
                    resultado.append(Character.toLowerCase(c));
                }
                mayuscula = !mayuscula;
            }else{
                resultado.append(c);
            }
        }
        System.out.println("Frase alternada " + resultado);
    }
}
