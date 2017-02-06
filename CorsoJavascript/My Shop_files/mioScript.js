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


var carrello = document.getElementById('carrello');
var prodottiCarrello = document.getElementById('prodottiCarrello');

carrello.style.display = 'block';
var login = document.getElementById('login');
var registrazione = document.getElementById('registrazione');
var btnSwitchElementi = document.getElementById('switchElementi');



function creaCard(p){



	var output = "";

	output += "<div class='panel panel-primary card col-md-4'>";

	output += '<div class="panel-heading">';
	output += "<h3 class='panel-title'>"+p.Abito+"<h3>";
	output += "</div>";
	
	output += '<div class="panel-body">';
	output += "<img class='img-responsive img-circle' src='img/"+p.Abito+".jpg' alt='Immagine della "+p.Abito+"'/>" + "<br/>";
	output += p.Prezzo + "<br/>";
	output += "</div>";

	
	output += '<div class="panel-footer">';
	output += "<button class='btn btn-primary'>Metti nel carrello</button>";	
	output += "</div>";




	output += "</div>";

	return output;


}


function mettiNelCarrello(p) {

			var test= document.createTextNode(p);
				alert(p);
			document.createElement("li").appendChild(test);	

}


function creaCardElement(p){

	var prezzoProdotto = document.createTextNode(p.Prezzo);
	var testoBtnProdotto = document.createTextNode("Metti nel carrello");
	var tipoProdotto = document.createTextNode(p.Abito);


	var divCard = document.createElement("div");
	divCard.setAttribute('class', 'panel panel-primary card col-md-4');

	var panelHeading = document.createElement("div");
		panelHeading.setAttribute('class', 'panel-heading');
		var panelTitle = document.createElement("h3");
		panelTitle.setAttribute('class', 'panel-title');

		panelTitle.appendChild(tipoProdotto);
		panelHeading.appendChild(panelTitle);
		divCard.appendChild(panelHeading);


	var panelContent = document.createElement("div");
		panelContent.setAttribute('class', 'panel-body');
	var imageProduct = 	document.createElement("img");
		imageProduct.setAttribute('class', 'img-responsive img-circle');
		imageProduct.setAttribute('src','img/'+p.Abito+'.jpg');
		imageProduct.setAttribute('alt',p.Abito);
		panelContent.appendChild(imageProduct);
		panelContent.appendChild(prezzoProdotto);
		divCard.appendChild(panelContent);


	var panelFooter = document.createElement("div");
		panelFooter.setAttribute('class', 'panel-footer');
		var btnCart = document.createElement("button");
		btnCart.setAttribute('class','btn btn-primary');
		btnCart.setAttribute('onclick', "mettiNelCarrello('"+ p.Abito +"')");

		btnCart.onclick = function () {
				//alert(p);
			var test= document.createTextNode(p.Abito);
			var liTemp = document.createElement("li");
			liTemp.appendChild(test);
			prodottiCarrello.appendChild(liTemp);
		};

		// btnCart.addEventListener('click', function (p) {
		// 	//var test= document.createTextNode(p.Abito);
		// 		alert(typeof p.Abito);
		// 	//document.createElement("li").appendChild(test);
		// });

		btnCart.appendChild(testoBtnProdotto);
		panelFooter.appendChild(btnCart);
		divCard.appendChild(panelFooter);

	document.getElementById('content').appendChild(divCard);	
	//return output;
//alert(typeof p);

}

for (var i = 0; i < Prodotti.length; i++) {
	
	//document.getElementById('content').innerHTML += 

	creaCardElement(Prodotti[i]);

// alert(Prodotti[i].Abito);
	console.log(Prodotti[i].Abito);
	console.log(Prodotti[i].Prezzo);
};

//alert(Prodotti[0].Abito);




//carrello.style.display = "none";
registrazione.style.display = "none";





btnSwitchElementi.addEventListener('click', function (){
	
	if (login.style.display != "none"){
		
		login.style.display = "none";
		registrazione.style.display = "block";
		btnSwitchElementi.innerHTML = "Login";
	} else {
		
		registrazione.style.display = "none";
		login.style.display = "block";
		btnSwitchElementi.innerHTML = "Registrazione";

		
	}
		



}
		
);

