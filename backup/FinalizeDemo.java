class Class1 {
Class1()
{
System.out.println("Object created");
}
// finalize()
protected void finalize() {
System.out.println("finalize() method called before object is destroyed");
}
}
public class FinalizeDemo {
public static void main(String[] args) {
Class1 obj = new Class1();
// Make object eligible for Garbage Collector
obj = null;
// Suggest JVM to run garbage collector
System.gc();
}
}