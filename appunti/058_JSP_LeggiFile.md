# Leggi file su WEB-INF

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>

```



```java
@WebServlet("/download")
public class DownloadServlet extends HttpServlet {
    private final int ARBITARY_SIZE = 1048;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
      throws ServletException, IOException {
    
        resp.setContentType("text/plain");
        resp.setHeader("Content-disposition", "attachment; filename=sample.txt");

        try(InputStream in = req.getServletContext().getResourceAsStream("/WEB-INF/sample.txt");
          OutputStream out = resp.getOutputStream()) {

            byte[] buffer = new byte[ARBITARY_SIZE];
        
            int numBytesRead;
            while ((numBytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, numBytesRead);
            }
        }
    }
}
```

```java
 ServletContext context = getContext();
URL resourceUrl = context.getResource("/WEB-INF/test/foo.txt");
```

```java
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "ReadTextFileServlet", urlPatterns = "/read-text-file")
public class ReadTextFileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // We are going to read a file called configuration.properties. This
        // file is placed under the WEB-INF directory.
        String filename = "/WEB-INF/configuration.properties";

        ServletContext context = getServletContext();

        // First get the file InputStream using ServletContext.getResourceAsStream()
        // method.
        InputStream is = context.getResourceAsStream(filename);
        if (is != null) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            PrintWriter writer = response.getWriter();
            String text;

            // We read the file line by line and later will be displayed on the
            // browser page.
            while ((text = reader.readLine()) != null) {
                writer.println(text + "</br>");
            }
        }
    }
}
```

