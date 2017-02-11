JQUERY
Breve introduzione ai fondamenti su Jquery

##JQUERY , QUESTO SCONOSCIUTO
Jquery è un Framework (una collezione o libreria di codice che agevola la risoluzione di una classe
di problemi) che permette di interagire , con semplicità e rapidità, sul DOM ( Document Object
Model) * di una pagina HTML
PRINCIPALI CARATTERISTICHE

Cross browser ( supportato da ie 6+, Firefox 2+, Safari 2+, Opera 9+, chrome e tanti altri)
Grande community = Grande disponibilità di plugin
Leggero ( l'attuale versione production della libreria pesa 32Kb)
Documentazione chiara e completa
Semplice
Utilizza selettori CSS (anche Css3 )
Breve, permette di ridurre la quantità di codice necessario rispetto all'uso di Javascript
* tutti gli elementi che compongono una pagina web ( div, immagini, span, p ... )
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##jQUERY
write less
less, , do more
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##INCLUDERE JQUERY NELLE PAGINE WEB
1. Scarichiamo l'ultima versione di Jquery dal sito http://jquery.com/ il file avrà un
nome nella forma jquery-x.x.-min.js
2. Per usarlo nelle nostre pagine web dobbiamo linkarlo attraverso il comando
<script>...</script> nella sezione <head /> della nostra pagina web:
```javascript
<html>
<head>
<script src="percorso/al/file/jquery-x.x.js"></script>
</head>
<body> ... </body>
</html>
```

##"Filosofia Jquery"
Jquery "
Cerca questo elemento
$("p"). html("Hello World");
Fai questa azione

##"Filosofia Jquery"
Jquery "
Supponiamo di avere la seguente pagina Html
```javascript
<html>
<head></head>
<body>
<div>
<p></p>
</div>
</body>
</html>
```

##"Filosofia Jquery"
Jquery "
Inseriamo tra i tag <head> il link alla libreria jquery e l'istruzione vista poco fa
<head>
<script src="percorso/jquery.js"></script>
<script type="javascript/text">
$(document).ready(function(){
$("p").html("Hello World");
}
</script>
</head>

##"Filosofia Jquery"
Jquery "
Otterremo visualizzando la pagina in un browser
```javascript
<html>
<head></head>
<body>
<div>
<p>Hello World</p>
</div>
</body>
</html>
```

##I SELETTORI
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SELETTORI
I Selettori in jquery permettono di prendere il controllo di uno o più
oggetti di una pagina web, per seleziona un elemento si usa la
funzione $ a cui viene passato un "qualcosa", qui sotto alcuni esempi di
Selettori.
• Selettore di ID => $("#blocco")
• Selettore di Classe => $(".elenco")
• Selettore tramite nome TAG => $("p")
• Selettore tramite attributi => $("[title*= titolo]")
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SELETTORI
Prendiamo in esempio questa pagina html
```javascript
<body>
<div id="blocco">
<p><strong>ELENCO:</strong> III C </p>
<ul class="elenco">
<li>ADA</li>
<li>BALDO</li>
<li>CARLO</li>
<li>DARIO</li>
</ul>
<strong>Fine elenco</strong>
</div>
</body>
```

 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SELETTORI
$("#blocco")
```javascript
<body>
<div id="blocco">
<p><strong>ELENCO:</strong> III C </p>
<ul class="elenco">
<li>ADA</li>
<li>BALDO</li>
<li>CARLO</li>
<li>DARIO</li>
</ul>
<strong>Fine elenco</strong>
</div>
</body>
```

 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SELETTORI
$(".elenco")
```javascript
<body>
<div id="blocco">
<p><strong>ELENCO:</strong> III C </p>
<ul class="elenco">
<li>ADA</li>
<li>BALDO</li>
<li>CARLO</li>
<li>DARIO</li>
</ul>
<strong>Fine elenco</strong>
</div>
</body>
```

 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SELETTORI
$("strong")
```javascript
<body>
<div id="blocco">
<p><strong>ELENCO:</strong> III C </p>
<ul class="elenco">
<li>ADA</li>
<li>BALDO</li>
<li>CARLO</li>
<li>DARIO</li>
</ul>
<strong>Fine elenco</strong>
</div>
</body>
```

 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SELETTORI
$("p strong")
```javascript
<body>
<div id="blocco">
<p><strong>ELENCO:</strong> III C </p>
<ul class="elenco">
<li>ADA</li>
<li>BALDO</li>
<li>CARLO</li>
<li>DARIO</li>
</ul>
<strong>Fine elenco</strong>
</div>
</body>
```

 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##I FILTRI
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI

I filtri permettono di ottenere una maggiore precisione nella selezione
degli elementi fatta con i selettori
• Filtri semplici (Basic Filter)
:first, :last, :not(), :eq(), ......
• Filtri sul contenuto ( Content Filter)
:empty , :contains(text), :has(selector)
• Filtri sugli attributi ( Attribute )
[attribute], [attribute=value], [attribute!=value], .....
• Filtri sugli elementi dei form ( Form )
:input, :text, :submit, :disabled, :checked, .....
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI

Supponiamo di avere la seguente tabella creata attraverso codice html
Nome
Cognome Provincia #
ADAMO PA presente
BALDO BORROMEO PA assente
CARLO CASCIO TP presente
DARIO DEMO TP presente
EMILIO ERRANTE ME assente
ADA
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI

$("th").css("background-color", "#9bbb59");
$("tr:odd").css ("background-color", "#dee7d1");
$("tr:even").css ("background-color", "#eff3ea");
Nome
Cognome Provincia #
ADAMO PA presente
BALDO BORROMEO PA assente
CARLO CASCIO TP presente
DARIO DEMO TP presente
EMILIO ERRANTE ME assente
ADA
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI

$( "td:contains('assente')" ).css('color','red');
Nome
Cognome Provincia #
ADAMO PA presente
BALDO BORROMEO PA assente
CARLO CASCIO TP presente
DARIO DEMO TP presente
EMILIO ERRANTE ME assente
ADA
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI

$( "td[align=left]").css('text-align','center');
Nome Cognome Provincia #
ADA ADAMO PA presente
BALDO BORROMEO PA assente
CARLO CASCIO TP presente
DARIO DEMO TP presente
EMILIO ERRANTE ME assente
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI  SU ELEMENTI FORM

Supponiamo di avere questo form :
```javascript
<form name="nome_form" id="id_form">
<label>Colori preferiti</label>
<input type="checkbox" value="rosso" /> Rosso
<input type="checkbox" value="giallo" /> Giallo
<input type="checkbox" value="blu" /> Blu
<input type="button" value="sono selezionati..."
onclick="dammi_selezionati()" />
</form>
<script type="text/javascript">
function dammi_selezionati(){
Var stringa='';
$(":checked") .each( function() {
stringa+=" "+ $(this).val() +" ";
});
alert(stringa);
}
</script>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI SU ELEMENTI FORM

Supponiamo di avere questo form :
```javascript
<form name="nome_form" id="id_form">
<label>Colori preferiti</label><br />
<select id="colori" onchange="dammi_selezionato()">
<option value="rosso">Rosso</option>
<option value="blu">Blu</option>
<option value="giallo">Giallo</option>
</select>
</form>
<script type="text/javascript">
function dammi_selezionato(){
var stringa='';
$("#colori option:selected").each( function() {
stringa+=" "+ $(this).val() + " ";
});
alert(stringa);
} ;
</script>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FILTRI SU ELEMENTI FORM
```javascript

<form name="nome_form" id="id_form">
<label>Colori preferiti</label><br />
<select id="colori"multiple="multiple">
<option value="rosso">Rosso</option>
<option value="blu">Blu</option>
<option value="giallo">Giallo</option>
</select>
<input type="button" onclick="dammi_selezionato()"
value="Dammi selezionati">
</form>
<script type="text/javascript">
function dammi_selezionato(){
var stringa='';
$("#colori option:selected").each( function() {
stringa+=" "+ $(this).val() + " ";
});
alert(stringa);
} ;
</script>
```

 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ADESSO AZIONE
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM
Vedremo alcune funzioni che ci permettono di
manipolare il DOM, per un elenco completo
vedi la documentazione su
http://api.jquery.com/category/manipulation/
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM
Prendiamo in esempio questa porzione di html

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
$("h1").prepend("<span>Primo</span>");
<div id="blocco">
<h1><span>Primo</span> Esempio</h1>
<div id="blocco_interno"></div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM
Prendiamo in esempio questa porzione di html

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
$("h1").before("<span>Primo</span>");
<div id="blocco">
<span>Primo</span>
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM
Prendiamo in esempio questa porzione di html

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
$("h1").append("<span>Primo</span>");
<div id="blocco">
<h1>Esempio <span>Primo</span> </h1>
<div id="blocco_interno"></div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM
Prendiamo in esempio questa porzione di html

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
$("h1").after("<span>Primo</span>");
<div id="blocco">
<h1>Esempio</h1>
<span>Primo</span>
<div id="blocco_interno"></div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM
Prendiamo in esempio questa porzione di html

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
$("#blocco_interno").html("<strong>Ciao , sono un testo dinamico</strong>");
<div id="blocco">
<h1>Esempio</h1>
<span>Primo</span>
<div id="blocco_interno"> <strong>Ciao , sono un testo
dinamico </strong> </div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno"></div>
</div>
$("# blocco_interno).addClass("selezionata");
<div id="blocco">
<h1>Esempio</h1>
<span>Primo</span>
<div id="blocco_interno" class="selezionata">
</div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM

```javascript
<div id="blocco">
<h1>Esempio</h1>
<div id="blocco_interno" class="selezionata">
</div>
</div>
$("#blocco_interno").removeClass("selezionata");
<div id="blocco">
<h1>Esempio</h1>
<span>Primo</span>
<div id="blocco_interno"></div>
</div>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM

```javascript
ciao
<form>
<input type="text" id="testo" name="testo"
value="ciao" />
</form>
<span></span>
$("span"). html( $("#testo").val());
<form>
<input type="text" id="testo" name="testo"
value="ciao" />
</form>
<span>ciao</span>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO IL DOM

```javascript
<form>
<input type="text" id="testo" name="testo" />
</form>
<span></span>
$("# testo).val('Hello world') ;
<form>
<input type="text" id="testo" name="testo"
value=" Hello world " />
</form>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO I CSS
Possiamo gestire le regole css di un elemento attraverso la funzione .css
//$("#elemento).css ( regola-css , valore);
$("#elemento").css("color", "red");
$("#elemento").css("height", "100px");
$("#elemento").css("border", "1px solid red");
$("#elemento").css("background-color", "#ffcc90");
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##MANIPOLIAMO I CSS
Possiamo gestire le regole css in gruppo utilizzando una sola chiamata alla
funzione .css
$("#elemento).css( {
regola-css : valore ,
regola-css : valore ,
regola-css : valore ,
....
} )
$("#elemento").css({ "color": "red",
"height" : "100px",
"border" : "1px solid red",
"background-color" : "#ffcc90"
});
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ATTRIBUTI
LETTURA E SCRITTURA
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SET & GET
Con Jquery possiamo leggere e impostare i
valori per ogni attributo del DOM, ad esempio
possiamo leggere e scrivere dinamicamente
dentro un elemento p .
Possiamo leggere e scrivere il contenuto di un
input text .
Possiamo leggere e scrivere una proprietà CSS .
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SET & GET
GET
.html()
.attr('id')
.val()
.width()
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:
SET
.html('<p>ciao</p>)
.attr('id','blocco_testo')
.val('ciao')
.width('120px')

##GLI EVENTI
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Con jquery possiamo intercettare alcuni eventi
e far si che quando si verificano dar seguito ad
una operazione.
http://api.jquery.com/category/events/
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
• Click
• Doppio click
• Focus
• Pressione di un tasto
• Caricamento
• Mouse
• Selezione
• Caricamento della pagina
• Ridimensionamento
• ...
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Struttura di un funzione per intercettare un evento
Quando su questo/i elemento/i
Si verifica questo evento
$("button").click(function(){
// qualche operazione
});
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Un esempio per capire meglio
```javascript
<html>
<head>
<script src="percorso/jquery.js"></script>
<script style="text/javascript">
$('#pulsante').click(function(){
$('#box').slideUp()
}
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width:100px; height:100px; background-
color:red"></div>
</body>
```javascript
<html>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Eseguire una funzione solo al caricamento della pagina
<head>
<script type="text/javascript">
$(document).ready(function() {
// fai qualcosa
});
</script>
</head>
<head>
<script type="text/javascript">
$(function() {
// fai qualcosa
});
</script>
</head>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Gli eventi legati a mouse sono : mouseover, mouseout, mousedown,
mouseleave ...
```javascript
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$('p'). mouseover (function(){
alert('Ciao, sono una finestra attivata da un evento');
});
})
</script>
</head>
<body>
<p>Passa con il mouse sopra la frase</p>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Gli eventi legati alla pressione di tasti: keydown, keyup, keypress, focusin,
focusout -- http://api.jquery.com/category/events/keyboard-events/
```javascript
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$('#parola').keypress(function(evento){
var keycode = (evento.which ? evento.which :
evento.keyCode);
$('p').append(' '+evento.which+' '+String.fromCharCode(keycode));
});
})
</script>
</head>
<body>
<input type="text" id="parola" />
<p>Hai premuto i seguenti tasti (in codice ASCII ):<br /></p>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EFFETTI
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EFFETTI
jQuery ci permettere di realizzare dei semplici
effetti animati con pochissime linee di codice.
http://api.jquery.com/category/effects/
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EFFETTI
Gli effetti li possiamo raggruppare in 4 tipologie
• FadeIn / fadeOut / fadeToggle
• Hide / Show
• Slide up / Slide Down
• Animate
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##```javascript
GLI EFFETTI
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$("#pulsante").click(function () {
$("#box").slideUp();
});
})
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width: 100px; height: 100px; background-color: red;"></div>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Il codice precedente genererà la seguente situazione:
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Per ottenere l'effetto contrario
```javascript
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$("#pulsante").click(function () {
$("#box").slideDown();
});
})
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width: 100px; height: 100px; background-color: red;
display:none;"></div>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Ottenere un effetto Apri/chiudi
```javascript
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$("#pulsante").click(function () {
$("#box").slideToggle();
});
})
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width: 100px; height: 100px; background-color: red;"></div>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Gestire la velocità dell'animazione
```javascript
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$("#pulsante").click(function () {
$("#box").slideToggle(3000);
});
})
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width: 100px; height: 100px; background-color: red;"></div>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GLI EVENTI
Eseguire azione al completamento dell'animazione
```javascript
<html>
<head>
<script src="jquery.js"></script>
<script type="text/javascript">
$(function(){
$("#pulsante").click(function () {
$("#box").slideToggle(1000, function(){
alert("Animazione completata");
} );
});
})
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width: 100px; height: 100px; background-color: red;"></div>
</body>
</html>
```
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMATE
Con la funzione animate, si possono creare "transizione" sulle varie
proprietà css di un oggetto.
....
<script type="text/javascript">
$(function(){
$("#pulsante").click(function () {
$('#box').animate({left: '+=500' },
1000,
function() { alert("Animazione completata"); }
);
});
}) ;
</script>
</head>
<body>
<input type="button" value="cliccami" id="pulsante" />
<div id="box" style="width: 100px; height: 100px; background-color: red;position:
relative; "></div>
.....
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMATE
Il codice precedente genererà la seguente animazione:
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ALCUNI ESEMPI di...
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SCROLLER DI PAGINA
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##Scroller di pagina
Lo scroller di pagina viene usato per spostarsi
velocemente tra i contenuti di una pagina web.
Un tipico esempio sono le ancore "torna su"
che troviamo alla fine di un testo che
permettono con un click di tornare in cima allo
stesso
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SCROLLER DI PAGINA VERTICALE
<script type="text/javascript">
function vai_a(id)
{
$('html,body').animate({scrollTop: $("#"+id).offset().top},1000);
}
</script>
<div id="blocco_1" class="blocco" style=" background-color: red;">
<div class="menu">
<a href="#" onclick="vai_a('blocco_1');return false;" >Vai al blocco 1</a>
<a href="#" onclick="vai_a('blocco_2');return false;" >Vai al blocco 2</a>
<a href="#" onclick="vai_a('blocco_3');return false;" >Vai al blocco 3</a>
</div>
Testo Primo Blocco 1
</div>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SCROLLER DI PAGINA ORIZZONTALE
<script type="text/javascript">
function vai_a(id)
{
$('html,body').animate({ scrollLeft: : $("#"+id).offset().left},1000);
}
</script>
<div id="blocco_1" class="blocco" style=" background-color: red;">
<div class="menu">
<a href="#" onclick="vai_a('blocco_1');return false;" >Vai al blocco 1</a>
<a href="#" onclick="vai_a('blocco_2');return false;" >Vai al blocco 2</a>
<a href="#" onclick="vai_a('blocco_3');return false;" >Vai al blocco 3</a>
</div>
Testo Primo Blocco 1
</div>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SLIDER DI IMMAGINI
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##Slider di immagini
Una applicazione molto in uso nei siti web sono gli
slider di immagini.
Adesso prepareremo uno slider molto semplice.
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##SLIDER DI IMMAGINI
<script>
$(function(){
$('#blocco img:gt(0)').hide();
setInterval(function(){ $('#blocco :first-child').fadeOut(20).next('img').
fadeIn(700).end().appendTo($('#blocco'));}, 3000);
});
</script>
<style type="text/css">
.blocco{ width: 500px; height:350px; overflow: hidden;}
.blocco img{ width: 500px; height:350px; float: left;}
</style>
<div id="blocco" class="blocco">
<img src="gallery/1.jpg" />
<img src="gallery/2.jpg" />
<img src="gallery/3.jpg" />
</div>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##Slider di immagini
Alcuni link a slider migliori e più gradevoli del
precedente.
http://nivo.dev7studios.com/
http://cssglobe.com/post/5780/easy-slider-17-numeric-navigation-jquery-slider
http://www.gmarwaha.com/jquery/jcarousellite/
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICHE
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICHE
Le gallery in javascript negli ultimi anni hanno avuto un ruolo
predominante sul web e sono andate a sostituire la maggior
parte di quelle sviluppate in Flash.
Alcuni vantaggi :
• Semplicità di utilizzo
• Il codice è parte integrante della pagina web
• La maggior parte permette di realizzare il "Progressive enhancement"
• Molti plugin disponibili sul web
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICHE
Adesso vedremo come inserire una gallery fotografica in una
pagina web e come gestire gli eventuali effetti che la libreria ci
mette a disposizione.
Per i nostri esempi useremo la gallery FancyBox che è
scaricabile dal sito :
http://fancybox.net/
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPORTAZIONE
Il primo passo è l'importazione all'interno della nostra pagina della libreria
Jquery, del file che contiene il codice javascript della nostra galleria
( jquery.fancybox-1.3.4.pack.js) e il file css della stessa (jquery.fancybox-
1.3.4.css)
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="fancybox/jquery.fancybox-1.3.4.css"
media="screen" />
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : HTML
Prepariamo il codice html
<a id="example1" href="img/1_b.jpg">
<img alt="example1" src="img/1_s.jpg" />
</a>
<a id="example2" href="img/2_b.jpg">
<img alt="example2" src="img/2_s.jpg" />
</a>
<a id="example3" href="img/3_b.jpg">
<img alt="example3" src="img/3_s.jpg" />
</a>
<a id="example4" href="img/4_b.jpg">
<img class="last" alt="example4" src="img/4_s.jpg" />
</a>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPOSTIAMO
Adesso diciamo alla libreria su quali elementi deve agire, partiamo dalla
chiamata più semplice.
<script type="text/javascript">
$(document).ready(function() {
$("#example1").fancybox();
});
</script>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPOSTIAMO
Adesso possiamo visualizzare la pagina all'interno di un browser e vedere in
esecuzione la libreria FancyBox
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPOSTIAMO
Molti plugin permettono di settare alcuni aspetti o comportamenti dello
stesso, di seguito alcuni settaggi possibili della libreria.
$("a#example2").fancybox({
'overlayShow' : false,
'transitionIn'
: 'elastic',
'transitionOut' : 'elastic'
});
$("a#example3").fancybox({
'transitionIn'
: 'none',
'transitionOut' : 'none'
});
$("a#example4").fancybox({
'opacity': true,
'overlayShow' : false,
'transitionIn'
: 'elastic',
'transitionOut' : 'none'
});
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##NON AVEVAMO DETTO
GALLERY ?
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPORTAZIONE
Per la gallery l'importazione delle librerie rimane uguale
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="fancybox/jquery.fancybox-1.3.4.css"
media="screen" />
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : HTML
Il codice HTML cambierà in :
<a rel="gruppo" href="img/1_b.jpg">
<img alt="example1" src="img/1_s.jpg" />
</a>
<a rel="gruppo" href="img/2_b.jpg">
<img alt="example2" src="img/2_s.jpg" />
</a>
<a rel="gruppo" href="img/3_b.jpg">
<img alt="example3" src="img/3_s.jpg" />
</a>
< arel="gruppo" href="img/4_b.jpg">
<img class="last" alt="example4" src="img/4_s.jpg" />
</a>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPOSTIAMO
Adesso diciamo alla libreria su quali elementi deve agire, nel nostro caso su
tutti quelli elementi che hanno tra i loro attributi il tag rel="gruppo"
<script type="text/javascript">
$(document).ready(function() {
$("a[rel=gruppo]").fancybox();
});
</script>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##GALLERY FOTOGRAFICA : IMPOSTIAMO
Adesso possiamo visualizzare la pagina all'interno di un browser e vedere in
esecuzione la libreria FancyBox
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FORM VALIDATION
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FORM VALIDATION
Molto utili per guidare l'utente nella compilazione e
segnalazione degli errori.
Esistono molti plugin che ci aiutano nella loro
implementazione, alcuni link saranno forniti più avanti adesso
cercheremo di crearne uno in pochi semplici passi.
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FORM VALIDATION: HTML
Implementiamo il form
<li>
<label>Nome</label>
<input type="text" id="nome" name="nome" class="obbligatorio" />
</li>
<li>
<label>Indirizzo</label>
<input type="text" id="indirizzo" name="indirizzo "/>
</li>
<li>
<label>Email</label>
<input type="text" id="email" name="email" class="obbligatorio" />
</li>
<li>
<input type="button" id="invia" name="invia" value="invia" onclick="controlla()" />
</li>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FORM VALIDATION: LOGICA
function controlla(){
$(".obbligatorio ").each( function(){
if( ($(this).val()=="") ){
errore=true;
$(this).prev().addClass('rosso');
}
else{ $(this).prev().removeClass('rosso'); }
})
if(errore==true)
{ alert("Il form contiene errore/i, si prega di correggere."); }
else
{alert("Complimenti! Non ci sono errori!"); }
}
</script>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FORM VALIDATION: LOGICA
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##FORM VALIDATION: PLUGIN
Alcuni link a plugin di validazione
http://jquery.bassistance.de/validate/demo/
http://demos.usejquery.com/ketchup-plugin/index.html
http://www.geektantra.com/2009/09/jquery-live-form-validation/
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMAZIONI
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMAZIONI
L'uso di jquery per creare animazioni è stato spesso usato da
google per alcuni dei sui doodle .
Adesso animeremo una parte di un famoso doodle di google,
in particolare il leone dell'illustrazione.
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMAZIONE: JQUERY E SPRITE
Al solito abbiamo bisogno della nostra libreria Jquery
<script type="text/javascript" src="jquery.js"></script>
e un paio di immagini, di cui una sprite
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMAZIONE: CODICE HTML
<div style="margin:0 auto;text-
align:center;height:175px; overflow:hidden; position:relative; width:452px">
	<div style="background:url(sprite/sfondo.jpg) no-repeat 0 0px;height:141px;left:32px;top:32px;width:420px;position:absolute">
	</div>
	<div id="leone" style="background:url(sprite/leone.png) no-repeat 0
	0px;height:37px;left:137px;top:131px;width:70px;position:absolute; ">
	</div>
	<div id ="area_leone" style="height:37px;left:136px;top:131px;width:70px; position:absolute; ">
	</div> <!-- Leone -->
</div>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

##ANIMAZIONE: CODICE JAVASCRIPT
<script>
var t1=null; var frame = 0;
$(function(){
$('#area_leone').click(function(){
t1= setInterval('anima()',150);
});
})
function anima()
{ $('#area_leone').unbind('click');
var left = 70 * frame;
//$("#leone").css('backgroundPositionX','-'+left+'px');
$("#leone").css('background-position','-'+left+'px 0px');
frame++;
if(frame==10){ clearInterval(t1); }
}
</script>
 :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard: :bike: :musical_keyboard:

