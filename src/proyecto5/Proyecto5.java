package proyecto5;
import java.util.Random;

public class Proyecto5 {
    /*
        5. Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10)
        y posteriormente muestre en pantalla cada elemento de la lista junto con su
        cuadrado y su cubo
     */
    public static void main(String[] args) {

        int [] numeros=new int[10];

        Random random=new Random();

        int cuadrado []=new int[10];
        int cubo[]=new int[10];

        for (int i=0;i< numeros.length;i++){
            numeros [i] = random.nextInt(10);

            cuadrado[i] = numeros[i]*numeros[i];
            cubo[i] = cuadrado[i]*numeros[i];
        }

        System.out.println("Numero  cuadrado  cubo ");
        for (int i=0;i< numeros.length;i++){
            System.out.println(numeros[i]+"         "+cuadrado[i]+"       "+cubo[i]);
        }
    }
}
