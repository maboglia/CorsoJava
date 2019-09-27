<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp">Magazzino</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
          
            <li class="<%= (request.getParameter("pagina") != null && request.getParameter("pagina").equals("1")  )  ?  "active"   :   ""   %>"><a href="?pagina=1">Carico</a></li>
            <li class="<%= (request.getParameter("pagina") != null && request.getParameter("pagina").equals("2")  )  ?  "active"   :   ""   %>"><a href="?pagina=2">Scarico</a></li>
            <li class="<%= (request.getParameter("pagina") != null && request.getParameter("pagina").equals("3")  )  ?  "active"   :   ""   %>"><a href="?pagina=3">Movimenti</a></li>
            <li class="<%= (request.getParameter("pagina") != null && request.getParameter("pagina").equals("4")  )  ?  "active"   :   ""   %>"><a href="?pagina=4">Vendite</a></li>
            <li class="<%= (request.getParameter("pagina") != null && request.getParameter("pagina").equals("6")  )  ?  "active"   :   ""   %>"><a href="?pagina=6">Magazzino</a></li>

          </ul>
        </div><!--/.nav-collapse -->
      </div>
</nav>