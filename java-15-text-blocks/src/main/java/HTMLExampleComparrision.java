public class HTMLExampleComparrision {
    public static void main(String[] args) {
        String legacyHtml = "<html>\n" +
              "    <body>\n" +
              "        <p>Hello, world</p>\n" +
              "    </body>\n" +
              "</html>\n";

        String newHtml = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;

        System.out.println("Legacy HTML\n" + legacyHtml);
        System.out.println("New HTML\n" + newHtml);

    }
}