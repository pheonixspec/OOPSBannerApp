
public class uc7 {

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

    
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }


    public static void displayBanner(CharacterPatternMap[] patterns) {
        // We have 7 lines per character pattern
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[i]).append("  "); // Added spacing between letters
            }
            System.out.println(line.toString());
        }
    }

    // --- Part 4: Main Method ---

    public static void main(String[] args) {
        // Defining patterns for O, P, and S
        String[] patternO = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };

        String[] patternP = {
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };

        String[] patternS = {
            "  **** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            " ****  "
        };

        // Initialize instances of the inner class
        CharacterPatternMap charO = new CharacterPatternMap('O', patternO);
        CharacterPatternMap charP = new CharacterPatternMap('P', patternP);
        CharacterPatternMap charS = new CharacterPatternMap('S', patternS);

        // Create an array of objects to represent "OOPS"
        CharacterPatternMap[] oopsBanner = { charO, charO, charP, charS };

        // Display the banner
        displayBanner(oopsBanner);
    }
}