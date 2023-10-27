/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.TruckCollection;

/**
 *
 * @author MINH TUAN
 */
public class CollectGarbageManager {

    TruckCollection tc = new TruckCollection();
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> stationWeights = new ArrayList<>();
        System.out.println("Enter the amount of garbage at each station (in kg), end with any non-numeric input:");

        while (scanner.hasNextInt()) {
            stationWeights.add(scanner.nextInt());
            System.out.println("Please enter any character to stop");

        }

        tc.addStation(stationWeights);
        tc.finish();
        System.out.println(tc.getTotalCost());
    }

}
