public class MetodoOrdenamiento {

    //Metodo burbuja que devuelve un arreglo de enteros ordenados por burbuja
    //Agregar una condicion que me imprima o no los pasos
    public int[] sortByBubble(int[] arreglo, boolean logs){
        //code to sort

        //obtener el tamaño del arreglo
        int tamano=arreglo.length;
        //Es el buble externo que va a recorre todo el arreglo
        for(int i=0; i<tamano; i++){
            if(logs){

            
            System.out.println("Pasando numero "+ i );
            }
            //Buble for interno que compara el elemento acual con los siguientes 
            for(int j=i+1;j<tamano;j++){
                if (logs){
                    System.out.println(" i="+arreglo[i]+"j="+arreglo[j]);
                }
                if(arreglo[i]>arreglo[j]){
                    if (logs){
                        System.out.println(" -- Si es mayor asi que cambio ");
                    }
                    //Intercambiamos dos elementos 
                    int temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                    if (logs) {}
                        System.out.println(" ");
                        imprimir(arreglo);
                    }
                }
            }
            return arreglo;
        
    }

    //Metodo que devulve un arreglo de entero  ordenado por Seleccion

    //Metodo que devuelve un arreglo de enteros ordenados por Insercion

    //
    public void imprimir(int[]arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
            
        }
        System.out.println();
    }

}
