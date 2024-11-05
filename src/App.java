import java.util.Scanner;

import Arrays.arrayNombre;
import Automatas.Automatas;
import CadenaCaracteres.Caracteres;
import Figuras.Figuras;
import Loading.cargaLoading;
import Recursion.recursion;
import Series.serieNum;
import SeriesCaracteres.serieCarac;

public class App {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        
       // SERIE DE NUMEROS
        System.out.println("Ingrese un numero");
        int tamanoS6 = scanner.nextInt();
        serieNum.ejercicioS6(tamanoS6);
        scanner.nextLine(); 

        System.out.println("Ingrese un numero: ");
        int tamanoS8 = scanner.nextInt();
        serieNum.ejercioS8(tamanoS8);
        scanner.nextLine();

        System.out.println("Ingrese un numero: ");
        int tamanoS12 = scanner.nextInt();
        serieNum.ejercicioS12(tamanoS12);
        scanner.nextLine(); 

        // SERIES CARACTERES
        System.out.println("Ingrese un numero: ");
        int tamanoS = scanner.nextInt();
        serieCarac.serieDesignos(tamanoS);
        scanner.nextLine(); 

        System.out.println("Ingrese un numero");
        int tamanoCara = scanner.nextInt();
        serieCarac.serieDeAbecedario(tamanoCara);
        scanner.nextLine(); 
       
        // FIGURAS
        Figuras figuras = new Figuras();
        System.out.println("Ingrese el tamaño: ");
        int tamanoCuadrado = scanner.nextInt();
        figuras.imprimirCuadrado(tamanoCuadrado);
        scanner.nextLine(); 

        System.out.println("Ingrese el tamaño: ");
        int tamanoRombo = scanner.nextInt();
        figuras.imprimirRombo(tamanoRombo);
        scanner.nextLine(); 

        System.out.println("Ingrese el tamaño: ");
        int tamanoEscaleras = scanner.nextInt();
        figuras.imprimirEscaleras(tamanoEscaleras);
        scanner.nextLine(); 

        System.out.println("Ingrese el tamaño: "); 
        int tamanoCruz = scanner.nextInt();
        figuras.imprimirCruz(tamanoCruz);
        scanner.nextLine(); 

        System.out.println("Ingrese el tamaño: ");
        int tamanoRNA = scanner.nextInt();
        figuras.imprimirRNA(tamanoRNA);
        scanner.nextLine(); 

        // CADENA CARACTERES
        System.out.println("Ingrese una frase: ");
        scanner.nextLine(); 
        String frase = scanner.nextLine();
        int vocalCont = Caracteres.vocalCont(frase);
        System.out.println("La frase tiene " + vocalCont + " vocales");

        System.out.println("Ingrese una frase: ");
        String fraseC = scanner.nextLine();
        Caracteres transformacion = new Caracteres();
        transformacion.convertirFrase(fraseC);

        // ARRAY
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        arrayNombre nombreArray = new arrayNombre();
        nombreArray.nombresX(nombre, apellido);

        // LOADING
        System.out.println("Ingrese un caracter: ");
        char caracterP = scanner.next().charAt(0);
        cargaLoading.barraPorc(caracterP, 20);
        scanner.nextLine(); 

        System.out.println("Ingrese la duracion: ");
        int duracion = scanner.nextInt();
        cargaLoading.waiting(duracion);
        scanner.nextLine(); 

        System.out.println("Ingrese la duracion: ");
        int duracion1 = scanner.nextInt();
        cargaLoading.animacionFigura(duracion1);
        scanner.nextLine(); 

        int numBar = 10;
        cargaLoading.ondasMusica(numBar);

        // RECURSION
        System.out.println("Ingrese un numero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = scanner.nextInt();
        int resultado = recursion.sumas(a, b);
        System.out.println("La suma es: " + resultado);
        scanner.nextLine(); 

        System.out.println("Ingrese un numero: ");
        int cont = scanner.nextInt();
        recursion.contador(cont);
        scanner.nextLine(); 

        // AUTOMATAS
        Automatas automata1 = new Automatas();
        System.out.println("Ingrese una cadena para validar");
        scanner.nextLine(); 
        String cadena = scanner.nextLine();
        
        boolean esValida = automata1.validarCadena(cadena);
        System.out.println("La cadena es " + (esValida ? "valida" : "invalida"));

        System.out.println("Ingrese una contraseña: ");
        String clave = scanner.nextLine();

        if(Automatas.validarClave(clave)){
            System.out.println("La clave es válida");
        } else {
            System.out.println("La clave es inválida. Asegúrese de que contenga mayúsculas, minúsculas, números y caracteres especiales");
        }

        scanner.close();
    }
}
