package Chap2_BehaviorParameterization;

public class Apple {
    private String Color;
    private int Weight;

    public Apple(String appleColor, int appleWeight){
        this.Color = appleColor;
        this.Weight = appleWeight;
    }

    public String getColor(){
        return this.Color;
    }

    public int getWeight(){
        return this.Weight;
    }
}
