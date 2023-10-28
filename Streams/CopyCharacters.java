package Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("F:\\Programmazione\\EserciziJava\\Streams\\xanadu.txt");
            outputStream = new FileWriter("F:\\Programmazione\\EserciziJava\\Streams\\outagain.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                char carattere = (char)c;
                if(carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u')
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }

            System.out.println("Ho finito!");
        }
    }
}