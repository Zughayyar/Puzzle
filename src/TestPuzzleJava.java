import java.util.ArrayList;

public class TestPuzzleJava {
    public static void main(String[] args) {
        // Create PuzzleJava instance
        PuzzleJava generator = new PuzzleJava();

        /* ====== Tests ====== */
        System.out.println("\n----- Ten Rolls Test -----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("\n----- Random Letter Test -----");
        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        System.out.println("\n----- Generate Password Test -----");
        String newPassword = generator.generatePassword();
        System.out.println(newPassword);

        System.out.println("\n----- Password Set Test -----");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(5);
        System.out.println(passwordSet);

    }
}
