package comp1110.homework.O01;

public class BMI {
    public String name;
    public double height;
    public double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI() {
        return weight/(height*height);
    }

    @Override
    public String toString() {
        return (name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + this.getBMI() + "Kg/m^2");
    }
}
