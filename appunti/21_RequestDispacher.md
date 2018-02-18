L'approccio servlet-centric prevede di utilizzare le pagine
JSP solo per la presentazione e delegare il controllo ad
una o ad un gruppo di servlet.
Le servlet quindi:



gestiscono le richieste (vengono cioè invocate tramite URL)
elaborano i dati necessari a soddisfare le richieste (interagendo
con la classe DBMS.java e utilizzando i Java Data Bean come
componenti per rappresentare le informazioni di interesse)
trasferiscono il controllo alla JSP designata a presentare i
risultati.
Se il gruppo di servlet che realizzano l'applicazione web
viene ristretto a contenere una sola servlet, allora
l'applicazione ha un solo punto di accesso e questa
servlet ha i controllo totale sul flusso dell'applicazione.

Passaggio dati fra servlet-JSP:
I Java Data Bean istanziati dalla servlet devono
essere passati alla JSP prima di trasferire ad essa
il controllo. A tal fine esiste una coppia di metodi
della classe HttpServletRequest che permettono
di inserire/recuperare in/da request (oggetto
implicito della JSP) un numero arbitrario di
oggetti. Questi metodi sono:


setAttribute(String, Object)
getAttribute(String)


Trasferimento del controllo dalla servlet alla
JSP
Quando all'interno di una servlet, dopo aver preparato
i dati in JDB e averli inseriti nell'oggetto request
(parametro del metodo doGet o doPost),
si vuole richiamare una JSP per visualizzare i dati,
si dice che si trasferisce il controllo (forward) alla JSP.


Per trasferire il controllo è necessario creare un
oggetto di tipo RequestDispatcher associato alla JSP
che si vuole 'invocare'.
Ci sono due modi equivalenti per definire un oggetto
RequestDispatcher associato ad una JSP all'interno
di una servlet:


RequestDispatcher rd =
request.getRequestDispatcher(“PathRelativoJSP")
RequestDispatcher rd =
getServletContext.getRequestDispatcher(“PathAssolutoJSP")

Una volta ottenuto l'oggetto RequestDispatcher rd, è
sufficiente invocare il suo metodo forward:
forward(HttpServletRequest, HttpServletResponse)
per trasferire MOMENTANEAMENTE il controllo alla
JSP.
rd.forward(request, response)
Attenzione! Non è un browser redirect e nemmeno una
terminazione del metodo doGet o doPost della servlet... è
una semplice chiamata di metodo. Tutto il codice presente
DOPO rd.forward(request, response), se esiste, verrà
eseguito dopo che la JSP ha finito la sua esecuzione!

