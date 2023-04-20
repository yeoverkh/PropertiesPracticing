import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FromDefaultPropertiesFile {

    public static void main(String[] args) throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "app.properties";
        String catalogConfigPath = rootPath + "catalog";

        Properties appProperties = new Properties();
        appProperties.load(new FileInputStream(appConfigPath));

        String appVersion = appProperties.getProperty("version");
        String appName = appProperties.getProperty("name");
        String appDate = appProperties.getProperty("date");

        System.out.println(appVersion + " " + appName + " " + appDate);


        Properties catalogProperties = new Properties();
        catalogProperties.load(new FileInputStream(catalogConfigPath));

        String catalogC1 = catalogProperties.getProperty("c1");
        String catalogC2 = catalogProperties.getProperty("c2");
        String catalogC3 = catalogProperties.getProperty("c3");

        System.out.println(catalogC1 + " " + catalogC2 + " " + catalogC3);
    }
}
