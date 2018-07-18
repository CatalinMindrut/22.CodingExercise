public class SumOddRange {
    public static void main(String[] args) {
        System.out.println("The sum is " + sumOdd(1, 100));

    }
    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else
        return false;
    }
    public static int sumOdd(int start, int end){
        if(end < start || start < 0 || end < 0){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum = sum +i;
            }
        } return sum;
    }
}
