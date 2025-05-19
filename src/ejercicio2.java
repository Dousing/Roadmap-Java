public class ejercicio2 {

    public static void main(String[] args) {

        //operadores aritmeticos
        System.out.println("**OPERADORES ARITMETICOS**");
        int num1 = 24;
        int num2 = 8;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multip = num1 * num2;
        int division = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Suma: "+suma+" Resta: "+resta+" Multiplicacion: "+multip+" Division: "+division+" Resto: "+resto);

        //operadores de asignacion
        System.out.println("**OPERADORES DE ASIGNACION**");
        int igual = 10;
        System.out.println(igual += 2);
        System.out.println(igual -=2);
        System.out.println(igual *=2);
        System.out.println(igual /=2);

        //operadores de comparacaion
        System.out.println("**OPERADORES DE COMPARACION**");
        System.out.println("El primer numero  es mayor al segundo numero: "+(num1 > num2));
        System.out.println("El primer numero  es mayor o igual al segundo numero : "+(num1 >= num2));
        System.out.println("El primer numero  es menor al segundo numero : "+(num1 < num2));
        System.out.println("El primer numero  es menor o igual al segundo numero : "+(num1 <= num2));
        System.out.println("El primer numero  es igual al segundo numero : "+(num1 == num2));
        System.out.println("El primer numero  es diferente al segundo numero : "+(num1 != num2));

        //operadores logicos
        System.out.println("**OPERADORES LOGICOS**");
        int num3 = 3;
        int num4 = 4;
        System.out.println("operador and "+((num3 + num4 == 7) && (num4 + num3 ==7)));
        System.out.println("operador or "+((num3 + num4 == 7) || (num4 + num3 ==9)));
        System.out.println("operador not "+((num3 + num4 != 7)));

        //operadores de incremento o decremento
        System.out.println("**OPERADORES DE CRECIEMTES Y DECRESIENTES**");
        int positivo = +num1;
        int negativo = -num2;
        System.out.println("numero positivo: "+positivo);
        System.out.println("numero negativo: "+negativo);
        num1++;
        System.out.println("incrementado: "+num1);
        num2--;
        System.out.println("decreciente: "+num2);

        //operadores ternarios
        System.out.println("**OPERADORES TERNARIOS**");
        String terna = ((num1 > num2)?"num1 es mayor que num2":"num1 no es mayor a num2");
        System.out.println(terna);

        //operadores bit
        System.out.println("**OPERADORES BITS**");
        int num5 = 10;
        int num6 = 3;
        System.out.println("Bit and " + (num5 & num6));
        System.out.println("Bit or " + (num5 | num6));
        System.out.println("Bit xor " + (num5 ^ num6));
        System.out.println("Bit desplazamiento derecha " + (num5 >> 1));
        System.out.println("Bit desplazamiento izquierda " + (num5 << num6));

        //operaciones de corversion de tipo
        System.out.println("**OPERADORES DE CONVERSION DE TIPOS**");
        int entero = 25;
        String  caracrter = String.valueOf(entero);
        System.out.println(caracrter);
        String palabra = "34";
        int cambio = Integer.parseInt(palabra);
        System.out.println(cambio);
        float decimal = 7.98f;
        int decimal_entero = (int) decimal;
        System.out.println(decimal_entero);
        int otro_numero = 67;
        double con_decimal = otro_numero;
        System.out.println(con_decimal);
        
        // estructura if
        System.out.println("ESTRUCTURA IF/ELSE IF");
        int num7 = 10;
        if (num7 >= 12 && num7 < 18){
            System.out.println("Esta en la adolescencia");
        }else if(num7 >= 18){
            System.out.println("es mayor de edad");
            }else{
             System.out.println("Esta en etapa de niñes");
        }

        // Estructura for
        System.out.println("ESTRUCTURA FOR");
        for (int i = 0; i <= 40; i++ ){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }

        //estructura while
        System.out.println("ESTRUCTURA WHILE");
        int num8 = 0;
        while (num8 <=20) {
            System.out.println(num8);
            num8 += 2;
        }

        //estructura swiche
        System.out.println("**ESTRUCTURA SWITCH**");
        String dia_semana = "Jueves";
        switch (dia_semana) {
            case "Lunes":
                System.out.println("Hoy es el dia Lunes");
                break;
            case "Martes":
                System.out.println("Hoy es el dia Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es el dia Miercoles");
                break;
            case "Jueves":
                System.out.println("Hoy es el dia Jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es el dia Viernes");
                break;
            case "Sabado":
                System.out.println("Hoy es el dia Sabado");
                break;
            case "Domingo":
                System.out.println("Hoy es el dia Domingo");
                break;
            default:
                System.out.println("No es ningun dia de la semana");
                break;
        }

        //Estructura con Break        
        System.out.println("**ESTRUCTURA BREAK**");
        for (int x = 0; x <= 40; x++) {
                if (x == 20){
                break;
                }
            System.out.println(x);
        }

        //estructura try
        System.out.println("**ESTRUCTURA TRY**");
        try {
            int divide = 10 / 0;
            System.out.println(divide);
        } catch (Exception e) {
            System.out.println("ERROR: la ejecucion no se pudo realizar");
        }

        //EJERCICIO ADICIONAL

       for(int i = 10; i <= 55; i++){
            //System.out.println(i);
            if (i % 2 == 0 && i != 16 && i % 3 !=0){
                System.out.println(i);
            }
        }
    }
}