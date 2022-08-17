package Animals;

public abstract class Animal {
    int height;
    int weight;
    String eyesColor;
    String color;

    public Animal(int height, int weight, String eyesColor, String color){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
        this.color = color;
    };


    public abstract void makeSound();

    public String printInfo(){
        return String.format("height : %d, weight : %d , eyesColor : %s, color : %s ", height, weight, eyesColor, color);
    }


}
