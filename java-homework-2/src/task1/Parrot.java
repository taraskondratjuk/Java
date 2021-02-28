package task1;

public class Parrot extends Bird {
    boolean isCanSpeak;

    public Parrot() {
    }

    public Parrot(String type, int countLegs, String name, boolean isCanSpeak) {
        super(type, countLegs, name);
        this.isCanSpeak = isCanSpeak;
    }

    public boolean isCanSpeak() {
        return isCanSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        isCanSpeak = canSpeak;
    }


    @Override
    public String toString() {
        return "Parrot{" +
                "isCanSpeak=" + isCanSpeak +
                "} " + super.toString();
    }
}
