/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfjava;

/**
 *
 * @author Deus
 */
import java.io.*;

public class JavaFXTensorflow {

    public static void main(String a[]) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "brain.py", "daisy.jpg");
            Process p = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            System.out.println("value is : " + in.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
