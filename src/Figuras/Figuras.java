package Figuras;


public class Figuras {

    public void imprimirCuadrado(int tamanoCuadrado) {
        for(int i = 0; i < tamanoCuadrado; i++){
            for(int j = 0; j < tamanoCuadrado; j++){
                if((i == 0 || j == 0)||(i == tamanoCuadrado-1)||(j == tamanoCuadrado-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }

    public void imprimirRombo(int tamanoRombo){
        for(int i= 0; i < tamanoRombo; i++){
            for(int j = 0; j < tamanoRombo - i -1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                 System.out.print("*");
            }
                 System.out.println();
            }   
    }

    public void imprimirEscaleras(int tamanoEscaleras){
        for(int i = 0; i < tamanoEscaleras; i++){
            for(int j = 0; j < tamanoEscaleras - i -1; j++){
                System.out.print("   ");
            }
            System.out.print("__");
            System.out.print("|");
            System.out.println();
        }
    }

    public void imprimirCruz(int tamanoCruz){
        for(int i = 0; i < tamanoCruz; i++){
            for(int j = 0; j < tamanoCruz; j++){
                if((i == j)||( i+ j == tamanoCruz -1)){
                    if(i % 2 == 0){
                    System.out.print("+");    
                    }else{
                    System.out.print("-");    
                    }
                    
                    
                }else{
                    System.out.print("  ");
                }  

            }
            System.out.println();
        }
    }

    int cont =3;
    public void imprimirRNA(int tamanoRNA){
        System.out.println("*");
        for(int i = 1; i <= tamanoRNA; i++){
            System.out.print("+");
            for(int j = 1; j < i; j++){
                System.out.print(" "+ cont);
                cont++;
            }
            System.out.println(" *");
        }
    }


}
