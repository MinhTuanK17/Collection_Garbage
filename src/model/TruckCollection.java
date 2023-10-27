/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author MINH TUAN
 */
public class TruckCollection {

    private double totalTime = 0;
    private int count = 0;
    private int totalWeight = 0;

    public void addStation(ArrayList<Integer> stationWeights) {

        for (Integer stationWeight : stationWeights) {
            if (totalWeight + stationWeight > 10000) {
                totalWeight = 0;
                totalTime = totalTime + 30;
                count++;
            }
            totalWeight += stationWeight;

        }
        totalTime += stationWeights.size() * 8;
        count++;
    }

    public void finish() {
        totalTime += 30;
    }

    public double getTotalCost() {
        return (((double)totalTime / 60) * 120000) + 57000 * count;
    }
}
