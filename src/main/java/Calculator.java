public class Calculator {
    public int add(int num1, int num2) {
        long result = (long) num1 + num2;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Your values are too big");
        }
        return (int) result;
    }

    public int sub(int num1, int num2){
        int result = num1 - num2;
        if(result < 0){
            throw new IllegalStateException("No negative numbers");
        }
        return result;
    }
}
