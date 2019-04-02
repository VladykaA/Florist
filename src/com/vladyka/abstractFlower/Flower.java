package abstractFlower;

public abstract class Flower implements Comparable {
    private String name;
    private int price;
    private int scape;
    private int freshness;

    public Flower(String name, int price, int scape, int freshness) {
        this.name = name;
        this.price = price;
        this.scape = scape;
        this.freshness = freshness;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScape() {
        return scape;
    }

    public void setScape(int scape) {
        this.scape = scape;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    @Override
    public int compareTo(Object compareFlower) {
        int compareFreshness = ((Flower)compareFlower).getFreshness();
        return this.getFreshness()- compareFreshness;
    }
}
