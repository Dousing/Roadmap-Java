import java.util.ArrayList;
import java.util.List;

public class valores_referencia {
    public static void main(String[] args) {
/************************PASO POR VALOR************* */
    int num1 = 6;
    int num2 = 35;
    System.out.println("\n");
    System.out.println("El valor del primer numero es: "+num1+" y el segundo es: "+num2);
    int aux = num1;
    num1 = num2;
    num2 = aux;
    System.out.println("Ahora en primer numero es :"+num1+" y el segundo es: "+num2);

/************************PASO POR REFERENCIA************* */
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(3);
    lista.add(6);
    lista.add(5);
    lista.add(9);
    System.out.println(lista);
    ArrayList<Integer> lista1 = new ArrayList<>();
    lista1 = lista;
    lista1.add(40);
        System.out.println(lista1);
        System.out.println(lista);
/***********************EJERCICIO EXTRA************** */

        /**************PASO DE VARIABLES POR referencia */
    List<String> lista_1 = new ArrayList<>();
    lista_1.add("hola");
    lista_1.add("dervis");
    List<String> lista_2 = new ArrayList<>();
    lista_2.add("mundo");
    lista_2.add("java");
    List<List<String>> lista_contenedor = new ArrayList<>();
    lista_contenedor = referencia(lista_1, lista_2);
    List<String> lista_prim = lista_contenedor.get(0);
    List<String> lista_seg = lista_contenedor.get(1);
    System.out.println(lista_prim+" "+lista_seg);
    //System.out.println(referencia(lista_1, lista_2));
    System.out.println(lista_1+" "+lista_2);

        /**************PASO DE VARIABLES POR VALOR */
    int a = 4;
    int b= 6;
    ArrayList<Integer> f = new ArrayList<>();
    f = datos(a,b);
    int g = f.set(0, 1);
    int h = f.set(1, 1);
    System.out.println("Valor 1: "+a+" valor b: "+b);
    System.out.println("Valor 1 :"+g+" valor 2: "+h);
    }

 /************* FUNCION PASO DE VARIABLES POR VALOR************/
    public static ArrayList<Integer> datos(int c, int d){
        ArrayList<Integer> lista = new ArrayList<>();
        int aux = c;
        c = d;
        d = aux;
        lista.add(c);
        lista.add(d);
        return lista;
    }
    /************* FUNCION PASO DE VARIABLES POR REFERENCIA************/
   
    public static List<List<String>> referencia(List<String> nom1, List<String> nom2){
        List<List<String>> lista_refe = new ArrayList<>();
        List<String> aux_ref = nom1;
        nom1 = nom2;
        nom2 = aux_ref;
        lista_refe.add(nom1);
        lista_refe.add(nom2);
        return lista_refe;
    }
}
