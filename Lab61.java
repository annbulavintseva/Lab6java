package Lab_6;

public class Lab68 {
    public static void main(String[] args) {
        String input = "The user with the nickname koala757677 this month wrote 3 times more " +
                "comments than the user with the nickname croco181dile920 4 months ago";
        int count = countNumbers(input);
        System.out.println("Результат: " + count);
    }

    public static int countNumbers(String input) {
        String[] words = input.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.matches("\\d+")) {
                count++;
            }
        }

        return count;
    }
}




