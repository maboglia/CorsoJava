# Le dichiarazioni

* JSP: usare le dichiarazioni ```<%! ... %>```
* le espressioni ```<%= ... %>```
 

* Racchiuse tra i tag ```<%! ... %>```, contengono codice Java e sono utilizzate per definire metodi e proprietà della classe generata. 
* Le dichiarazioni sono esterne al servlet, a differenza degli scriptlet. 
* Queste variabili o metodi dichiarati diventeranno variabili di istanza della classe servlet generata. 
* Questo significa che saranno globali a tutto il servlet generato per la pagina. 
* Può servire per definire dei metodi da usarsi con il servlet, dichiarare attibuti (variabili di oggetto) del servlet.

### Sintassi

* ```<%! Dichiarazione %>```

### esempio

```html
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP Page</title>
</head>
<body>
<h1>Le dichiarazioni: crea una funzione per stampare 5 numeri random</h1>
<h2>NB: non ci sono i controlli per ordinare i numeri e verificare l'assenza di duplicati, prova a completare il codice usando gli array</h2>
<%!
 private String lottoGame() {
 return ("<h2>" + (int)Math.floor(Math.random() * 90 +1 )+ "</h2>");
 }
 %>
<%= lottoGame() %>
<%= lottoGame() %>
<%= lottoGame() %>
<%= lottoGame() %>
<%= lottoGame() %>
</body>
</html>
```