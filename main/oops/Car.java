package oops;

public class Car {

    public static class Cars{
        String carName;
        String carModel;
        int carPrice;
    }

    public static void main(String [] args) {
        Cars car1 = new Cars();
        car1.carName = "FORD MUSTANG";
        car1.carModel = "1920 a series";
        car1.carPrice = 3000000;

        System.out.println(car1.carModel);


    }
}
