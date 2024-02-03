package config;

public class Config implements ConfigImp {

    @Override
    public String getName() {
        return "Password Generator";
    }

    @Override
    public String getVersion() {
        return "v.0.0.1";
    }
    
}
