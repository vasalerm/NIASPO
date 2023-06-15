package shab;

public abstract class WebsiteT {
    public void showpage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }
    public abstract void showPageContent();
}
