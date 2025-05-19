import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class prueba{
    public static void main(String[] args) {
        insertContact();
        System.out.println("Hola Dervis de nuevo Hola Mundo");
    
    String hola = "Si se pude";
    int valor = 35;
    if (valor >= 18){
        System.out.println(hola + " es mayor de edad, tiene "+ valor);
    }else{
        System.out.println(hola + " es menor de edad, tiene "+ valor);
    }
    Scanner input = new Scanner(System.in); 
     List<String> lista = new ArrayList<>();
     System.out.println("Ingrese su Nombre");
     lista.add(input.nextLine());
     System.out.println("Ingrese su Edad");
     lista.add(input.nextLine());
     System.out.println(lista);
     input.close();
    }

    private static Map<String, String> contacts = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    // Método para insertar un contacto
    private static void insertContact() {
        System.out.print("Introduce el nombre del contacto: ");
        String name = scanner.nextLine().trim();

        if (contacts.containsKey(name)) {
            System.out.println("El contacto ya existe.");
            return;
        }

        System.out.print("Introduce el número de teléfono: ");
        String phone = scanner.nextLine().trim();

        if (isValidPhone(phone)) {
            contacts.put(name, phone);
            System.out.println("Contacto agregado correctamente.");
            System.err.println(contacts);
        } else {
            System.out.println("Número de teléfono no válido. Debe ser numérico y tener hasta " + MAX_PHONE_DIGITS + " dígitos.");
        }
    }

    // Método para validar un número de teléfono
    private static final int MAX_PHONE_DIGITS = 11;
    private static boolean isValidPhone(String phone) {
        return phone.matches("\\d{1,11}");
    }
    
}