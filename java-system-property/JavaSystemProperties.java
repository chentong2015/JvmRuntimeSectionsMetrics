import java.nio.charset.Charset;

// Java程序访问(调用)系统环境的属性配置
// Java程序可能受到系统环境变量的影响(交互作用)
//
// 通过系统变量全局参数的配置, 解耦程序运行时的参数
// - 获取自定义属性设置
// - 获取系统定义的配置属性
public class JavaSystemProperties {

    // TODO. 自定义配置VM虚拟机系统属性和值, 支持参数序列
    // Edit Configuration > VM Options > -Dproperty1=test -Dproperty2="chen"
    private static void testCustomProperties() {
        System.out.println(System.getProperty("property1"));
        System.out.println(System.getProperty("property2"));

        // -Dfile.encoding="UTF-8" 特殊的VM参数属性
        // 可以设置到OS系统的环境变量，在程序执行时自动判断
        if (Charset.defaultCharset().toString().equals("UTF-8")) {
            System.out.println("Set encoding UTF-8");
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding")); // UTF-8
        System.out.println(System.getProperty("java.version")); // 17.0.10

        // Path used to find directories and JAR archives containing class files.
        System.out.println(System.getProperty("java.class.path"));
    }
}
