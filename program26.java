class Counter {
    // static variable shared by all objects
    private static int objectCount = 0;

    // constructor increments the counter each time a new object is created
    public Counter() {
        objectCount++;
    }

    // static method to get the count
    public static int getObjectCount() {
        return objectCount;
    }
}

public class program26 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Number of objects created: " + Counter.getObjectCount());

        Counter c4 = new Counter();
        System.out.println("After creating one more object: " + Counter.getObjectCount());
    }
}
