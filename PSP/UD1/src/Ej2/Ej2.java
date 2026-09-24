package Ej2;

import java.io.IOException;

public class Ej2 {
    static void main(String[] args)  {
        try {
            ProcessBuilder p = new ProcessBuilder("cmd.exe");
            Process process = p.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
