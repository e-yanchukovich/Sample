package lesson9.hw2;

public class NoSuchCarException extends RuntimeException {

    private final String carName;
    public NoSuchCarException(String carName) {
        this.carName = carName;
    }

    @Override
    public String getMessage() {
        return "No such Car \"" + carName + "\"";
    }
}
