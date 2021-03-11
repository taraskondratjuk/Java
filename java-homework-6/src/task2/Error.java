package task2;

public class Error {
    private boolean result;
    private String cause;

    public Error() {
    }

    public Error(boolean result, String cause) {
        this.result = result;
        this.cause = cause;

    }

    public boolean getResult() {
        return result;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return "Error {" +
                "result=" + result +
                ", cause='" + cause + '\'' +
                '}';
    }


}
