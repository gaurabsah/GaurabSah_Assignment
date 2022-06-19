//A singleton class can have only one object
//1. static object int the class to be made singleton
//2. A private constructor inside the class.
//3. A public static method that returns the static object created int the first step.
public class Singleton {
    public static void main(String[] args) {
        ex object=ex.return_obj();
    }
}

class Ex{
    static Ex obj= new Ex();
    private Ex(){

    }
    public static Ex return_obj(){
        return obj;
    }
}
