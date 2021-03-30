/**
 * Exercise
 */
public class Exercise {

    public static void main(String[] args) {
         
        int test1 = 12;
        int test2 = 99;

        System.out.println(in1020(test1,test2));
        
    }



//     Given 2 int values, return true if either of them is in the range 10..20 inclusive.


// in1020(12, 99) → true
// in1020(21, 12) → true
// in1020(8, 99) → false

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || b >= 10 && b <= 20);
    }
        
    
}