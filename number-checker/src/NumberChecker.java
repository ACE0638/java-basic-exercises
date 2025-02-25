public class NumberChecker {
    int number;
    int remainder = number % 2;

    
    public void checker(){
        int remainder = number % 2;

        if (number == 0){
            System.out.print("The number is zero");
        } else if (number > 0 && remainder == 0) {
            System.out.print("The number is positive and even");
        } else if (number > 0 && remainder == 1){
            System.out.print("The number is positive and odd");
        } else if (number < 0 && remainder == 0) {
            System.out.print("The Number is negative and even");
        }else {
            System.out.print("The number is negative and odd");
        }
    }
}
