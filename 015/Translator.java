class Translator {
    String toMorseCode(String text) {
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int indexEN = -1;

            for (int j = 0; j < english.length; j++) {
                if (english[j] == c) {
                    indexEN = j;
                }
            }

            String m = morse[indexEN];
            
            result += m;

            if (i != text.length() - 1) {
                result += " ";
            }
        }

        return result;
    }
}
