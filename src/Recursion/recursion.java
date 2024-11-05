package Recursion;

public class recursion {
    public static int sumas(int a, int b){
        if(b==0){
            return a;
        }

        return sumas(a + 1, b -1);
    }

    public static void contador(int cont){

        if(cont < 0){
            return;
        }
        System.out.print("\r" + cont);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Se interrumpio la espera");
        }
        contador(cont - 1);
    }
}