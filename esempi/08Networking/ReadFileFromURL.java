
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class ReadFileFromURL {

    public static void main(String[] args) {
        String url = "https://raw.githubusercontent.com/maboglia/ProgrammingResources/master/text_files/scienziati_01.txt";

        try {
            //approccio tradizionale con stream
            usaBufferedInputStream(url, "files/miaCopia.txt");
            //approccio NIO con Channels
            usaNIOChannels(url, "files/miaCopia.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usaBufferedInputStream(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void usaNIOChannels(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

}