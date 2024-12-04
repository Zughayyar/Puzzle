import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i=0;i<10;i++) {
            Random rand = new Random();
            newArray.add(rand.nextInt(20) + 1);
        }
        return newArray;
    }
    public String getRandomLetter() {
        String[] letters = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };
        Random rand = new Random();
        int randIndex = rand.nextInt(25) + 1;
        return letters[randIndex];
    }
    public String generatePassword() {
        StringBuilder newPassword = new StringBuilder();
        for (int i=0;i<7;i++) {
            newPassword.append(getRandomLetter());
        }
        return newPassword.toString();
    }
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<>();
        for (int i=0;i<length;i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}
