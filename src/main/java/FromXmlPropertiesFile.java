import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FromXmlPropertiesFile {

    public static void main(String[] args) throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String xmlIconsConfigPath = rootPath + "icons.xml";

        Properties iconProperties = new Properties();
        iconProperties.loadFromXML(new FileInputStream(xmlIconsConfigPath));

        String fileIcon = iconProperties.getProperty("fileIcon");
        String imageIcon = iconProperties.getProperty("imageIcon");
        String videoIcon = iconProperties.getProperty("videoIcon");

        System.out.println(fileIcon + " " + imageIcon + " " + videoIcon);
    }
}
