import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyThatNotExists {

    public static void main(String[] args) throws IOException {

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

        Properties iconProperties = new Properties();

        String xmlIconsConfigPath = rootPath + "icons.xml";
        iconProperties.loadFromXML(new FileInputStream(xmlIconsConfigPath));

        String fileIcon = iconProperties.getProperty("fileIcon", "defaultIcon");

        System.out.println(fileIcon);

        iconProperties.remove("fileIcon");

        fileIcon = iconProperties.getProperty("fileIcon", "defaultIcon");

        System.out.println(fileIcon);
    }
}
