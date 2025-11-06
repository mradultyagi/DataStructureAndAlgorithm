package staticExample;

public class Singelton {
    private static Singelton instance;
    private Singelton(){
        System.out.println("instance created");
    }
    public static Singelton getInstance(){
        if(instance ==  null){
            instance = new Singelton();
        }
        return instance;
    }
}
