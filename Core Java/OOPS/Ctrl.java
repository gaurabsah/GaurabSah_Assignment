abstract class Persistence{
    abstract void persist();
}

class FilePersistence extends Persistence{
    void persist() {
        System.out.println("file persists");
    }
}

class DatabasePersistence extends Persistence{
    void persist(){
        System.out.println("database persists");
    }
}
public class Ctrl {
    public static void main(String[] args) {
        Persistence obj= new Persistence() {
            @Override
            void persist() {
                System.out.println("calling it");
            }
        };
        obj.persist();
    }
}
