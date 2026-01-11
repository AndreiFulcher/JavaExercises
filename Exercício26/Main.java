package Exercício26;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true))) {
            bw.write("Log entry at " + java.time.LocalDateTime.now());
            bw.newLine();
            System.out.println("Log entry added.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the log file: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            System.out.println("Log file contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the log file: " + e.getMessage());
        }
    }
}
