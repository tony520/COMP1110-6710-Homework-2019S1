package comp1110.homework.O04;


import java.util.ArrayList;
import java.util.Collection;

public class Sum extends ArrayList<Integer> {
    int sum = 0;

    public int sum() {
        return sum;
    }


    @Override
    public boolean add(Integer i) {
        sum += i;
        return super.add(i);
    }

    @Override
    public void add(int index, Integer i) {
        sum += i;

        super.add(index, i);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        c.forEach(x -> sum += x);

        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        c.forEach(x -> sum += x);
        return super.addAll(index, c);
    }
}