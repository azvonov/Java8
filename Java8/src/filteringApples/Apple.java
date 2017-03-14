package filteringApples;


public class Apple {
    private String collor;
    private int weight;

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Apple(String collor, int weight) {
        this.collor = collor;
        this.weight = weight;
    }
}
