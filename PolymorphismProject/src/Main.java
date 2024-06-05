public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.6, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 red tesla model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 black ferrari sf90 stradale",
                16, 8, 8);
        runRace(ferrariHybrid);

    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}