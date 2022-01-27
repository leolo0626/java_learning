package GetStarted;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c;
        c = new Counter();
        c.increment();
        c.increment(3);
        int temp = c.getCount();
        c.reset();
        Counter d = new Counter(5);
        d.increment();
        Counter e = d; // assigns e to reference the same object as d
        temp = e.getCount();


    }
}
