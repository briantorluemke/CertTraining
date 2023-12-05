package academy.exercises;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] myArray = new int[]{2,4,6,8};
        for (int i = 0; myArray.length > i;i++ ) {
            System.out.println(myArray[i]);
        }
        System.out.println(calcSum(myArray));
    }

    public static int calcSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
