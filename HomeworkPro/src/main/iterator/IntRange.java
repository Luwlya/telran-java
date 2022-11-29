package iterator;

import java.util.Iterator;

public class IntRange implements Iterable<Integer> {
    int start;
    int end;

    public IntRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntRangeIterator(this);
    }

    public static void main(String[] args) {
        IntRange range1 = new IntRange(1, 7);
        for (int num : range1) {
            System.out.println(num);

        }
    }
}

class IntRangeIterator implements Iterator<Integer> {
    IntRange range;
    int current;

    public IntRangeIterator(IntRange range) {
        this.range = range;
        current = range.start;
    }

    @Override
    public boolean hasNext() {
        return current <= range.end;
    }

    @Override
    public Integer next() {
        return current++;
    }
}
