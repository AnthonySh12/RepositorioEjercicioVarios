package Series;

public class serieNum {

    public static void ejercicioS6(int tamanoS6) {
    
        for(int i = 1; i <= tamanoS6; i++){
            int num1 = i * i;
            System.out.print(num1 + " ");
        }
        System.out.println();
    }

    public static void ejercioS8(int tamanoS8 ){
        int c = 5;
        int d = 3;
        for(int i = 0; i <= tamanoS8; i++){
            int result = d + (i * c);
            System.out.print(result + " ");
        }
        System.out.println();
    }

    public static void ejercicioS12(int tamanoS12){
        //Ejercico S12:
        int f =0;
        for(int i = 1; i <= tamanoS12; i++){
            f+=i*2;
            System.out.print(f + " ");
        }

    }
    
}