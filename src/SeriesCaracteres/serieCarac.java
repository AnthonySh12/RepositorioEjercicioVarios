package SeriesCaracteres;

public class serieCarac {
    public static void serieDesignos(int tamanoS) {
        //EJERCICIO S4 SERIES CARACTERES:
        char[] operadores = new char[tamanoS];
        char[] simbolos = { '+', '-', '*', '/'};

        for(int i = 0; i < tamanoS; i++){
            operadores[i] = simbolos[i % simbolos.length];
        }

        for(int i = 0; i < tamanoS; i++){
            System.out.print(operadores[i] + " ");
        }

        System.out.println();
    }

    public static void serieDeAbecedario(int tamanoCara){
         char[][] abecedario= new char[1][8];
        char letra =  'a';

        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 8; j++){
                if( letra <= 'h'){
                    abecedario[i][j] = letra;
                    letra++;
                }else{
                 abecedario[i][j] = ' ';   
                }
            }
        }

        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(abecedario[i][j] + " ");
            }
            System.out.println();
        }
    }
}