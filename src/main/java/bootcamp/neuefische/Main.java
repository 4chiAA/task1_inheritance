package bootcamp.neuefische;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("VW", "Golf", 2008);
        Car car1 = new Car();

        car1.setProducer("BMW");
        car1.setModel("X3");
        car1.setConstructionYear(2015);
        car1.setNumberDoors(4);

        vehicle1.showInformation();
        car1.showInformation();

        Motorcycle motorcycle1 = new Motorcycle("Honda", "CBR900", 1997, "Chopper");
        Car car2 = new Car("Audi", "A3", 2012, 5);

        car2.showInformation();
        motorcycle1.showInformation();




    }
}