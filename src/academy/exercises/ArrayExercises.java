package academy.exercises;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] myArray = new int[]{2,4,6,8};
        for (int i = 0; myArray.length > i;i++ ) {
            System.out.println(myArray[i]);
        }
        System.out.println(calcSum(myArray));

        int[] newArray = new int[]{12,51,76,41,12};
        System.out.println(calculateMax(newArray));
    }

    public static int calcSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static int calculateMax(int[] array) {
        int max = 0;

        // better to use int max = array[0] here to start with a value in the array.

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

}
