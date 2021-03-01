package task1;

public enum Size {
    L, M, S, XS, XXS;

    private int euroSize;

    Size() {
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    void getDescription() {
    }

    ;

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
