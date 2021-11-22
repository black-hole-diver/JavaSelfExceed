package abstractClasses;

public class Students extends Person {
    private String major;

    public Students(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "A student majoring in " + major;
    }
}
