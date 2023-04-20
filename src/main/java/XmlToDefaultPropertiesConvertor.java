import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class XmlToDefaultPropertiesConvertor {

    public static void main(String[] args) throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String inputPath = rootPath + "icons.xml";
        String outputPath = "src/main/resources/out/" + "icons.properties";

        Properties properties = new Properties();
        properties.loadFromXML(new FileInputStream(inputPath));

        properties.remove("fileIcon");
        properties.put("newFileIcon", "icon5.jpg");
        properties.replace("videoIcon", "icon6.jpg");
        properties.list(System.out);

        properties.store(new FileOutputStream(outputPath), null);
    }
}
