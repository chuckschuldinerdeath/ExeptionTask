public class Main {


    public static void main(String[] args) {

    }

    private static long calculateSumElements(String[][] input) {
        if (input.length != 4) {
            throw new AppArraySizeException("Передан массив неверного размера");
        }

        for (String[] strings : input) {
            if (strings.length != 4) {
                throw new AppArraySizeException("Передан массив неверного размера");
            }
        }
        long result = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                try {
                    int value = Integer.parseInt(input[i][j]);
                    result += value;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }

        return result;
    }

}