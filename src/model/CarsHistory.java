/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;



/**
 *
 * @author Admin
 */
public class CarsHistory {
    
    private ArrayList<CarInfo> history;
    
    //constructor
    public CarsHistory(){
        this.history = new ArrayList<CarInfo>();
    }

    public ArrayList<CarInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarInfo> history) {
        this.history = history;
    }
    
    public CarInfo addNewCarDetails(){
        CarInfo newCars = new CarInfo();
        history.add(newCars);
        return newCars;
        
    }
    public void deleteCarDetails(CarInfo ci){
        history.remove(ci);
    }
}
