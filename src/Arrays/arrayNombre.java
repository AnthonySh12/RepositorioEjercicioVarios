package Arrays;
public class arrayNombre {
    public void nombresX(String nombre, String apellido){
        int length = Math.max(nombre.length(), apellido.length());

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(j == i){
                    System.out.print(nombre.charAt(i % nombre.length()));
                }else if(j == length - i - 1){
                    System.out.print(apellido.charAt(i % apellido.length()));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
