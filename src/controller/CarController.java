package controller;

import model.Car;

public class CarController {
    private Car[] cars = new Car[100];
    //skaldowe statyczne
    private static int index = 0;
    public static int getIndex (){
        return index;
    }
    public static void incrementIndex(){
        index++;
    }
    //-----------------z punktu obiektu tak jkaby tego co powuzehj nie bylo
    public void purchaseCar(String brand, String model, double price, int year) {
        Car c = new Car(brand, model, price, year);
        cars[getIndex()] = c;
        incrementIndex();
    }
    public void getCars() {
        for (int i = 0; i<getIndex();i++) {
            System.out.println(cars[i]);
        }
    }
}
