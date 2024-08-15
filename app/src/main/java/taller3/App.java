/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

   public static void main(String[] args) {
   

   }

   /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
    */

    public static String Escribir_asc(int a, int b, int c) {
      if (a == b || a == c || b == c) {
          return "Error: La función no considera números iguales";
      }
      int max = Math.max(a, Math.max(b, c));
      int min = Math.min(a, Math.min(b, c));
      int mid = a + b + c - max - min;
      return max + " - " + mid + " - " + min;
  }


   /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
    */

    public static byte Obtener_cifras(int num) {
      if (num < 0 || num > 50000) {
          return 0;
      }
      byte cifras = 0;
      while (num > 0) {
          num /= 10;
          cifras++;
      }
      return cifras;
  }


   /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

    public static String Clasificar_char(char c) {
      if (Character.isLetter(c)) {
          return "ES LETRA";
      } else if (Character.isDigit(c)) {
          return "ES NUMERO";
      } else {
          return "ESPECIAL";
      }
  }


   /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
    */

    public static String Hallar_division_exacta(int a, int b) {
      if (a <= 0 || b <= 0) {
          return "NO SE ADMITE CERO O NEGATIVOS";
      }
      if (a % b == 0) {
          return "DIVISION EXACTA";
      } else {
          return "DIVISION NO EXACTA";
      }
  }


   /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

    public static String Consultar_hab(byte camas, String tipo) {
      if (camas < 1 || camas > 3 || !(tipo.equals("AA") || tipo.equals("VE"))) {
          return "DATOS NO VÁLIDOS";
      }
      String habitaciones = "";
      if (camas == 2) {
          if (tipo.equals("AA")) {
              habitaciones += "101|301";
          } else {
              habitaciones += "102|202";
          }
      } else if (camas == 1) {
          if (tipo.equals("VE")) {
              habitaciones += "102";
          }
      } else if (camas == 3) {
          if (tipo.equals("AA")) {
              habitaciones += "201";
          }
      }
      return habitaciones;
  }

   
   /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

    public static String Obtener_obs(boolean plato1, boolean plato2, boolean plato3) {
      if (!plato1 && !plato2 && !plato3) {
          return "PLATOS NO VÁLIDOS";
      }
      if (plato1 && plato2 && plato3) {
          return "BEBIDA Y POSTRE";
      } else if (plato1 && plato2) {
          return "BEBIDA";
      } else if (plato1) {
          return "POSTRE";
      } else {
          return "";
      }
  }


   /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */
    public static String Conocer_invitacion(String color) {
      switch (color) {
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
  }
}
