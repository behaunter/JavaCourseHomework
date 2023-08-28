package algorithms.lesson_8;

public class Item implements Comparable<Item>{
    private final String name;
    private final int weight;
    private final float cost;

    public Item(String name, int weight, float cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(o.cost/o.weight,cost/weight);
    }
}
