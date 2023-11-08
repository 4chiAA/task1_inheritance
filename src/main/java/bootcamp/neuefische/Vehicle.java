package bootcamp.neuefische;

public class Vehicle {

    String producer;
    String model;
    int constructionYear;

    public void showInformation(){
        System.out.println("producer: " + producer + ", model: " + model + ", year of construction: " + constructionYear);
    }

    public Vehicle(){

    }

    public Vehicle(String producer, String model, int constructionYear){
        this.producer = producer;
        this.model = model;
        this.constructionYear = constructionYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }
}
