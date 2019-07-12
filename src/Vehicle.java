public class Vehicle {
    public static void main(String[] args) {
        Vehiclestat minivan = new Vehiclestat();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("A minivan can carry " + minivan.passengers +
                " passengers over a distance of " + range + " miles.");
    }
}