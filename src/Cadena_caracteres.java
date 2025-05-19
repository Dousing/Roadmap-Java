import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

public class Cadena_caracteres {
public static void main(String[] args){
/***********CONSULTANDO EL TAMAÑO DE LA CADENA****** */
        String cadena = "Hola Java";
        System.out.println("La cadena contiene "+ cadena.length() +" caracteres");

/************COMPARANDO SI DOSCADENAS SON IGUALES************* */
        String nombre1 = "dervis";
        String nombre2 = "dervis";
        System.out.println("Las 2 palabrad son: "+ nombre1.equals(nombre2));

/*************TRANSFORMANDO DE MUNISCULA A MAYUSCULA************ */
        String nue_nomb = "daniel";
        System.out.println(nue_nomb.toUpperCase());

/*************TRANSFORMANDO DE MAYUSCULA a muniscula************ */
        String minu_nomb = "DERVIS";
        System.out.println(minu_nomb.toLowerCase());

/************COMPARANDO SI DOSCADENAS SON IGUALES IGNORANDO MINUSCULAR Y MAYUSCULAS************* */
        String nomb1 = "dervis";
        String nomb2 = "dervis";
        System.out.println("Las 2 palabrad muniscula y mayuscula son: "+ nomb1.equalsIgnoreCase(nomb2));

/************ESTRAYENDO UN CARACTER DE ACUERDO A SU POSICION************* */
        String nomb3 = "dervis";
        System.out.println("El primer caracter es: "+ nomb3.charAt(3));

/************USANDO COMPARETO************* */
        String nomb4 = "dervis";
        String nomb5 = "Dervis";
        System.out.println(nomb4.compareTo(nomb5));
        System.out.println(nomb4.compareTo(nomb5));

/************BUSCANDO UN VALOR DENTRO DE UNA CADENA USANDO INDEXOF************* */
Pattern pattern = Pattern.compile("[a]");
String last_nom = "paranricutirimicuaro";
Matcher matcher = pattern.matcher(last_nom);
int count = 0;
while(matcher.find()){
count++;
}
        System.out.println(count);
        System.out.println(last_nom.indexOf("a"));
        System.out.println(nomb4.indexOf("e", 1));

/************BUSCANDO UN VALOR DENTRO DE UNA CADENA USANDO LASTINDEXOF************* */
        String cade = " hola dervis";
        System.out.println(cade.lastIndexOf("dervis"));
        System.out.println(cade.lastIndexOf("i", 5));

/************BUSCANDO UN VALOR DENTRO DE UNA CADENA USANDO STARTSWITH************* */
        System.out.println(cade.startsWith("h"));
        System.out.println(cade.startsWith("i", 10));

/************BUSCANDO UN VALOR DENTRO DE UNA CADENA USANDO ENDSWITH************* */
        System.out.println(cade.endsWith("s"));

/************EXTRAYENDO UNa PORCION DE UNA CADENA CON SUBSTRING************* */
        System.out.println(cade.substring(4));
        System.out.println(cade.substring(5, 9));

/************ELIMINANDO ESPACIOS EN BLANCO CON TRIM************* */       
        System.out.println(cade);
        System.out.println(cade.trim());

/**************USANDO VALUEOF PARA TRANFORMAR CADENAS A STRING */
        double numero = 22.3;
        System.out.println(String.valueOf(numero));
        //System.out.println(numero.consta());
        String input = "Here is a test string.";
        String test = "is";

	
	System.out.println("input.contains(test) = " + input.contains(test));

/*******************EJERCICIO EXTRA PALABRAS POLIDROMOS************* */
    String hola = "SoM os";
    String quitar_espa = hola.replace(" ", "").toUpperCase();
    String acumulador = "";
    for(int i = quitar_espa.length()-1; i >= 0; i--){
        char d = quitar_espa.charAt(i);
        acumulador= acumulador + d;
        //System.out.println(d);
    }

    if (quitar_espa.equalsIgnoreCase(acumulador)) {
        System.out.println("la palabra: ("+quitar_espa+") es una palabra Polidromo");
    }else{
        System.out.println("la palabra "+acumulador+" no es igual que "+hola);
    }

/*******************EJERCICIO EXTRA PALABRAS ANAGRAMAS************* */
        String text1 = "ballena";
        text1 =text1.toUpperCase();
        String text2 = "Llenaba";
        text2 = text2.toUpperCase();
        char[] text = new char[text1.length()];
        char[] tex = new char[text2.length()];
        if (text1.length() == text2.length()){
                for (int i = 0; i < text1.length(); i++) {
                text[i] = text1.charAt(i);
                }
                for (int j = 0; j < text2.length(); j++) {
                tex[j] = text2.charAt(j);
                }
                Arrays.sort(text);
                Arrays.sort(tex);
                if(Arrays.equals(text, tex) == true){
                        System.out.println(text1+" y "+text2+" son ANAGRAMAS");
                        //System.out.println(Arrays.toString(tex)); 
                        //System.out.println(Arrays.toString(text));
                }else{
                        System.out.println(text1+" y "+text2+" no son ANAGRAMAS");
                }
        }else{
                System.out.println("Las palabras no poseen la misma longitud");   
        }

/*******************EJERCICIO EXTRA PALABRAS ISOGRAMAS************* */
        String palabra_isogra = "Dialogo";
        HashMap<Character, Integer> mp_isogra = new HashMap<>();
        for(int i = 0; i < palabra_isogra.length(); i++){
                char letra_divi = palabra_isogra.charAt(i);
                if (!mp_isogra.containsKey(letra_divi)){
                        mp_isogra.put(letra_divi, 1);
                }else{
                        mp_isogra.put(letra_divi, mp_isogra.get(letra_divi)+1);
                }
        }
        //System.out.println(mp_isogra);
        int count1 = 0;
        for(Map.Entry<Character, Integer> entrada : mp_isogra.entrySet()){
                if(entrada.getValue().equals(2) == true){
                        count1++;       
                }
        }

        if (count1 > 0){
            System.out.println("LA PALABRA "+palabra_isogra+" ES ISOGRAMA");
        }else{
            System.out.println("LA PALABRA "+palabra_isogra+" ES HETEROGRAMA");
        }
    }
    
}