public class App {
    public static void main(String[] args) throws Exception {
        //Crear la instancia de la (clase u objeto) MetodoOrdenamiento
        MetodoOrdenamiento metodoOrdenamiento=new MetodoOrdenamiento();
        //Creo el arreglo de entreros int[]
        int[] numero={30, 7, 12,5};
        //Mandar a imprimir mi arreglo
        metodoOrdenamiento.imprimir(numero);
        //Llamo al metodo sortByBubble y su respuesta guardo en la variable arreglOrdenadoBubble
        int [] arregloOrdenado=metodoOrdenamiento.sortByBubble(numero,false);
        //Mando a imprimir mi nuevo 
        metodoOrdenamiento.imprimir(arregloOrdenado);


        //TODO: hacer un menu que elja el metodo
    }
}
