package Loading;

import java.util.Random;

public class cargaLoading {
    public static void barraPorc(char caracterP, int longitud){
        for(int i = 0; i <= longitud; i++){
            int porcetaje = (i * 100)/longitud;

            StringBuilder barra = new StringBuilder("[");
            for(int j = 0; j < longitud; j++){
                if(j < i){
                    barra.append(caracterP);
                }else{
                    barra.append(" ");
                }
            }
            barra.append("] ");

            System.out.print("\r" + barra + porcetaje + "%");

            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("\n!Carga completada!");
    }

    public static void waiting(int duracion){
        String[]patrones = {"o0o", "0o0", "oo0", "o0o"};
        int progreso = 0;

        while (progreso <= 100) {
            String patron = patrones[progreso % patrones.length];

            System.out.print("\r" + patron + " " + progreso + "%" );

            progreso += 1;

            try{
                Thread.sleep(duracion);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n¡Carga Completa!");
    }

    public static final String Figura = "      \\|||/\n     (> <)\n  ooO-(_)-Ooo";

    public static void animacionFigura(int duracion1) {
        int maxPosicion = 20;
        for(int i = 0; i <=  maxPosicion; i++){
            imprimirFiguraConEspacios(i);
            esperar(duracion1);
        }

        for(int i = maxPosicion -1 ; i>= 0; i--){
          imprimirFiguraConEspacios(i);
          esperar(duracion1);   
        }  
    }
    
    private static void imprimirFiguraConEspacios(int espacios){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String padding = " ".repeat(espacios);
        System.out.println(padding + Figura.replace("\n", "\n" + padding));
    }

    private static void esperar(int duracion1){
        try{
            Thread.sleep(duracion1);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }

    public static void ondasMusica(int numBar) {
        Random random = new Random();
        int[] heights = new int[numBar];

        for (int i = 0; i < numBar; i++) {
            heights[i] = random.nextInt(9); 
        }

        for (int level = 8; level >= 0; level--) {
            StringBuilder line = new StringBuilder();
            for (int height : heights) {
                if (height >= level) {
                    line.append("█ "); 
                } else {
                    line.append("  "); 
                }
            }
            System.out.println(line);
        }
    }
}