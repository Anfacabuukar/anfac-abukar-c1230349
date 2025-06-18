import java.util.Scanner;

public class assig4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = input.nextLine();
        if (isStrong(password)){
            System.out.println(" password is Strong");
        }
        else if (!checkLength(password)){
            System.out.println("Your password  atleast 8 characters ");
        }
        else if (!checkUpercase(password)){
            System.out.println("Your password   atleast one Uppercase letter");
        }else if (!checkLowerCase(password)){
            System.out.println("Your password   atleast one Lowercase letter");
        }else if (!checkSpecialCase(password)){
            System.out.println("Your password   atleast one Specialcase character");
        }
        else {
            System.out.println("Your password is weak ");
        }

    }


    //check length
    public static boolean checkLength(String password){

        return password.length()>=8;
    }
    //check Uppercase
    public static boolean checkUpercase(String UpperCase){
        for(char ch : UpperCase.toCharArray()){
            if (Character.isUpperCase(ch))
                return true;
        }
        return false;
    }

    //check lowercase
    public static boolean checkLowerCase(String LowerCase){
        for (char ch : LowerCase.toCharArray()){
            if (Character.isLowerCase(ch))
                return true;
        }
        return false;
    }

    //check digit
    public static boolean checkDigit(String Digit) {
        for (char ch : Digit.toCharArray()){
            if (Character.isDigit(ch))
                return true;
        }
        return false;
    }

    //check specialcase
    public static boolean checkSpecialCase(String specialcase){
        for (char ch : specialcase.toCharArray()){
            if (!Character.isLetterOrDigit(ch))
                return true;
        }
        return false;
    }

    //check  conditons
    public static boolean isStrong(String password){
        return checkLength(password)&&checkUpercase(password)&&
                checkLowerCase(password)&&checkSpecialCase(password)&&
                checkSpecialCase(password);
    }
}

