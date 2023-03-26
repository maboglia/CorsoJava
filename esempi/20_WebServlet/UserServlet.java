@WebServlet(name = "UserServlet", urlPatterns = "/userServlet", initParams={
@WebInitParam(name="name", value="Non disponibile"), 
@WebInitParam(name="email", value="Non disponibile")}))
public class UserServlet extends HttpServlet {
    // ...    
    
    @Override
    protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
        processRequest(request, response);
        forwardRequest(request, response, "/WEB-INF/jsp/result.jsp");
    }
    
    protected void processRequest(
      HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException {
 
        request.setAttribute("name", getRequestParameter(request, "name"));
        request.setAttribute("email", getRequestParameter(request, "email"));
    }
    
    protected void forwardRequest(
      HttpServletRequest request, 
      HttpServletResponse response, 
      String path)
      throws ServletException, IOException { 
        request.getRequestDispatcher(path).forward(request, response); 
    }
    
    protected String getRequestParameter(
      HttpServletRequest request, 
      String name) {
        String param = request.getParameter(name);
        return !param.isEmpty() ? param : getInitParameter(name);
    }
}
