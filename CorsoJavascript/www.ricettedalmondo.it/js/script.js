var ricetta	=	document.getElementById("ricetta");
var cuochi	=	document.getElementById("cuochi");
var provenienza	=	document.getElementById("provenienza");
var immagini	=	document.getElementById("immagini");
var ingredienti	=	document.getElementById("ingredienti");


var ricette = 
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
};

//var json = JSON.parse(ricette);

ricetta.innerHTML = ricette.nomePiatto;
cuochi.innerHTML = ricette.cuochi;
provenienza.innerHTML = ricette.provenienza;
immagini.innerHTML = ricette.immagini;
ingredienti.innerHTML = ricette.ingredienti;
