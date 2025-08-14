package strings_java;

public class StringsExample {
    public static void main(String[] args) {
        // Create a sample string
        String s = "hello world";

        // Get the length of the string
        int length = s.length();
        System.out.println("Length of the string: " + length);

        // Get the character at a specific index
        char ch = s.charAt(3);
        System.out.println("Character at index 3: " + ch);

        // Find the first occurrence of a character
        int indexOfL = s.indexOf('l');
        System.out.println("First occurrence of 'l': " + indexOfL);

        // Check if the string contains a specific substring
        boolean containsO = s.contains("o");
        System.out.println("Contains 'o': " + containsO);

        // Check if the string starts with a specific prefix
        boolean startsWithH = s.startsWith("h");
        System.out.println("Starts with 'h': " + startsWithH);

        // Check if the string ends with a specific suffix
        boolean endsWithD = s.endsWith("d");
        System.out.println("Ends with 'd': " + endsWithD);

        // Convert the string to lowercase
        String lowerCase = s.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // Convert the string to uppercase
        String upperCase = s.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Trim whitespace from the beginning and end of the string
        String trimmed = s.trim();
        System.out.println("Trimmed string: " + trimmed);

        // Replace a character in the string
        String replaced = s.replace('l', 'z');
        System.out.println("String after replacing 'l' with 'z': " + replaced);

        // Check if the string is empty
        boolean isEmpty = s.isEmpty();
        System.out.println("Is the string empty: " + isEmpty);

        // Substring extraction
        String substring = s.substring(6);
        System.out.println("Substring from index 6: " + substring);
        substring = s.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring);

        // Split the string into an array
        String[] words = s.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // Append (+=) int, char, and string to the string
        String appended = s;
        appended += 123; // Append an integer
        System.out.println("String after appending integer: " + appended);

        appended += 'A'; // Append a character
        System.out.println("String after appending character: " + appended);

        appended += " - appended string"; // Append another string
        System.out.println("String after appending another string: " + appended);

        // Use of valueOf to convert int, char, and boolean to a string
        String intToString = String.valueOf(100);
        System.out.println("Integer to String: " + intToString);

        String charToString = String.valueOf('X');
        System.out.println("Character to String: " + charToString);

        String booleanToString = String.valueOf(true);
        System.out.println("Boolean to String: " + booleanToString);

        // Concatenate strings
        String s2 = "how are you";
        String concatenatedString = s.concat(s2);
        System.out.println("Concatenated string: " + concatenatedString);

        // Compare strings
        boolean equals = s.equals("hello world");
        System.out.println("Equals 'hello world': " + equals);

        boolean equalsIgnoreCase = s.equalsIgnoreCase("HELLO WORLD");
        System.out.println("Equals 'HELLO WORLD' (ignore case): " + equalsIgnoreCase);

        // Compare strings lexicographically
        int comparison = s.compareTo("hello universe");
        System.out.println("Lexicographical comparison with 'hello universe': " + comparison);

        // Check if string matches a regex
        boolean matches = s.matches(".*world.*");
        System.out.println("Matches regex '.*world.*': " + matches);
    }
}
