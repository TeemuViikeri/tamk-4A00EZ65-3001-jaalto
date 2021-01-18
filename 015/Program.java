class Program {
    public static void main(String[] args) {
        Translator translator = new Translator();
        String text = "text";

        String morse = translator.toMorseCode(text);
        System.out.println(morse);
    }
}
