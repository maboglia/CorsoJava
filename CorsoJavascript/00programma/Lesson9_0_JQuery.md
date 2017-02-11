#Jquery     

    Riassunto delle funzioni di base

    Partenza del codice quando il documento (il DOM) è pronto
    Selezionare gli elementi
    selettori css 2 / css 3
    Accedere e modificare le classi CSS
    Gestire gli stili Css con Jquery
    Aggiungere e rimuovere contenuto e inserire elementi
    Ottenere l'elemento html
    Ottenere solo il testo contenuto nel tag
    Cambiare l'HTML e/o il Testo
    Far seguire (appendere) del contenuto ad un elemento
    Gli Eventi in jQuery
    Mostrare e nascondere elementi con il jQuery
    jQuery Animations and Effects

Partenza del codice quando il documento (il DOM) è pronto

```javascript
$(document).ready(function() {
 
});
```

#Selezionare gli elementi

La principale caratteristica della funzione jQuery() (abbreviata in $() ) è quella di selezionare elementi HTML per modificarli: basta passare un parametro stringa (tra apici doppi ["] o singoli ['] ) come negli esempi che seguono:

```javascript
$("div");
$("#mioId");
$(".miaClasse");
$("p#mioId");
$("ul li a.nav");
```


##selettori css 2 / css 3

jQuery supporta tutti i selettori anche quelli avanzati e quelli del CSS3

```javascript
$("p > a");
$("input[type=text]");
$("a:first");
$("p:odd");
$("li:first-child");
```


##jQuery supporta poi alcuni selettori custom:

```javascript
$(":animated");
$(":button"); selects any button elements (inputs or buttons)
$(":radio");
$(":checkbox"); selects checkboxes
$(":checked");
$(":header"); selects header elements (h1, h2, h3, etc.)
```

#Accedere e modificare le classi CSS

Con jQuery è facile aggiungere, scambiare o rimuovere classi CSS: ecco i tre metodi

```javascript
$("div").addClass("content");
$("div").removeClass("content"); removes class "content" from all <div> elements
$("div").toggleClass("content");
```



// toggles the class "content" on all <div> elements (adds it if it doesn't exist, and removes it if it does)
You can also check to see if a selected element has a particular CSS class, and then run some code if it does. You would check this using an if statement. Here is an example:
view plain?

Se un elemento è di una determinata classe allora esegui il codice:

```javascript
if ($("#myElement").hasClass("content")) {
 
}

```




Gestire gli stili Css con Jquery

Ecco come modificare i css con jQuery:


```javascript
$("p").css("width", "400px");
$("#myElement").css("color", "blue") makes text color blue on element #myElement
$("ul").css("border", "solid 1px #ccc")
```

Aggiungere e rimuovere contenuto e inserire elementi

There are a number of ways to manipulate groups of elements with jQuery, including manipulating the content of those elements (whether text, inline elements, etc).

Ottenere l'elemento html

```javascript
var myElementHTML = $("#myElement").html();
```



// variable contains all HTML (including text) inside #myElement

Ottenere solo il testo contenuto nel tag

```javascript
var myElementHTML = $("#myElement").text();
```




Cambiare l'HTML e/o il Testo

```javascript
$("#myElement").html("<p>Questo è il nuovo contenuto</p>");
$("#myElement").text("Questo è il nuovo contenuto."); // questo sostituisce il testo presente
```





Far seguire (appendere) del contenuto ad un elemento

```javascript
$("#myElement").append("<p>Questo lo aggiungo.</p>");
$("p").append("<p>Questo pure.</p>"); // Aggiunge questo contenuto ad ogni paragrafo
```




Altri comandi

```javascript
    appendTo()
    prepend()
    prependTo()
    before()
    insertBefore()
    after()
    insertAfter()
```


lavorano in modo simile con specifiche peculiarità

Ulteriori informazioni  jQuery.com-

Gli Eventi in jQuery


Ecco come intercettare il click del mouse con jQuery:

```javascript
$("a").click(function() {
// il codice presente viene eseguito onclick!
});
```




#Il codice dentro function() viene eseguito quando un link viene cliccato. Ecco altri comuni eventi inclusi injQuery:

    blur
    focus
    hover
    keydown
    load
    mousemove
    resize
    scroll
    submit
    select


Lista completa  jQuery.com -
#Mostrare e nascondere elementi con il jQuery

Ecco la sintassi :

```javascript
$("#myElement").hide("slow", function() {
 
} // nasconde
 
$("#myElement").show("fast", function() {
// qui dentro viene eseguito una volta che l'elemento è stato mostrato
} //scopre
 
$("#myElement").toggle(1000, function() {
// scambia: se è nascosto mostra e se è visibile nasconde
}
```




Remember that the “toggle” command will change whatever state the element currently has, and the parameters are both optional. The first parameter indicates the speed of the showing/hiding. If no speed is set, it will occur instantly, with no animation. A number for “speed” represents the speed in milliseconds. The second parameter is an optional function that will run when the command is finished executing.

You can also specifically choose to fade an element in or out, which is always done by animation:

```javascript
    $("#myElement").fadeOut("slow", function() {
    do something when fade out finished
    }


    $("#myElement").fadeIn("fast", function() {
    do something when fade in finished
    }
```
##To fade an element only partially, either in or out:
view plain?

```javascript
    $("#myElement").fadeTo(2000, 0.4, function() {
    // do something when fade is finished
    }
```

The second parameter (0.4) represents “opacity”, and is similar to the way opacity is set in CSS. Whatever the opacity is to start with, it will animate (fadeTo) until it reaches the setting specified, at the speed set (2000 milliseconds). The optional function (called a “callback function”) will run when the opacity change is complete. This is the way virtually all callback functions in jQuery work.
jQuery Animations and Effects
You can slide elements, animate elements, and even stop animations in mid-sequence. To slide elements up or down:
view plain?

```javascript
    $("#myElement").slideDown("fast", function() {
    do something when slide down is finished
    }


    $("#myElement").slideUp("slow", function() {
    do something when slide up is finished
    }

    $("#myElement").slideToggle(1000, function() {
    // do something when slide up/down is finished
    }
```

##To animate an element, you do so by telling jQuery the CSS styles that the item should change to. jQuery will set the new styles, but instead of setting them instantly (as CSS or raw JavaScript would do), it does so gradually, animating the effect at the chosen speed:
view plain?

```javascript
    $("#myElement").animate(
    {
    opacity: .3,
    width: "500px",
    height: "700px"
    }, 2000, function() {
    // optional callback after animation completes
    }
    );
```

#Oggetto jQuery() $()

    jQuery() oppure $() Permette di selezionare e creare elementi del DOM Può avere come parametro:
 
    Selettore CSS $("p.evidenziato") Restituisce un array di oggetti, eventualmente vuoto
    Oggetti javascript $(this.value) Restituisce un array di oggetti contenente l’elemento passatocome parametro
    Codice HTML $("Ciao Mondo")      Crea un elemento del DOM e restituisce un array di oggetti contenente l’elemento appena creato

#SELETTORI


##Selettori CSS

```javascript
$(elemento)
```

    Permette di selezionare gli elementi HTML passati come parametro

    $("a") tutti i link (e ancore) della pagina
    $("p") tutti i paragrafi della pagina
    $("a,p") tutti i link e i paragrafi della pagina



##Selettori CSS

```javascript
$(#idelemento)
```

    Permette
di selezionare l’elemento della
pagina che ha l’id passato come
parametro
elemento della pagina con
attributo id="principale"
$("div#principale") div della pagina con
attributo id="principale"
    $("#principale")
     
    Essendo l’id univoco all’interno della pagina la
selezione del div poteva essere omessa

##Selettori CSS

```javascript
$(.nomeclasse)
```

    Permette
di selezionare gli elementi della
pagina che hanno la classe passata come
parametro
elementi della pagina che
hanno classe evidenziato
$("div.evidenziato") tutti i div della pagina con
classe evidenziato
    $(".evidenziato")
     

##Selettori CSS

```javascript
$(elemento[attributo])
```

    Permette
di selezionare gli elementi della
pagina che hanno l’attributo passato come
parametro
tutte le immagini in cui è
specificato l’attributo title
$("input[value]") tutti gli elementi input in cui è
specificato l’attributo value
    $("img[title]")
     

##Selettori CSS

```javascript
$(elemento[attributo=x])
```

    Permette
di selezionare gli elementi della
pagina che hanno l’attributo passato come
parametro uguale al valore X
tutte le immagini in cui
l’attributo titolo è uguale a ‘logo’
$("input[type=‘radio’]") tutti gli elementi input
di tipo radio
    $("img[title=‘logo’]")
     

##Selettori CSS

```javascript
$(elemento[attributoˆ=x])
```

    Permette
di selezionare gli elementi della
pagina che hanno l’attributo passato come
parametro che inizia per X
tutte le immagini in cui
l’attributo titolo inizia con ‘logo’
$("a[hrefˆ=‘http://’]") tutti i link con indirizzo
non relativo
    $("img[title^='logo']")
     

##Selettori CSS

```javascript
$(elemento[attributo$=x])
```

    Permette
di selezionare gli elementi della
pagina che hanno l’attributo passato come
parametro che finisce per X
    $("img[src$='.png']")
tutte le immagini con
estensione png
    $("a[href$='.pdf']")
tutti i link a file pdf

##Selettori CSS

```javascript
$(elemento[attributo*=x])
```

    Permette
di selezionare gli elementi della
pagina che hanno l’attributo passato come
parametro che contiene la stringa X
tutte le immagini in cui
l’attributo titolo contiene la stringa ‘logo’
$("a[href*='polito.it']") tutti i link che
contengono nell’indirizzo la stringa ‘polito.it’
    $("img[title*='logo']")
     

##Selettori CSS

```javascript
$(padre > figli)
```

    Permette
di selezionare gli elementi "figli"
che sono discendenti diretti dell’elemento
"padre"
tutte le liste che sono contenute
direttamente in un div
$(div > li) errato!!! Selezionerebbe tutti gli
elementi di una lista contenuti direttamente in
un div. Gli elementi di una lista devono essere
contenuti in elementi ul o ol
    $(div > ul)
     

##Selettori CSS

```javascript
$(fratello+sorelle)
```

    Permette di selezionare gli elementi "sorelle" che
sono direttamente preceduti da un elemento
"fratello"

```javascript
$(".A + .B")
```


    e1 

    e2 

    e3 

    e4 

    e5 

    e4 

    e5

         e6 





##Selettori CSS

```javascript
$(fratello~sorelle)
```

    Permette
di selezionare gli elementi "sorelle"
che sono preceduti da un elemento "fratello"

```javascript
$(".A ~ .B")
```





##Selettori CSS

```javascript
$(padri:has(discendenti))
```

    Permette
di selezionare gli elementi
"padri" che hanno almeno un
"discendente" passato come parametro
tutti gli ul che hanno come
discendente almeno un link
$("div:has(img)") tutti i div che hanno come
discendente almeno un’immagine
    $("ul:has(a)")
     

##Selettori di Posizione
$(:first) $(:last)

    Permettono
di selezionare il primo (:first)
e ultimo (:last) elemento di un insieme
il primo link della pagina
$("p.evidenziato:first") il primo paragrafo con
class "evidenziato"
$("img[src*=logo]:last") ultima immagine che
contenga nell’indirizzo la parola logo
    $("a:first")
     
     

##Selettori di Posizione

    $(:first-child) $(:last-child) Per selezionare il primo (:first-child) e l’ultimo (:last-child) elemento discendente
    $("p.evidenziato:first-child") Per selezionare il primo elemento contenuto in ogni paragrafo con class "evidenziato" 
    $("li:last-child")  Per selezionare l'ultimo elemento contenuto in ogni li
    $("div:first-child")  Per selezionare il primo elemento contenuto in ogni div
    $(:even) $(:odd)    Permettono di selezionare gli elementi in posizioni pari (:even) e dispari (:odd)
    $("li:odd") i list item di posizione dispari
    $("table.zebra tr:even") le righe in posizione pari delle tabelle che hanno class "zebra"
     
Questo selettore utilizza come indice iniziale
lo 0

##Selettori di Posizione
$(:nth-child(n)) $(:nth-child(even|odd))

    Permettono
di selezionare gli elementi
discendenti in posizioni uguale a n (:nth-child
(n)) , dispari (:nth-child(odd)) o pari (:nth-
child(even))
    $("tr:nth-child(4)")
il quarto elemento contenuto
in ogni tr
    $("tr:nth-chiled(even)")
gli elementi in posizione
pari in ogni tr
    $("tr:nth-chiled(odd)")
dispari in ogni tr
gli elementi in posizione

##Selettori di Posizione
$(:eq(n)) $(:lt(n)) $(:gt(n))

    Permettono
di selezionare gli elementi in
posizioni uguale a n (:eq(n)) , maggiore
di n (:gt(n)) o minore di n (:lt(n))
    $("tr:eq(4)")
    $("tr:lt(4)")
    $("tr:gt(4)")
il quinto elemento tr
i primi cinque tr
dal sesto tr in poi
Questo selettore utilizza come indice iniziale lo 0

##Selettori Custom
     
     
     
     
:button seleziona tutti i bottoni
:checkbox seleziona tutte le checkbox
:radio seleziona tutti i radio button
:checked seleziona le check box e i radio button che sono
selezionati
    :disabled , :enabled elementi di input disabilitati o
abilitati
    :not(filter) negazione di un selettore
     
     
     
     
    $("li:not(.evidenziato)") gli elementi li che non hanno classe
evidenziato
:hidden elementi nascosti
:visible elementi visisbili
:text seleziona textbox
:filter(selettore) applica un ulteriore selettore
all'insieme selezionato!
    :contains(cerca) seleziona gli elementi che contengono il
testo "cerca"




#Operazione su gli oggetti selezionati/creati

Navigazione del DOM


$(selettore).children([selettore])
dell'insieme selezionato
figli diretti
    È possibile filtrare i figli con un selettore
discendenti
dell'insieme selezionato

    $(selettore).next() elemento successivo a
quello selezionato

    $(selettore).parent([selettore]) padre
dell'elemento selezionato

    $(selettore).parents([selettore])


$(selettore).find(selettore)

#Operazione su gli oggetti selezionati/creati
Manipolazione del DOM

    Inserimento
di elementi
    after, append, before, prepend, html, text,
wrap, clone, value

    Cancellazione
    empty, remove, removeAttr

    Modifica
Stile
    attr, addClass, removeClass, toggleClass, css,
hide, show, toggle


#Operazione su gli oggetti selezionati/creati
Esempi Manipolazione del DOM

```javascript
$("li").text("testo lista").insertAfter("li:first");
//inserisce un elemento li appena creato dopo il primo li del documento

$("div#principale").append("dentro il div");
//inserisce un paragrafo dentro il div che ha id principale

$("input#email").value()
//valore della input box con id email

$("span").wrap("div")
//crea un div che contiene tutti gli elementi span della pagina

$("p.evidenziato").text("Sono evidenziato");
//imposta il testo dei paragrafi di classe evidenziano con la
stringa passata come parametro

$("img.logo").css("border","solid orange 3px");
//cambia lo stile a tutte le immagini di classe logo
```
#Operazione su gli oggetti selezionati/creati

```javascript
$(selettore).each()
```
    Permette di scorrere il vettore di elementi
selezionati e di eseguire una funzione per
ogni elemento

```javascript
$(img).each(function(i){
    $(this).attr("alt","immagine "+i);
})
```

#Operazione su gli oggetti selezionati/creati
Concatenazione operazioni

    E' possibile concatenare più azione su uno
stesso selettore grazie al fatto che molte
operazioni non alterano l'insieme di oggetti
restituiti dal selettore.
$(.invisibile).hide().addClass("sparito")
//nasconde tutti gli elementi di classe invisibile e aggiunge
la classe sparito
$("").attr("src","img/test.jpg").addClass("logo")
.appendTo("div#principale")
//crea un immagine con attributo src="img/test.jpg", di classe
logo e la appende al div con id principale

#Operazione su gli oggetti selezionati/creati
Concatenazione Avanzata .end()

    Alcune
funzioni alterano l'insiemi di oggetti
restituiti dal selettore per cui occorre prestare
attenzione!
1. 
2. 
3. 
4. 
5. 
6. 
1.  Seleziona il primo paragrafo di ogni DIV
2.  Aggiunge la classe primoParagrafo
.addClass("primoParagrafo")
3.  Seleziona il primo link del primoParagrafo
.find("a:first")
di ogni div
.text("primo link")
4.  Modifica il testo in "primo link"
.end()
5.  Ritorna alla selezione precedente (primo
paragrafo di ogni div)
.css("border","solid 5px");
6.  Modifica lo stile del bordo
$(div p:first)

#Eventi supportati
click
dblclick
load
unload
submit
focus
blur
change
select
resize
keydown
keypress
keyup
scroll
mousemove
mousedown
mouseup
mouseover
error

#Tipologia di Eventi Javascript
EVENTO | DESCRIZIONE
------ | -----------
blur, focus | Inviati ad un elemento quando rispettivamente perde il focus od ottiene il focus.
focusin, focusout | Inviato ad un elemento se esso o un suo discendente rispettivamente ottiene o perde il focus
load | Inviato ad un elemento quando esso e tutti i suo discendenti sono stati completamente caricati
resize | Inviato all'elemento windows quando la finestra del browser ha cambiato dimensioni
scroll | Inviato ad un elemento quando l'utente ha effettuato lo scroll in un differente punto dell'elemento stesso
unload | Inviato all'oggetto window quando l'utente naviga fuori dalla pagina (chiusura del browser, click su un link, a volte anche il semplice refresh)
click, dbclick | Inviati ad un elemento quando il mouse è sopra di esso e viene effettuato un click o un doppio click
mousedown, mouseup | Inviati ad un elemento quando il mouse è sopra di esso e viene rispettivamente premuto o rilasciato il bottone del mouse
mouseover, mouseout, mousemove | Eventi inviati all'elemento in cui il puntatore del mouse entre (mouseover), in cui esce (mouseout) o in cui si sta mouvendo (mousemove)
keydown,keypress, keyup | Eventi inviati quando un tasto viene premuto (keydown) è stato rilasciato (keyup) o è stato premuto (keypress)
select | Inviato ad un elemento quando viene selezionato del test all'interno di esso. 
change | Evento inviato ad un elemento che ha cambiato il proprio valore. Limitato a <select> <input> <textarea>
submit | Evento inviato quando l'utente tenta di fare il submit di un form


#bind
$(selettore).bind(evento,[dati],function(evento){...})
Permette di collegare gli eventi ad un selettore e di
eseguire la funzione associata
$(":text").bind('focusin', function(){
this.addClass('inserimento');
}).bind('focusout',function(){
this.removeClass('inserimento');
})
Per ogni casella di testo aggiunge la classe
inserimento quando il focus è sull'oggetto e rimuove
la stessa classe quando il focus non è più
dell'oggetto

#Sintassi abbreviata eventi
$(selettore).bind(evento,[dati],function(evento){...})
$(selettore).evento([dati],function(evento){...})
$("li").click(function(){$(this).hide()})
$("#mostraNascosti").mouseover(function(){
$("li:hidden").show();
})
//nasconde i listitem al click su di essi
//quando il mouse passa sopra l'elemento con id="mostraNascondi" gli elementi
li nascosti vengano visualizzati
//esempio passaggio dati alle funzioni di callback degli eventi
var messaggio="ciao mondo"
$("li").click({msg:messaggio},function(evento){
alert(evento.data.msg)});

#Proprietà Oggetto evento
  Le funzioni di callback (richiamate al verificarsi di ogni evento) hanno come parametro un oggetto che descrive l'evento occorso.
  proprietà Descrizione
  .currentTarget Elemento del DOM che ha rilanciato l'evento
  .data I dati opzionali passati dalla funzione bind
  .pageX Ascissa della posizione del mouse
  .pageY Ordinata della posizione del mouse
  .target Elemento del DOM in cui è stato generato l'evento
  .timeStamp Quando si è verificato un evento (millisecondi passati dal 1 gennaio 1970)
  .type Descrive la natura dell'evento
  .which Nel caso di eventi scatenati da mouse o tastiera indica (in
  codice) quale bottone o tasto è stato premuto.
  Per avere informazioni sul carattere inserito si
  utilizza .keyCode

#Funzioni Oggetto evento
L'oggetto evento offre alcuni utili metodi
Metodo Descrizione
.preventDefault() Non fa eseguire la funzione di default legata
all'evento.
Es. disattivare tutti i link di una pagina:
$("a").bind('click',function(evento){
evento.preventDefault();
})
.stopPropagation() Impedisce l'inoltro dell'evento ad ogni elemento padre
.stopImmediatePropagation() Impedisce l'inoltro dell'evento ad ogni altro elemento del DOM


#Lanciare eventi

    E' possibile tramite jQuery lanciare eventi, sia standard che personalizzati
$(selettore).trigger(evento, [dati])
Esempio
$("a#link").trigger('click')      
invia un click all'ancora con id uguale a link

    Sintassi abbreviata
$(selettore).evento([dati])
Esempio
$("a#link").click()

---
 by Emiliano Castellina is licensed under a Creative Commons 
 Attribuzione   Non commerciale   
 Condividi allo stesso modo 3.0 Unported License.	
