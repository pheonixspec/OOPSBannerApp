import java.util.HashMap;
import java.util.Map;

public class uc8 {

    // --- Part 1: Inner Class (Encapsulation) ---
    public static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // --- Part 2: Utility Methods (Logic) ---

    
    public static void displayWordBanner(String word, Map<Character, CharacterPattern> patternMap) {
        // Convert word to uppercase to match map keys
        word = word.toUpperCase();

        // Standard banner height is 7 lines
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (patternMap.containsKey(c)) {
                    line.append(patternMap.get(c).getPattern()[i]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    // --- Part 3: Main Method ---
    public static void main(String[] args) {
        // 1. Initialize the Map
        Map<Character, CharacterPattern> registry = new HashMap<>();

        // 2. Define and Store Patterns
        registry.put('O', new CharacterPattern('O', new String[]{
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        }));

        registry.put('P', new CharacterPattern('P', new String[]{
            " ***** ", " * * ", " * * ", " ***** ", " * ", " * ", " * "
        }));

        registry.put('S', new CharacterPattern('S', new String[]{
            "  **** ", " * ", " * ", "  *** ", "      *", "      *", " **** "
        }));

        // 3. Display the banner for "OOPS"
        System.out.println("--- UC8: Map-Based OOPS Banner ---");
        displayWordBanner("OOPS", registry);
    }
}