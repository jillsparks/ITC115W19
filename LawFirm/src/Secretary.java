// A class to represent secretaries.
//extends employee class
public class Secretary extends Employee {
    public Secretary() {
        super();
    }
    
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}