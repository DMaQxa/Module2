import java.util.Arrays;

/**
 * Created by DAYu on 09.11.2016.
 */
public class Task2_1 {
    public static void main(String[] args) {
        int[] iarray = {1, 20, 32, 15, 7, 10, 5, 9, -5, -3};
        double[] darray = {1.1, 2.3, -3.5, 2.8, 5.6, -4.8, 7.2, 8.0, -9.3, 1.7};
        System.out.println("The iarray is" + Arrays.toString(iarray));
        System.out.println("The darray is" + Arrays.toString(darray));
        System.out.println("The sum of iarray elemnts "+sum(iarray));
        System.out.println("The sum of iarray elemnts "+sum(darray));
        System.out.println("Tme minimum elemt of iarray "+ min(iarray));
        System.out.println("The minimum element of the darray is " + min(darray));
        System.out.println("The maximum element of the iarray is " + max(iarray));
        System.out.println("The maximum element of the darray is " + max(darray));
        System.out.println("The maximum positive element of the iarray is " + maxPositive(iarray));
        System.out.println("The maximum positive element of the darray is " + maxPositive(darray));
        System.out.println("The multiplication of iarray elements is " + multiplication(iarray));
        System.out.println("The multiplication of darray elements is " + multiplication(darray));
        System.out.println("The modulus of the first and the last element of the iarray is "+ modulus(iarray));
        System.out.println("The modulus of the first and the last element of the darray is "+ modulus(darray));
        System.out.println("The second largest element of the iarray is " + secondLargest(iarray));
        System.out.println("The second largest element of the darray is  " + secondLargest(darray));

    }

    public static int sum (int array[]) {
        int res = 0;
        for (int num : array){
            res+=num;
        }
        return res;
    }
    public static double sum (double array[]){
        double res = 0;
        for (double num : array){
            res +=num;
        }
        return res;
    }
    public static int min (int array[]){
        int res = array [0];
        for (int num : array){
            if (res>num) res=num;
        }
        return res;
    }
    public static double min(double array[]){
        double res = array[0];
        for (double num : array)
        {
            if (res>num) res=num;
        }
        return res;
    }

    public static int max(int array[]){
        int res = array[0];
        for (int num : array)
        {
            if (res<num) res=num;
        }
        return res;
    }

    public static double max(double array[]){
        double res = array[0];
        for (double num : array)
        {
            if (res<num) res=num;
        }
        return res;
    }

    public static int  maxPositive(int array[]){
        int res = 0;
        for (int num : array)
        {
            if ((res<num)&&(num>0)) res=num;
        }

        return res;
    }

    public static double maxPositive(double array[]){
        double res = 0;
        for (double num : array)
        {
            if ((res<num)&&(num>0)) res=num;
        }

        return res;
    }

    public static int multiplication(int array[]){
        int res = 1;
        for (int num : array)
        {
            res*=num;
        }
        return res;
    }
    public static double multiplication (double array[]){
        double res = 1;
        for (double num : array)
        {
            res*=num;
        }
        return res;
    }
    public static int modulus(int array[]){
        return array[0] % array[array.length-1];
    }
    public static double modulus(double array[]){
        return array[0] %array[array.length-1];
    }
    public static int secondLargest (int array[]){
        int largest = array[0];
        int secondLargest = array[0];
        for (int num : array)
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest){
                secondLargest = num;
            }
        return secondLargest;
    }
    public static double secondLargest (double array[]){
        double largest = array[0];
        double secondLargest = array[0];
        for (double num : array)
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest){
                secondLargest = num;
            }
        return secondLargest;
    }
}
