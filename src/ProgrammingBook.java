public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {
        super();
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook: " + getBookCode() +
                " , tên: " + getName() +
                ", giá: " + getPrice() +"đ"+
                ", tác giả: " + getAuthor() +
                ", ngôn ngữ: " + getLanguage() +
                ", frameworđ: " + getFramework();
    }
}
