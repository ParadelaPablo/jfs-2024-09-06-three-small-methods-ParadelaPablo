import java.util.Arrays;

public class ThreeSmallMethods {

    public boolean isYoung (int age) {

        if(age <= 30){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasLegalGenderManInSweden(String personalNumber){



        if (personalNumber.length() == 10){
            if(personalNumber.charAt(8) % 2 != 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
        return false;
        }
    }


    public int firstTwoDigitInteger(int[] numbers) {




        for(int pair : numbers){
            if( pair>9 && pair<=99 || pair<-9 && pair>=-99){
                return pair;
            }
        }

        return -1;
    }
    }
