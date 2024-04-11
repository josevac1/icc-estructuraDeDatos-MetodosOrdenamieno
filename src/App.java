import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);
        MetodoOrdenamiento metodos =new MetodoOrdenamiento();
        int opcion;
        int[]arregloNumeros=new int[0];
        do{

            System.out.println("Menu Principal");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0.Salir");
            opcion=scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de su arreglo");
                    int tamano=scanner.nextInt();
                    arregloNumeros=new int[tamano];
                    for(int i=0;i<arregloNumeros.length;i++){
                        System.out.println("Ingrese los valores para"+(i+1)+";");
                        arregloNumeros[i]=scanner.nextInt();

                    }
                    metodos.imprimir(arregloNumeros);
                    break;
                case 2:
                    //sub Menu para escoger el metodo
                    mostrarSubMenuMetodos(scanner, metodos,arregloNumeros);

                    break;
                case 0:
                    System.out.println("Saliendo del programa...\nAdios");
                    break;
                default:
                    System.out.println("Opcion no valida. Repetir");    
            }
        
        }while(opcion!=0);

    }

    public static void mostrarSubMenuMetodos(Scanner scanner,MetodoOrdenamiento metodos,int[]arreglo){
        int opcionMetodo;

        do{
            System.out.println("Escoja un metodo de ordenamiento");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo de Seleccion");
            System.out.println("3. Metodo Insercion");
            System.out.println("0. Regrese al menu principal");
            opcionMetodo=scanner.nextInt();

            switch (opcionMetodo) {
                case 1:
                    //Ingrese A-> Para logs y B -> sin logs
                    // string opcional
                    //boolean cond
                    //if opcionlog.equal
                    int [] arregloOrdenado=metodos.sortByBubble(arreglo, false);
                    metodos.imprimir(arregloOrdenado);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:

            }
        }while(opcionMetodo !=0);
    }
}
