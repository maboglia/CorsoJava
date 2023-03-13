
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "ReadTextFile", urlPatterns = "/leggi-file")
public class ReadTextFile extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        // aggiugner i file in WEB-INF
        String nomefile = "/WEB-INF/prova.txt";

        ServletContext context = getServletContext();

        // ottieni uno stream usando ServletContext.getResourceAsStream()
        InputStream is = context.getResourceAsStream(nomefile);
        if (is != null) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            PrintWriter writer = response.getWriter();
            String text;

            // stampa il file in output
            while ((text = reader.readLine()) != null) {
                writer.println(text + "</br>");
            }
        }
    }
}