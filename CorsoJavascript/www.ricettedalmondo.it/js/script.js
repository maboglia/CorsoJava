var ricetta	=	document.getElementById("ricetta");
var cuochi	=	document.getElementById("cuochi");
var provenienza	=	document.getElementById("provenienza");
var immagini	=	document.getElementById("immagini");
var ingredienti	=	document.getElementById("ingredienti");
var preparazione	=	document.getElementById("preparazione");
var btnCounter	=	document.getElementById("btnCounter");

var ricette = 
[
{
"nomePiatto"	: "Platano E Yam con Sugo di Spinaci",		
"cuochi"		: ["Igbinosa Blessing", "Okoduwa Jennifer"],		
"provenienza"	: "africa",		
"immagini"		: ["platano1.jpg","platano2.jpg"],	 	
"ingredienti"	: ["2kg di spinaci fresco",
					"1kg di pomodoro fresco",
					"1,5kg spezzatino di pollo (petto)",
					"300g cipolle",
					"½ cucchiaino pepe macinato",
					"25g sale",
					"50gr Olio di oliva",
					"15g rosmarino",
					"1,5 kg Plantano giallo",
					"1,5kg Plantano verde",
					"1,5kg patate dolce (Yam)"]	
},
{
"nomePiatto"	: "Placinte",		
"cuochi"		: ["Cuoco 2", "cuoco 3"],		
"provenienza"	: "marocco",		
"immagini"		: ["placinte.jpg","placinte2.jpg"],	 	
"ingredienti"	: ["2kg di spinaci fresco",
					"1kg di pomodoro fresco",
					"1,5kg spezzatino di pollo (petto)",
					"300g cipolle",
					"½ cucchiaino pepe macinato"
					]	
},
{
"nomePiatto"	: "The alla Menta",		
"cuochi"		: ["Cuoco 4", "cuoco 5"],		
"provenienza"	: "marocco",		
"immagini"		: ["placinte.jpg","placinte2.jpg"],	 	
"ingredienti"	: ["2kg di spinaci fresco",
					"1kg di pomodoro fresco",
					"1,5kg spezzatino di pollo (petto)",
					"300g cipolle",
					"½ cucchiaino pepe macinato"
					]	
}
]

;

var ricetteString = JSON.stringify(ricette);
var json = JSON.parse(ricetteString);

for (var i = 0; i < ricette.length; i++) {
	console.log(json[i].nomePiatto);
	console.log(json[i].cuochi);
	console.log(json[i].provenienza);
	console.log(json[i].immagini);
	console.log(json[i].ingredienti);
};

var counter = 0;
btnCounter.addEventListener("click", function  () {
	showRicetta(counter);
	counter++;
	if (counter >= ricette.length)	counter = 0;
});

function showRicetta(arg) {
	ricetta.innerHTML = ricette[arg].nomePiatto;
	cuochi.innerHTML = "<li>" + ricette[arg].cuochi.join("<li>");
	provenienza.innerHTML = ricette[arg].provenienza;
	immagini.innerHTML = ricette[arg].immagini;
	ingredienti.innerHTML = "<li>" + ricette[arg].ingredienti.join("<li>");
	
}


