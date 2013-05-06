public class StringBuilderTest {
    public static void main(String[] args) {
        System.out.println(getStringTime());
        System.out.println(getStringBufferTime());
        System.out.println(getStringBuilderTime());
    }

    public static long getStringTime() {
        String tempstr = "我是測試!!";
        int times = 50000;
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < times; i++) {
            str += tempstr;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        // System.out.println(str.length());

        return time;
    }

    public static long getStringBufferTime() {
        String tempstr = "我是測試!!";
        int times = 50000;
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sb.append(tempstr);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        // System.out.println(sb.toString().length());

        return time;
    }

    public static long getStringBuilderTime() {
        String tempstr = "我是測試!!";
        int times = 50000;
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(tempstr);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        // System.out.println(sb.toString().length());

        return time;
    }
}
