public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        if (number<0)
            return -1;
        else if (number==0) {
            return 0;
        } else {

            int lastdigit=number%10;
            while (number>9){
                int firstdigit=number/10;
                number/=10;
            }
            int sum=number+lastdigit;
            return sum;
        }

    }
}
