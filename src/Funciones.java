public class Funciones {
    public static void main(String[] args) {
        frase();
        suma(8, 04);
        int multi = Funciones.Multiplicar(5, 7);
        System.out.println(multi);
        String mensa = Funciones.Mensaje();
        System.out.println(mensa);
        int num = 56;
        String cambio_caracter = String.valueOf(num);
        System.out.println(cambio_caracter);
        System.out.println(Constantes.pi);
        Variables();
        // int valor_dificultad = Constantes.dificultad_extra("multiplo_de_3",
        // "mulriplo_de_5");
        // System.out.println(valor_dificultad);
        Constantes d = new Constantes();
        String r = d.determinar(2, "J7");
        System.out.println(r);
        System.out.println(d.dificultad_extra("dervis", "utrera"));
    }

    // sin retorno, ni parametros
    public static void frase() {
        System.out.println("La vida es bella");
    }

    // sin retorno y con mas de un parametros
    public static void suma(int a, int b) {
        int sumar = a + b;
        System.out.println(sumar);
    }

    // con retorno y parametros
    public static int Multiplicar(int a, int b) {
        int multipicardor = a * b;
        return multipicardor;
    }

    // con retorno sin parametros
    public static String Mensaje() {
        String msj = "Esto es un ejercicio";
        return msj;
    }

    public static void Variables() {
        int entero = 58;
        System.out.println(entero);
        System.out.println(Constantes.pi);
    }

    // variable global
    public static class Constantes {
        public static final double pi = 3.1415926535897932384626433832795;

        public int dificultad_extra(String cadena1, String cadena2) {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(cadena1 + " " + cadena2);
                } else if (i % 3 == 0) {
                    System.out.println(cadena1);
                } else if (i % 5 == 0) {
                    System.out.println(cadena2);
                } else {
                    System.out.println(i);
                    count += 1;
                }
                
            }
            return count;
        }

        public String determinar(int nume, String palabra) {
            String nuevo;
            if (nume % 2 == 0 && palabra.equals("J7")) {
                nuevo = "Exito";
            } else {
                nuevo = "Fracaso";
            }
            return nuevo;
        }
    }
}
