// window.addEventListener("DOMContentLoaded", function(evt) {
//     var elem = document.getElementsByTagName("body")[0];
//     var para = document.createElement("p");
//     var text = document.createTextNode("The page just loaded!");
//     para.appendChild(text);
//     elem.appendChild(para);
// });



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