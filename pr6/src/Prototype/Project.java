package Prototype;

public class Project implements Copyable {
    private int id;
    private String name;


    public Project(int id,String name){
        this.id = id;
        this.name = name;
    }

    public Object copy(){
        Project copy = new Project(id,name);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
