package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Notebook> notebooks = new ArrayList<>();
        start(notebooks);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter minimum RAM capacity:");
        Double filterRAM = in.nextDouble();
        notebooks.removeIf(n -> filterRAM >= n.getRamCapacity());
        System.out.println("Enter screen size:");
        Double filterScreenSize = in.nextDouble();
        notebooks.removeIf(n -> !filterScreenSize.equals(n.getScreenSize()));
        System.out.println("Enter manufaturer:");
        String filterManufacturer = in.next();
        notebooks.removeIf(n -> !filterManufacturer.equalsIgnoreCase(n.getManufacturer()));

        for (Notebook note: notebooks) {
            System.out.println(note);

        }
    }

    public static void start(List<Notebook> notebooks){

        notebooks.add(
                new Notebook(16.0,
                        2.0,
                        15.2,
                        "Black",
                        3.5,
                        "Lenovo",
                        1000.0));
        notebooks.add(
                new Notebook(16.0,
                        1.0,
                        16.0,
                        "Black",
                        3.0,
                        "Asus",
                        1500.0));
        notebooks.add(
                new Notebook(8.0,
                        1.5,
                        17.0,
                        "Grey",
                        2.5,
                        "HP",
                        1200.0));
        notebooks.add(
                new Notebook(12.0,
                        0.5,
                        15.2,
                        "White",
                        3.2,
                        "Lenovo",
                        1120.0));
        notebooks.add(
                new Notebook(32.0,
                        1.0,
                        16.0,
                        "Red",
                        3.5,
                        "MSI",
                        2000.0));

        for (Notebook note: notebooks) {
            System.out.println(note);

        }
    }
}