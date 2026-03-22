
// realizado por Juan Chaparro y Enzo Díaz

import java.util.Scanner;

public class TriviaProgramacion {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
	// definir todas las variables
        int TotalProgramacion = 0;
        int TotalLogica = 0;
        int TotalCiudadania = 0;
        int TotalLengua = 0;
        int opcion = 0;                                                                                           
        char Respuesta = ' ';
		// menu principal
        while (opcion != 5) {
            System.out.println("==| TRIVIA DE MATERIAS |==");
            System.out.println("Elegí una materia a continuación:");
            System.out.println("1: Programación");
            System.out.println("2: Logica y Metodos Discretos");
            System.out.println("3: Ciudadania y Sociedad del Conocimiento");
            System.out.println("4: Lengua y Comunicacion Multimodal");
            System.out.println("5: Salir y ver puntajes");
            opcion = teclado.nextInt();
            teclado.nextLine(); /* este teclado.nextLine(); lo que hace de alguna manera es limpiar 
            la entrada de datos de la variable , ya que sino, nos sucedió que no se respetaba el orden de las preguntas o directamente no funciona ese programa */
         
            switch (opcion) { // preguntas empiezan aqui
                case 1: // programación
                    System.out.println("El tipo de variable char nos permite guardar cadenas de texto.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F' ) {
                        TotalProgramacion++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("En java, para poder utilizar numeros aleatorios, es necesario importar la librería Library.import.Randoms");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalProgramacion++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Para definir una variable, es necesario aclarar el tipo de valor a almacenar.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalProgramacion++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Java es un lenguaje fuertemente Tipado.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalProgramacion++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println ("Respuestas Correctas:"+TotalProgramacion);
                    break;
                        
                case 2: //logica
                    System.out.println("Indica el valor de esta proposición para P = Verdadero (p V (¬p))");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalLogica++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Indica el valor de esta proposición para P = Verdadero | Q = Falso (p → q)");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalLogica++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("El siguiente conector: → Indica Doble Implicacion");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalLogica++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Una Contingencia es cuando los valores de una proposicion en una Tabla de Verdad son Verdaderos o Falsos.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalLogica++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println ("Respuestas Correctas:"+TotalLogica);
                    break;
                        
                case 3: //ciudadania
                    System.out.println("Uruguay tiene una ley que hable explicitamente del  derecho al olvido.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalCiudadania++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("La Ley 18.331  Autoriza la recolección de datos sin informar al titular");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalCiudadania++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Los DD.HH Son: Universales; Exigibles; violables; Discriminatorios");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalCiudadania++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Utilizar caracteres especiales (!#$%&/,etc) Puede proteger mucho mas mi contraseña que añadir mi fecha de cumpleaños en la contraseña");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalCiudadania++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println ("Respuestas Correctas:"+TotalCiudadania);
                    break;
                   
                case 4: // APT
                    System.out.println("El concepto de comunicación ha cambiado en el tiempo.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalLengua++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("En nuestra escritura cotidiana, escribimos en forma de prosa. En el genero lírico también se escribe de esta forma.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalLengua++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("Un mito se basa en Personas Reales y Animales.");
                    System.out.println("v) Verdadero - f) Falso");
                    Respuesta = teclado.nextLine().charAt(0);
                    if (Respuesta == 'f' || Respuesta == 'F') {
                        TotalLengua++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println("El texto oral es espontaneo y en tiempo real; el escrito es planificado.");
                    System.out.println("v) Verdadero - f) Falso");
                  	Respuesta = teclado.nextLine().charAt(0); /* este charAt(0); es leer unicamente el primer carácter, ya que sino se confunde con un string. No usamos string ya que es innecesario aquí porque es V o F*/
                    if (Respuesta == 'v' || Respuesta == 'V') {
                        TotalLengua++;
                        System.out.println("Respuesta Correcta!");
                    } else {
                        System.out.println("Respuesta Incorrecta :(");
                    }
                    System.out.println ("Respuestas Correctas:"+TotalLengua);
                    break;
                    
                    
                case 5: // caso para dejar de jugar desde el menu
                    System.out.println("PUNTAJES FINALES:");
                    System.out.println("Programación: " + TotalProgramacion);
                    System.out.println("Logica y Metodos Discretos: " + TotalLogica);
                    System.out.println("Ciudadania y Sociedad del Conocimiento: " + TotalCiudadania);
                    System.out.println("Lengua y Comunicación Multimodal " + TotalLengua);
                    System.out.println("¡Muchísimas gracias por jugar a esta trivia! ¡Vuelve pronto!");
                    break;
                    
                    
                default: // opcion invalida
                    System.out.println("Opción inválida. Reintente eligiendo entre 1 y 5.");
            }
        }

        teclado.close();
    }
}
