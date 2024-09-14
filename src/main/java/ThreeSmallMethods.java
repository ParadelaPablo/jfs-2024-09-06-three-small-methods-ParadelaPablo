public class ThreeSmallMethods {

/*    public boolean isYoung(int age) {

        //   - Implement the method called `isYoung`
        //   - It takes one parameter `age` which you can assume always will be an int.
        //   - Return `true` if the parameter is equal or below 30 and `false` otherwise

        if(age <= 30){
            return true;
        }
        else{
            return false;
        }
    }
*/
    public boolean hasLegalGenderManInSweden(String personalNumber){

        //   - See the background information on PersonNummer below
        //   - Implement the method called `hasLegalGenderManInSweden`
        //   - That takes a parameter `personnummer` of type `string`
        //   - Check that the `personnummer` parameter is 10-characters long and return `false` if not.
        //   - Return `true` if the second to last number is odd, and `false` if it is even (which is the way personnummer indicates legal gender)
        //   - You ONLY need to validate the second to last number and do not have to validate that it is a correctly formatted personnummer


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

    }

  public int firstTwoDigitInteger(int[] numbers) {


        //   - Implement the method called `firstTwoDigitInteger`
        //   - That takes an array of integers and returns the first two-digit integer.
        //   - You can assume only integers in the array, and don't need to check for non-integer input
        //   - Loop over the elements with a `for` -loop
        //   - Return the first integer in the array that consists of two digits
        //   - If there is no such integer in the array, return -1




        return -1;
    }

