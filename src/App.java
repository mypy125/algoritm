import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] count = new int[10];
        // int[] count2 = new int[]{ 4, 9, 2, 4, 2};
        //int[] result = sortedSquares(count2);
        System.out.println(is_Even(4));
    


    }

    public static int calculation(int firstOperand, int secondOperand, char operator){
        int result = 0;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result  = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0){
                    result = firstOperand / secondOperand;
                }else{
                    throw new ArithmeticException("Деление на ноль");
                }
            default:
                throw new IllegalStateException("Неизвестный оператор"+operator);
        }
        return result;
    }

    
    public static double calculatingDiscount(double price, double discount){
        return price - (price * discount / 100);
    }

    public static boolean differentSigns(int num1, int num2) {
        return (num1 ^ num2) < 0;
    }

    public static int findNonRepeatingNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static boolean isPowerTwo(int number) {
        if (number <= 0) {
            return false;
        }
        int ans = number & (number - 1);
        return ans == 0;
    }

    public static Boolean is_Even (Integer i) {
        return (i % 2) == 0;
    }

    public static boolean isEven(int number) {
        return (number & 1) == 0;
    }

    public static int clearBit(int num, int clear) {
        int mask = ~(1 << clear);
        return num & mask;
    }

    public static int test(int a, int b) {
        int count = 3;
        return a > count ?  a : b;
    }

    public static double probability(int k, int n) {
        if (n == 0)return -1;
        return (double) k / n;
    }
    
    public static int arifmetic(int[] array){
        int result = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
            if (array[i] != 0) count++;
        }
        if (count == 0) return -1;
        return result / count;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static int findMin(int[] numbers) {
        int curentMin = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < curentMin) {
                curentMin = numbers[i];
            }
        }
        return curentMin;
    }

    public static int[] quickSort(int[] array, int startposition, int endposition) {
        int left = startposition;
        int right = endposition;
        int pivot = array[(startposition + endposition) / 2];
        
        do {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;
            
            if (left <= right) {
                if (left < right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                left++;
                right--;
            }
            
        } while (left <= right);
    
        if (left < endposition) {
            quickSort(array, left, endposition);
        }
    
        if (startposition < right) {
            quickSort(array, startposition, right);
        }
        return array;
    }


    public void duplicateZeros(int[] arr){
        
    }

    public static int[] merge(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++){
            result[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++){
            result[i + nums1.length] = nums2[i];
        }
        return result;
    }
    
    public static int[] delete(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < index; i++){
            result[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++){
            result[i - 1] = array[i];
        }
        return result;
    }

}
