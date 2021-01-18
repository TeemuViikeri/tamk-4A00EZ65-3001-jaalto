class Program {
    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();

        int[] array = { 4, 2, 12, 3 };
        int value = 3;

        int result = utils.searchArray(array, value);
        System.out.println(result);
    }
}
