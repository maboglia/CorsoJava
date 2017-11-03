// window.addEventListener("DOMContentLoaded", function(evt) {
//     var elem = document.getElementsByTagName("body")[0];
//     var para = document.createElement("p");
//     var text = document.createTextNode("The page just loaded!");
//     para.appendChild(text);
//     elem.appendChild(para);
// });

var Prodotti = [
	
	{ 
		"Abito" 	: "Camicia",
		"Taglia"	: ["S", "M", "L", "XL"],
		"Colore"	: ["Rosso", "Verde", "Blue"],
		"Prezzo"	: 39.99
	},

	{ 
		"Abito" 	: "Maglione",
		"Taglia"	: ["S", "M", "L", "XL"],
		"Colore"	: ["Rosso", "Verde", "Blue"],
		"Prezzo"	: 49.99
	},

	{ 
		"Abito" 	: "Giacca",
		"Taglia"	: ["S", "M", "L", "XL"],
		"Colore"	: ["Rosso", "Verde", "Blue"],
		"Prezzo"	: 69.99
	},

	{ 
		"Abito" 	: "Pantalone",
		"Taglia"	: ["S", "M", "L", "XL"],
		"Colore"	: ["Rosso", "Verde", "Blue"],
		"Prezzo"	: 59.99
	}



];


$.each(Prodotti, function(index, val) {
	 //alert(val.Abito + " " + val.Prezzo);
	var mioElemento = "<div class='prodotto'>"+ val.Abito +  " " + val.Taglia[0] + "</div>";
	 $("#content").append(mioElemento);
	 
	 
});

$(".prodotto").css("width", "300px").css("height", "300px").css("border", "1px dotted blue");


$.getJSON( "js/dario_mennillo.json", function( data ) {
  var items = [];
  $.each( data, function( key, val ) {
    items.push( "<li id='" + key + "'>" + val + "</li>" );
  });
 
  
  
  
  $( "<ul/>", {
    "class": "my-new-list",
    html: items.join( "" )
  }).appendTo( "body" );
});

var carrello = $('#carrello');
var prodottiCarrello = $('#prodottiCarrello');
var login = $('#login');
var registrazione = $('#registrazione');
var btnSwitchElementi = $('#switchElementi');

var s = '';

function riscriviStringa () {
	$("#registrazione :checked").each(function(index, el) {
		s += " " + $(this).val() + " ";

	});	
}


$("document").ready(init);

function init(){


	$('#sidebar > div').css({
		display: 'block',
		borderBottom: '2px solid red'
	});

	$('input[name="payment"]').each(function(index, el) {
		$(this).change(function(event) {
			alert($(this).val());
			// s += " " + $(this).val() + " ";
			// $("#content").prepend(s);
		});

	});







}