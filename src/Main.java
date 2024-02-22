import com.ianM.firstTime.features.presentation.FileMain;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crear un archivo
        File archivo = FileMain.create("sources/fichero.txt");

        // Verificar si es la primera vez que se inicia sesión
        boolean primeraVez = FileMain.Check(archivo);
        if (primeraVez) {
            System.out.println("Bienvenido por primera vez.");
        } else {
            System.out.println("¡Bienvenido de nuevo!");
        }

        // Obtener el contador de sesiones y mostrarlo
        int contador = FileMain.getContador(archivo);
        System.out.println("Cantidad de veces que se ha iniciado sesión: " + contador);

        // Aumentar el contador de sesiones
        FileMain.increaseContador(archivo);
        System.out.println("Se ha aumentado el contador de sesiones.");

        // Obtener el contador de sesiones actualizado y mostrarlo
        contador = FileMain.getContador(archivo);
        System.out.println("Cantidad de veces que se ha iniciado sesión después de aumentar: " + contador);
    }
}