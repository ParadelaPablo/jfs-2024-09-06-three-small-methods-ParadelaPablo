import java.util.Arrays;

public class ThreeSmallMethods {

    public boolean isYoung (int age) {
        return age <= 30;
    }

    public boolean hasLegalGenderManInSweden(String personalNumber) {
        return personalNumber.length() == 10 && personalNumber.charAt(8) % 2 != 0;
    }

    public int firstTwoDigitInteger(int[] numbers) {
        for(int number : numbers){
            if(Math.abs(number) >9 && Math.abs(number) <100){
                return number;
            }
        }
        return -1;
    }
}
