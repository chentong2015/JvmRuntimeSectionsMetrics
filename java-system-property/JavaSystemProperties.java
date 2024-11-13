import java.net.URL;

public class JavaSystemProperties {

    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(System.getProperty("java.version"));

        // TODO. 返回包含class的所有路径
        // Path used to find directories and JAR archives containing class files.
        System.out.println(System.getProperty("java.class.path"));

        // TODO. 返回class被加载的完整路径
        // file:work_folder/target/JavaMasterClass/runtime/VMOptionSystemProperties.class
        URL url = JavaSystemProperties.class.getClassLoader()
                .getResource("JavaRuntimeAPI/VMOptionSystemProperties.class");
        System.out.println(url);

        // TODO. 返回class被加载的根目录位置, 如果从jar中加载则会加上压缩文件路径
        // work_folder/target/JavaMasterClass/
        // work_folder/target/JavaMasterClass/file:...Demo.jar
        String filePath = JavaSystemProperties.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath();
        System.out.println(filePath);
    }
}
