import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        TODO:
        1. Leer el archivo "personas.csv" usando un BufferedReader.
        2. Saltar la primera línea del archivo (la cabecera).
        3. Por cada línea leída, crear un objeto Persona usando su constructor que recibe una cadena CSV.
        4. Guardar cada Persona en una lista (ArrayList).
        5. Imprimir en consola los datos de todas las personas almacenadas en la lista.
        */

        /*
        TODO:
        (Opcional) Divide las funcionalidades del main() en métodos y crea un método que pueda pedir datos por
        terminal y almacenarlos en el fichero CSV.
         */

        String archivo = args[0];
        BufferedReader br = null;
        List<Persona> PersonasCreadas = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(archivo));

            String linea =  br.readLine(); // Leemos la línea y la saltamos 👺🔥
            boolean condicion = false;

            while (linea != null) {
                if (!condicion) {
                    condicion = true;
                }else {
                    Persona persona = new Persona(linea); // Creamos una nueva persona 🤑👌
                    PersonasCreadas.add(persona); //Guardamos la persona en la lista 💀👺🔥
                }
                linea = br.readLine();
            }

            // Recorremos la lista de Personas 😎
            for (Persona persona : PersonasCreadas) {
                System.out.println(persona); // Y las mostramos 😲🕶🤏
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());;
        }

    }
}
