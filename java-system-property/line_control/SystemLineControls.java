package line_control;

// TODO. 控制字符(换行符), 不同系统的行分隔符不同
// control characters => 0x0A (10 decimal)
// CR = Carriage Return & LF = Line Feed
// - Windows: '\r\n'
// - Mac (OS 9-): '\r'
// - Mac (OS 10+): '\n'
// - Unix/Linux: '\n'
public class SystemLineControls {

    // TODO. 在运行时获取OS系统指定的行分隔符
    public static void main(String[] args) {
        // 使用系统属性名称来获取
        String LINE_SEPARATOR = System.getProperty("line.separator");
        System.out.println("a" + LINE_SEPARATOR + "b");

        String value = "aa\r\nbb";
        System.out.println(value);
        System.out.printf(value.replaceAll(LINE_SEPARATOR, " "));

        String value2 = "cc\r\ndd";
        if (value2.contains(LINE_SEPARATOR)) {
            System.out.println(value2);
        }
    }

    // 测试: 兼容不同平台的实际换行字符
    static String getControlCharactersAsString() {
        String LINE_SEPARATOR = System.getProperty("line.separator");
        switch (LINE_SEPARATOR) {
            case "\r\n":
                return " \\r\\n "; // For windows
            case "\n":
                return " \\n ";  // For Unix/Linux & Mac (OS 10+)
            case "\r":
                return " \\r ";  // For Mac (OS 9-)
            default:
                return LINE_SEPARATOR;
        }
    }
}
