import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {
        String name = "SZjjj232132";


        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            if (Character.isLowerCase(character)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(character)) {
                upperCaseCount++;
            }

        }

        System.out.println("lowerCaseCount: " + lowerCaseCount + " upperCaseCount: " + upperCaseCount);

        long countLower = name.chars().filter(Character::isLowerCase).count();
        long countUpper = name.chars().filter(Character::isUpperCase).count();

        System.out.println("countLower " + countLower + " countUpper : " + countUpper);


    }
}
