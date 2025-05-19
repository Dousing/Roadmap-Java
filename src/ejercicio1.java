//https://www.java.com/es/
/* asi se comenta 
 * en varias
 * lineas
 */
public class ejercicio1{
    public static void main(String[] args){
        String nombre = "Dervis";
        char caracter = 'D';
        final String apellido = "Utrera";
        int edad = 35;
        float media = 6.5f;
        double doble = 34.98;
        boolean valor = true;
        nombre = "Orlando";
        
        System.out.println("Hola Java");
        if (edad >= 18){
            System.out.println(nombre+" " + apellido + " es mayo de edad tiene: "+edad+" años");
        }
        System.out.println("Este es tipo string "+nombre+" este es caracter" +caracter+" este es constante "+apellido);
        System.out.println("Este es decimal" +media+" este es decimal tambien "+doble);
        System.out.println("Este es tipo booleano "+valor);

    }

}