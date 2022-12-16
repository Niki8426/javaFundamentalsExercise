package ObjectAndClassesExercise.OrderByAge;

public class PersonData {
    private String name;
    private String id;
    private int age;

    public PersonData(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",this.name,this.id,this.age);
    }


}
