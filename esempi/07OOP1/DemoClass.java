/******************************************************************/
/* Author: CS307 Course Staff                                     */
/* Date: February 14, 2005                                        */
/* Description: Demos constructors, static vs instance methods,   */
/*              and method overloading.                           */
/******************************************************************/
public class DemoClass
{
    private int x;

    public DemoClass()
    {
        // assign default value
        x = 0;
    }

    public DemoClass(int x)
    {
        // use this.x to refer to the instance variable x
        // use x to refer to a local variable x (more specifically,
        // method parameter x)
        this.x = x;
    }

    public DemoClass(DemoClass otherDemo)
    {
        // copy the value from the otherDemo
        this.x = otherDemo.x;
    }

    // static method (aka class method)
    public static void s1() {
        return;
    }
    // instance method
    public void i1() {
        return;
    }

    // static calling static OK
    // static calling instance is a compile-time error
    public static void s2() {
//        i1();     // compile-time error
        s1();       // DemoClass.s1
        return;
    }

    // instance calling static OK
    // instance calling instance OK
    public void i2() {
        s1();       // DemoClass.s1();
        i1();       // this.i1();
        return;
    }

    // call various versions of overload() based on their 
    // list of parameters (aka function signatures)
    public void overloadTester() {
        System.out.println("overloadTester:\n");

        overload((byte)1);
        overload((short)1);
        overload(1);
        overload(1L);
        overload(1.0f);
        overload(1.0);
        overload('1');
        overload(true);
    }
    
    public void overload(byte b) {
        System.out.println("byte");
    }    
    public void overload(short s) {
        System.out.println("short");
    }    
    public void overload(int i) {
        System.out.println("int");
    }
    public void overload(long l) {
        System.out.println("long");
    }
    public void overload(float f) {
        System.out.println("float");
    }
    public void overload(double d) {
        System.out.println("double");
    }    
    public void overload(char c) {
        System.out.println("char");
    }    
    public void overload(boolean b) {
        System.out.println("boolean");
    }    

    public static void main(String[] args) {
        DemoClass dc = new DemoClass();
        dc.overloadTester();
    }
}

// end of DemoClass.java

