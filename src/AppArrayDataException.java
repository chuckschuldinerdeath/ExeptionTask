public class AppArrayDataException extends RuntimeException {
    public AppArrayDataException(int i, int j) {
        super("Неверный данные в ячейке [" + i + ";" + j + "]");
    }
}
