package com.ianM.firstTime.features.data;
import java.io.*;
import com.ianM.firstTime.features.domain.FileRepository;

public class FileDataRepository implements FileRepository {

    private static FileDataRepository instance = null;

    public static FileDataRepository getInstance(){
        if (instance == null){
            instance = new FileDataRepository();
        }
        return instance;
    }


    @Override
    public boolean checkFirstTime(File file) {
        return file.length() ==0; //esta vacio?
    }

    @Override
    public File save(String filename) {
        return new File(filename);
    }

    @Override
    public int getContador(File filename) {
        int contador = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String linea = reader.readLine();
            if (linea != null && !linea.isEmpty()) { // Verificar si la línea no es nula ni está vacía
                contador = Integer.parseInt(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // Manejar el caso en que la línea no se pueda convertir a un número
            e.printStackTrace();
        }
        return contador;
    }

    @Override
    public void incrementarContador(File filename) {
        int contador = getContador(filename);
        contador++;
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)); // true para permitir agregar al final del archivo
            writer.write(String.valueOf(contador));
            writer.newLine(); // Agregar una nueva línea para separar el contador de sesiones si se vuelve a escribir
            writer.close(); // Es importante cerrar el BufferedWriter para asegurar que los cambios se guarden correctamente
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
