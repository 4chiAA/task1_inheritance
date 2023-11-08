package bootcamp.neuefische;

public class Motorcycle extends Vehicle{

    int noiseLevel;
    int range;
    String type;

    public Motorcycle(){

    }

    public Motorcycle(String producer, String model, int constructionYear, String type) {
        super(producer, model, constructionYear);
        this.type = type;
    }

    // Mit super() hat man auch Zugriff auf die Methoden der Elternklasse
    public void showInformation(){
        super.showInformation();
        System.out.println("type: " + type);
    }

}
