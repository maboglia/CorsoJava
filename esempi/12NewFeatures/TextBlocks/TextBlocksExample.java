public class TextBlocksExample {

    public static void main(String[] args) {

       String myStr = "<html>\n" +
               "\t<body>\n" +
               "\t\t<h1>This is a Text Block Example from Java 14</h1>\n" +
               "\t</body>\n" +
               "</html> ";

       String str =
               """
               <html>
               	<body>
               		<h1>This is a Text Block Example from Java 14</h1>
               	</body>
               </html>\s\s\s""";

       String largeString = """
               Lorem ipsum dolor sit amet, sea bonorum laoreet ea. \
               Eu pro amet tota justo, eam et agam feugiat admodum, \
               malis decore facilisi id nam
               """;

       String sl = "Ajay";

       String tb = """
               Ajay""";
        //System.out.println(sl.equals(tb));

        System.out.println("""
                this is a text block""");
    }
}
