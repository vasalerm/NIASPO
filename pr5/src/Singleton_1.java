public class Singleton_1 {
    private Integer a;
    private static Singleton_1 sg_1;
    private Singleton_1(Integer a){
        this.a = a;
    };
    public synchronized Singleton_1 getInstance() {
        if(this.a == null) {
            sg_1 = new Singleton_1(null);
            return sg_1;
        }
        return sg_1;
    }

}
