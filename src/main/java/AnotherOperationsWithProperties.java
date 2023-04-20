import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class AnotherOperationsWithProperties {

    public static void main(String[] args) throws IOException {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String inputPath = rootPath + "app.properties";

        Properties properties = new Properties();
        properties.load(new FileInputStream(inputPath));

        properties.list(System.out);
        System.out.println();

        Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        System.out.println();

        Enumeration<Object> values = properties.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
        System.out.println();

        System.out.println(properties.size());
    }
}
