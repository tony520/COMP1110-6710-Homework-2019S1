package comp1110.homework.O02;

public enum Element {
    H(1, 1, 1),
    He(2, 18, 1),
    Li(3, 1, 2),
    Be(4, 2, 2),
    B(5, 13, 2);

    public final int weight;
    public final int group;
    public final int period;

    public int[] facts = new int[3];

    Element(int weight, int group, int period) {
        this.weight = weight;
        this.group = group;
        this.period = period;
    }

    public int[] getFacts() {
        facts[0] = weight;
        facts[1] = group;
        facts[2] = period;

        return facts;
    }
}
