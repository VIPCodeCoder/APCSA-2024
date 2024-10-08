package StoringObjects;
public class People {
    private String name;
    private int age;
    public People(){
        name="";
        age=0;
    }
    public People(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return name + " is " + age + " years old.";
    }
}
