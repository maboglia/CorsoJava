function isSupported () {
	
	try{
		//primo modo per settare chiave/valore

		localStorage.setItem("mioTest", "ciao localstorage!");
		return true;
	} catch(e){
		console.log(e);
		return false;
	}


}

if (isSupported()) {

	console.info("sul tuo browser è disponibile il localstorage");


};

function trascinamento (e) {
	console.log(e.target.id);
	console.dir(e);

	e.dataTransfer.setData("text/plain", e.target.innerHTML);
	e.dropEffect = "move";

}


function droppami (e) {
	console.log(e);

	e.preventDefault();

	var mieiDati= e.dataTransfer.getData("text");
	console.warn(mieiDati);


	document.getElementById("droppo").innerHTML= mieiDati;

	
	document.getElementById("reportCarrello").innerHTML += mieiDati;
	//secondo modo per impostare una var localstorage: notazione punto
	localStorage.mioTest2 = mieiDati;
	//3 modo
	localStorage['mioTest3'] = "prova3";

}


function dropover (argument) {
	//console.log(argument);
	argument.preventDefault();
}
//primo modo di ricevere da localStorage
console.log(localStorage.getItem("mioTest"));
//secondo modo di ricevere dati da local Storage
console.log(localStorage.mioTest2);
//Terzo modo di ricevere dati da local Storage
console.log(localStorage['mioTest3']);

localStorage.removeItem('mioTest3');

console.log(localStorage['mioTest3']);



