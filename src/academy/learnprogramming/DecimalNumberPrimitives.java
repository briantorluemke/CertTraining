package academy.learnprogramming;

public class DecimalNumberPrimitives {

    public static void main(String[] args) {

        float myNumber = 25.4f;  // have to add "f" or "F" for float

//        double before = 10_.25; // doesn't compile
//        double after = 10._25; // doesn't compile
//        double first = _10.25; //doesn't compile
//        double last = 10.25_; //doesn't compile

        double myDouble = 2.54;
        double myDouble2 = 2.54f;
        double anotherDouble = 2.45d; //can use "d" or "D" to represent Double

        double scientific = 5.000125E03; // -> 5000.125
        double scientific2 = 5.000125E3; // -> 5000.125
        double myDouble3 = 5000.125; // -> 5000.125

        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("myDouble = " + myDouble3);

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexPi = " + hexPi);
    }
}
