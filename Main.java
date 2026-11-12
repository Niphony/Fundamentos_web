import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Inventario i = new Inventario();
    Videojuegos v = new Videojuegos(1, "test", 1, 1);

    int o = 0; 
       
      do {

     System.out.println("Elije una opcion: ");
     System.out.println("1. Añadir juego a carrito ");
     System.out.println("2. Ver juegos que hay en el carrito ");
     System.out.println("3. Pagar productos ");
     System.out.println("4. Ver Productos disponibles");
     System.out.println("5. Salir ");
       
     o = sc.nextInt();

     switch (o) {
      case 1:
      

        break;

      case 2:
        System.out.println("Elijiste la opcion 2 q sueño ");
        /*System.out.println(Arrays.toString(listaj));*/
         
        break;

      case 3:
        break;

      case 4:
        System.out.println("Nuestros Productos disponibles son: ");
        sc.nextLine();
        System.out.println(i.Inventarios() + " ");
        break;

      case 5:
        System.out.println("Saliendo....");
        break;
      default:
        System.out.println("Elije una opcion valida :D");
        break;
     }

   } while (o != 5); {


   }


  }




}
