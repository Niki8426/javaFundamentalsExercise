package ObjectAndClassesExercise.VehicleCatalog;

public class VehicleCatalog {

    String type;
    String model;
    String color;
    int horsepower;

    public VehicleCatalog(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s",this.type,this.model,this.color,this.horsepower);
    }
}
