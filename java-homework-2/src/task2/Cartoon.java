package task2;

public class Cartoon extends Book{
    private int countOfPages;
    private String gender;
    private boolean isForKids;

    public Cartoon() {
    }

    public Cartoon(String color, String genre, int countOfPages, String gender, boolean isForKids) {
        super(color, genre);
        this.countOfPages = countOfPages;
        this.gender = gender;
        this.isForKids = isForKids;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getIsForKids() {
        return isForKids;
    }

    public void setIsForKids(boolean isForKids) {
        this.isForKids = isForKids;
    }


    @Override
    public String toString() {
        return "Cartoon{" +
                "countOfPages=" + countOfPages +
                ", gender='" + gender + '\'' +
                ", isForKids='" + isForKids + '\'' +
                "} " + super.toString();
    }
}
