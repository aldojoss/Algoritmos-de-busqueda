import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

     Scanner leer =new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        App ap = new App();
        ap.pedirdatos();  
    }


public void pedirdatos (){

    Scanner leer =new Scanner (System.in);
    int tamaño;
    String arr[];
    String tadget;

do{  // pedir el tamano sin errores
try {
    System.out.println("Ingrese el tamaño de los productos a registrar");
 tamaño= leer.nextInt();
break;
} catch (Exception e) {
    System.out.println(e);
    System.out.println("Valor incorrecto!");
    leer.nextLine();
}

}while(true);

arr= new String[tamaño];

leer.nextLine();


do { //pedir los nombres de los productos
try {

for (int i=0;i<arr.length;i++){
System.out.println("----------------------------------");
  System.out.println(" Ingrese el producto numero "+(i+1));
arr[i]=leer.nextLine();
System.out.println("Producto agregado correctamente!");
}
break;

} catch (Exception e) {
    System.out.println(e);
    System.out.println("Valor incorrecto!");
    leer.nextLine();
}

}while(true);



do{
try {
    System.out.println("---------------------------------------");
    System.out.println("Ingrese el nombre del producto que desea buscar");
    tadget=leer.nextLine();
break;
} catch (Exception e) {
    System.out.println(e);
    System.out.println("Ingrese el nombre! del producto");
    leer.nextLine();
}
}while (true);



int resultado= ordenamientolineal(arr, tadget);

if (resultado==-1) {
    System.out.println("Producto no encontrado");
}else{
System.out.println("-------------------------------------------------------");
  System.out.println("Su producto se encuentra en la pocicion "+(resultado+1) );   
}


}

public static int ordenamientolineal (String[]A, String tadget){
 int i;

 for (i=0;i<A.length;i++){

if (A[i].equals(tadget)) {
    return i;
}

 }

    return -1;
}

}
