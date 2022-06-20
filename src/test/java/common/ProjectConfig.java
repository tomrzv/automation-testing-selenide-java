package common;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)

public interface ProjectConfig extends Config {
    @Config.DefaultValue("chrome")
    @Config.Key("browser")
    String browser();

    @Config.DefaultValue("800x600")
    @Config.Key("browserSize")
    String browserSize();

    @Config.DefaultValue("http://the-internet.herokuapp.com/")
    @Config.Key("baseUrl")
    String baseUrl();

}
