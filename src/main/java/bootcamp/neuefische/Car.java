package bootcamp.neuefische;

public class Car extends Vehicle {

    int numberDoors;


    public void showInformation() {
        System.out.println("producer: " + producer + ", model: " + model + ", year of construction: " + constructionYear + ", number of doors: " + numberDoors);
    }

    public Car() {

    }

    // Die super()-Methode ermöglicht den Aufruf des Konstruktors der Elternklasse
    public Car(String producer, String model, int constructionYear, int numberDoors) {
        super(producer, model, constructionYear);
        this.numberDoors = numberDoors;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
}
