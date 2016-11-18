//alert('Hello, World!');
/*
commento su più linee
*/
var titoloPrincipale = document.getElementById("titolo_principale");

var campo1 		= document.getElementById("campo1");
var campo2 		= document.getElementById("campo2");
var mioBottone 	= document.getElementById("mio_bottone");

var risultato   = document.getElementById("risultato");





console.log("la variabile tp contiene: " + titoloPrincipale.innerHTML);

var a, b;

a = 5.0;//number
b = 3;
b = "m";//stringa
c = true;//boolean
c = false;
c = 3.14;
d = ["uno", "due"];//array

f = function () {};//funzione

function saluta () {
	saluto_italico = "ciao";
	console.info(saluto_italico +'ora me ne vado :)' + b);
	
}
saluta();

console.log("provo a usare la variabile " + saluto_italico);


mioBottone.onclick = 
function(){
	//alert("ciao!");
	/*
	var somma = parseInt(campo1.value)   + parseInt(campo2.value);
	risultato.innerHTML = "test: " + somma ;
	*/
	if(campo1.value =="mauro" && campo2.value == "12345")
	risultato.innerHTML = "benevenuto mauro" ;
	else
	risultato.innerHTML = "login errato, non puoi entrare";



};


var studenti = [
 {  nome : "mauro", cognome : "bogliaccino"  },
 {  nome : "ferdinando", cognome : "vassallo"  }
  //oggetto
];

for (var i = 0; i < studenti.length; i++) {
	console.log(studenti[i].nome);
};
























