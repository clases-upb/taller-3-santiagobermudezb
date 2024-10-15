/*
 * Esta clase contiene las funciones implementadas para el Taller 3.
 */
package taller3;

public class App {

    public static void main(String[] args) {
        // Aquí puedes probar las funciones si lo deseas
    }

    /*
     * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
     * reciba tres números enteros diferentes y devuelva un String en orden
     * ascendente con el siguiente formato: "##### - ##### - #####", donde el
     * primero es el mayor de todos, el segundo el del medio, el tercero el menor de
     * todos. Si hay al menos dos números iguales, devolverá el mensaje: "Error: La
     * función no considera números iguales". Si hay un error inesperado, deberá
     * mostrar el mensaje: "Ocurrió un error inesperado".
     */
    public static String Escribir_asc(int a, int b, int c) {
        try {
            if (a == b || b == c || a == c) {
                return "Error: La función no considera números iguales";
            }

            int max, mid, min;

            if (a > b && a > c) {
                max = a;
                if (b > c) {
                    mid = b;
                    min = c;
                } else {
                    mid = c;
                    min = b;
                }
            } else if (b > a && b > c) {
                max = b;
                if (a > c) {
                    mid = a;
                    min = c;
                } else {
                    mid = c;
                    min = a;
                }
            } else {
                max = c;
                if (a > b) {
                    mid = a;
                    min = b;
                } else {
                    mid = b;
                    min = a;
                }
            }

            return max + " - " + mid + " - " + min;
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
     * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
     * recibe un número entre 0 y 50.000 y devuelve un byte con las cifras que
     * tiene. Por ejemplo, 10 tiene dos cifras, 9999 tiene 4 cifras. Si el número no
     * está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
     */
    public static byte Obtener_cifras(int numero) {
        try {
            final int n_max = 50000, n_min = 0;

            if (numero < n_min || numero > n_max) {
                return 0; // número fuera de rango
            }
            String strNumero = String.valueOf(numero);
            return (byte) strNumero.length();
        } catch (Exception e) {
            return -1; // error inesperado
        }
    }

    /*
     * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
     * recibe un caracter, y devuelve un string de acuerdo con las siguientes
     * condiciones: si es un alfabético, devuelve "ES LETRA"; si es numérico,
     * devuelve "ES NUMERO"; si es un carácter especial, devuelve "ESPECIAL". Los
     * caracteres se validan de acuerdo con la tabla ASCII básica y lo explicado en
     * clase. Si hay un error inesperado, deberá mostrar el mensaje: "Ocurrió un
     * error inesperado".
     */
    public static String Clasificar_char(char caracter) {
        try {
            if (Character.isLetter(caracter)) {
                return "ES LETRA";
            } else if (Character.isDigit(caracter)) {
                return "ES NUMERO";
            } else {
                return "ESPECIAL";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
     * 4. Construya un algoritmo e implemente la función en Java Hallar_division_exacta
     * que pida dos números enteros, calcule la división del primero sobre el segundo,
     * y al final si la división es exacta, devuelva "DIVISION EXACTA" y de lo
     * contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene cociente,
     * pero no residuo). Si alguno de los dos números que recibe es cero o negativo,
     * devuelva "NO SE ADMITE CERO O NEGATIVOS". Si hay un error inesperado, deberá
     * mostrar el mensaje: "Ocurrió un error inesperado".
     */
    public static String Hallar_division_exacta(int num1, int num2) {
        try {
            final int cero = 0;

            if (num1 <= cero || num2 <= cero) {
                return "NO SE ADMITE CERO O NEGATIVOS";
            }
            int resto = num1 % num2;
            if (resto == cero) {
                return "DIVISION EXACTA";
            } else {
                return "DIVISION NO EXACTA";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
     * 5. Construya un algoritmo e implemente la función en Java Consultar_hab que
     * reciba en un byte el número de camas y en un string si desea VE o AA, y
     * devuelva en un texto el o los números de habitación que cumplen ese requisito.
     * Si son varias habitaciones, devuélvalas separadas por el carácter "|" 
     * (normalmente, al lado izquierdo de la tecla del 1). Ejemplo: "101|301". 
     * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE, 
     * devuelva "DATOS NO VÁLIDOS". Si hay un error inesperado, deberá mostrar el mensaje: 
     * "Ocurrió un error inesperado".
     */
    public static String Consultar_hab(byte numCamas, String tipo) {
        try {
            if (numCamas < 1 || numCamas > 3) {
                return "DATOS NO VÁLIDOS";
            }
            if (!tipo.equals("AA") && !tipo.equals("VE")) {
                return "DATOS NO VÁLIDOS";
            }
            String habitaciones = "";
            if (numCamas == 1 && tipo.equals("VE")) {
                habitaciones = "102";
            } else if (numCamas == 2 && tipo.equals("AA")) {
                habitaciones = "101|301";
            } else if (numCamas == 2 && tipo.equals("VE")) {
                habitaciones = "202";
            } else if (numCamas == 3 && tipo.equals("AA")) {
                habitaciones = "201";
            }
            return habitaciones;
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
     * 6. Construya un algoritmo e implemente la función en Java Obtener_obs que
     * reciba 3 booleanos, uno para cada plato y en un String devuelva el obsequio
     * ganado en mayúscula, así: "BEBIDA", "POSTRE", "BEBIDA Y POSTRE". Si los 3
     * platos vienen en false, devuelva "PLATOS NO VÁLIDOS". Si hay un error
     * inesperado, deberá mostrar el mensaje: "Ocurrió un error inesperado".
     */
    public static String Obtener_obs(boolean plato1, boolean plato2, boolean plato3) {
        try {
            if (!plato1 && !plato2 && !plato3) {
                return "PLATOS NO VÁLIDOS";
            } else if (plato1 && plato2 && plato3) {
                return "BEBIDA Y POSTRE";
            } else if (plato1 && plato2) {
                return "BEBIDA";
            } else if (plato1) {
                return "POSTRE";
            } else {
                return "NO HAY OBSEQUIO";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
     * 7. Construya un algoritmo e implemente la función en Java Conocer_invitacion que
     * reciba un string con el color de la bola y retorna un String con exactamente
     * el texto de la invitación correspondiente. Si hay un error inesperado, deberá
     * mostrar el mensaje: "Ocurrió un error inesperado".
     */
    public static String Conocer_invitacion(String color) {
        try {
            switch (color.toLowerCase()) {
                case "verde":
                    return "Invita a las cervezas";
                case "azul":
                    return "Invita a la pizza";
                case "rojo":
                    return "Invita al postre";
                case "amarillo":
                    return "Paga el parqueadero de todos";
                case "blanco":
                case "negro":
                    return "Vaya y disfrute";
                default:
                    return "Error en el color";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }
}
