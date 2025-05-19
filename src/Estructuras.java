import java.util.*;

public class Estructuras {
    public static void main(String[] args) {
        //array();
        //conjuntos();
        //Mapas();
        //Matriz();
        //array_list();
        //pilas();
        //Colas();
        difucultad_extra();
    }
//RECORRIENDO UNA LISTA
    public static void array (){
        int[] arreglo = {9,2,3,4,5};
        Arrays.sort(arreglo);
        System.out.println("ordenado "+Arrays.toString(arreglo));
        for (int i : arreglo){
        System.out.println(i);
        }
    }
//Conjunto con agregar, buscar, eliminar y mostrar
    public static void conjuntos(){
        HashSet<String> conjunto = new HashSet<>();
        Scanner input = new Scanner(System.in);
        boolean choise = false;
        while (choise == false) {
            System.out.println("Quiere ingresar un nombre? 'si/no'");
            String pregunta = input.nextLine();
        
        if (pregunta.equalsIgnoreCase("no")){
                break;
        }else{
            System.out.println("Ingrese nombre: ");
            conjunto.add(input.nextLine());
        }
        input.close();
    }
            boolean busca = conjunto.contains("Dervis");
            boolean borrar = conjunto.remove("Daniel");
            System.out.println(borrar);
            System.out.println(busca);
            System.out.println(conjunto);

    }

//ESTRUTURA DE MAPA    
    public static void Mapas(){
        HashMap<String , String> mapa = new HashMap<>();
        Scanner mp = new Scanner(System.in);
        boolean recorrer = false;
        while (recorrer == false) {
            System.out.println("Desea ingresar nombre y edad s/n?");
            String desicion = mp.nextLine();
            if (desicion.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.println("Ingrese nombre");
                String nombre = mp.nextLine().trim();
                if (mapa.containsKey(nombre)) {
                    System.out.println("La persona ya existe.");
                    return;
                }
                System.out.println("Ingrese edad");
                String  edad = mp.nextLine().trim();
                mapa.put(nombre, edad);
            }
            mp.close();
        }
        
        String persona = mapa.get("Dervis");
        System.out.println("BUSCANDO UN VALOR DE ACUERDO A UNA KEY");
        System.out.println("La edad de Dervis es: "+persona);
        System.out.println("IMPRIMENDO EL MAPA");
        System.out.println(mapa);
        mapa.put("Dervis","25");
        System.out.println("IMPRIMIENDO EL MAPA CON LA ACTIALIZACION DE UN VALOR");
        System.out.println(mapa);
        mapa.remove("Rosa");
        System.out.println("IMPRIMIENDO EL MAPA DESPUES DE HABER REMOVIDO UN DATO");
        System.out.println(mapa);
        
    }

//MATRIZ BIDIMENSIONAL
    public static void Matriz(){
        int [][] matriz = {{1,2,3}, {5,7,9}, {8,6,4}};
            System.out.println((matriz[1][1]));
    }

//ARRAYLIST
    public static void array_list(){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(3);
        lista.add(7);
        lista.add(5);
        System.out.println(lista);
        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);
        lista.remove(3);
        System.out.println(lista);
    }

//ESTRUCTURA PILA
    public static void pilas(){
        Stack<String> pila = new Stack<>();
        pila.push("Dervis");
        pila.add("Daniel");
        pila.push("Utrera");
        pila.add("Zambrano");
        System.out.println(pila);
        String ultimo = pila.peek();
        System.out.println("El ultimo valor de la pila "+ultimo);
        pila.pop();
        System.out.println(pila);
        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
    }

//ESTRUCTURA COLA
    public static void Colas(){
        Queue<String> cola = new LinkedList<>();
        cola.add("Leche");
        cola.add("Cafe");
        cola.add("kepchu");
        cola.add("Mayonesa");
        cola.add("Mantequilla");
        System.out.println(cola);
        System.out.println(cola.peek());
        System.out.println(cola.poll());
        System.out.println(cola);
        System.out.println(cola.contains("Mayonesa"));
        cola.clear();
        System.out.println(cola);
    }

//DIFICULTAD EXTRA
public static HashMap<String, String> Agenda_Contactos = new HashMap<>();
public static Scanner scanner = new Scanner(System.in);
//FUNCION PRINCIPAL DIFICULTAD EXTRA
    public static void difucultad_extra(){
        boolean choise = true;
        while (choise == true) {
            System.out.println("\n*************Elija una opcion a realizar*************");
            System.out.println("1. Insertar Contacto");
            System.out.println("2. Buscar Contacto");
            System.out.println("3. Actualizar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Imprimir Lista");
            System.out.println("6. Finalizar");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    inserta_contacto();
                    break;
                case "2":
                    Buscar();
                    break;
                case "3":
                    Actualizar();
                    break;
                case "4":
                    Eliminar();
                    break;
                case "5":
                    System.out.println(Agenda_Contactos);
                    break;
                case "6":
                    choise = false;
                    System.out.println("********Hata luego!***********");
                    break;
                default:
                    break;
            }
           
            
        }
    }
//INSERTAR USUARIO
    public static void inserta_contacto (){
    System.out.println("Ingresar Nombre: ");
    String nombre = scanner.nextLine();
        if (Agenda_Contactos.containsKey(nombre)){
            System.out.println("El contacto ya se encuentra registrado");
            return;
        }
        System.out.println("Ingrese numero de telefono: ");
        String telf_num = scanner.nextLine();
        if (Telefono_isNumeric(telf_num) == false) {
            System.out.println("ERROR: EL numero de telefono supera en maximo aceptado o a Ingresado un Caracter!");
            System.out.println(telf_num.length());
        }else{
            Agenda_Contactos.put(nombre, telf_num);
            System.out.println("EL usuario fue creado correctatmente!");
              
  
        }  
    }

//FUNCION PARA BUSCAR EL NUMERO DE UNA PERSONA
    public static void Buscar(){
        System.out.println("Ingrese el Nombre a Buscar: ");
        String nombre_buscar = scanner.nextLine();
        if (Agenda_Contactos.containsKey(nombre_buscar) == true) {
            System.out.println(Agenda_Contactos.get(nombre_buscar));
        }else{
            System.out.println("El contacto no se encuentra registrado!");
        }
            
    }

//FUNCION ACTUALIZAR DATO
public static void Actualizar(){
    System.out.println("Ingrese el Nombre que desea Actualizar: ");
    String dato_actualizar = scanner.nextLine();
    if (Agenda_Contactos.containsKey(dato_actualizar) == true) {
        System.out.println("Ingrese numero de telefono: ");
        String telf_num = scanner.nextLine();
        if (Telefono_isNumeric(telf_num) == false) {
            System.out.println("ERROR: EL numero de telefono supera en maximo aceptado o a Ingresado un Caracter!");
            System.out.println(telf_num.length());
        }else{
            Agenda_Contactos.put(dato_actualizar, telf_num);
            System.out.println("EL usuario fue actualizado correctatmente!");
        }
    }else{
        System.out.println("El contacto no se encuentra registrado!");
    }
        
}

//FUNCION PARA ELIMINAR CONTACTO
public static void Eliminar(){
    System.out.println("Ingrese el Nombre a Buscar: ");
    String contacto_elimina = scanner.nextLine();
    if (Agenda_Contactos.containsKey(contacto_elimina) == true) {
        Agenda_Contactos.remove(contacto_elimina);
        System.out.println("El contacto "+contacto_elimina+" fue eliminado correctamenete!");
    }else{
        System.out.println("El contacto no se encuentra registrado!");
    }
        
}

//VALIDANDO QUE EL NUMERO DE TELEFONO SOLO TENGA NUMEROS
    public static boolean Telefono_isNumeric(String cadena) {

        /*boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }*/

        return cadena.matches("\\d{1,11}");
    }

}
