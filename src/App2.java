
public class App2 {
    
    public static void main(String[] args) {
        int[] array = new int[]{ 4, 9, 2, 4, 3};
        
        minPosNullCount(array);

        

    }

    public static void minPosNullCount(int[] array){
        int minusCount = 0;
        int positiveCount = 0;
        int nullcount = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                positiveCount++;
            }else{
                minusCount++;
            }
            if (array[i] == 0){
                nullcount++;
            }
        }
        System.out.println("minusCount:" + minusCount + "  positiveCount:" + positiveCount + "  nullcount:" + nullcount);
    }

    public static int[] zamen(int[] array){
        int[] result = new int[array.length];
        int reserv = 0;
        int max = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                array[i] = reserv;
            }else{
                result[i] = array[i];
            }
        }
        return result;
    }


    public static int cratno(int[] array, int kratno){
        int countCratno = 0;
        int countNocratno = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % kratno == 0){
                countCratno++;
            }else{
                countNocratno++;
            }
        }
        return countCratno > countNocratno ? countCratno : countNocratno;
    }
}
