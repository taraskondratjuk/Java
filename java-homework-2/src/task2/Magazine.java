package task2;

public class Magazine extends Book{
    public int countOfPages;
    public String gender;

    public Magazine() {
    }

    public Magazine(String color, String genre, int countOfPages, String gender) {
        super(color, genre);
        this.countOfPages = countOfPages;
        this.gender = gender;
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


    @Override
    public String toString() {
        return "Magazine{" +
                "countOfPages=" + countOfPages +
                ", gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
