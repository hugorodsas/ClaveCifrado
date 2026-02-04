import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public  class Main {
    public static void main(String[] args) {
        StringBuilder clave = new StringBuilder();

        char letra = ' ';
        int contador = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader("Clave.txt"));){
            String line;
            while ((line = reader.readLine())!=null& contador<10) {
                letra = line.charAt(line.length()-1);

                clave.append(letra);
                contador++;
            }
        }catch (IOException | NumberFormatException e) {
            System.out.println("Error al escribir la clave.");
            return;
        }

        while(contador<10){
            clave.append(letra);
            contador++;
        }
        System.out.println("La clave generada es: " + clave);
    }
}
