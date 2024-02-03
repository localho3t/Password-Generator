import app.PasswordGen;
import config.Config;

public class App {


    private void run(){
        PasswordGen passwdGen = new PasswordGen(length, count);
    }

    protected Integer length;
    protected Integer count;

    public static void main(String[] args) {
        CheckAgrs ca = new CheckAgrs();
        Config conf = new Config();
        
        App app = new App();

        String appVersion = conf.getVersion();
        String appName = conf.getName();
        System.out.println("App name : "+appName);
        System.out.println("App version : "+appVersion);

        if (ca.CheckAgrs(args)){
            app.length = Integer.parseInt(args[0]);
            app.count = Integer.parseInt(args[1]);

            app.run();
        }else{
            System.out.println("ex : java file.java 12 3");
        }

    }

}
