package shab;

public class Main {
    public static void main(String[] args) {
        WebsiteT welcom = new Welcompage();
        WebsiteT news = new Newspage();

        welcom.showpage();
        System.out.println("\n");
        news.showpage();
    }

}