
var sceltaPC = document.getElementById("scelta_pc");
var risultato = document.getElementById("risultato");
var playAgain = document.getElementById("play_again");

var btnRock = document.getElementById("btn_rock");
var btnScissors = document.getElementById("btn_scissors");
var btnPaper = document.getElementById("btn_paper");

var mossaPC = "";

function btnPlayAgain() {
	console.log('qui implementare logica per resettare il gioco');

	document.getElementById('scelta_utente').innerHTML = '<button onclick="testRock()"  id="btn_rock" class="btn_scelta">ROCK</button> <button onclick="testScissors()" id="btn_scissors" class="btn_scelta">SCISSORS</button> <button onclick="testPaper()" id="btn_paper" class="btn_scelta">PAPER</button>';

}


function sceltaComputer(){

	var numeroRandom = Math.random();

	if(numeroRandom < 0.34) { mossaPC = "ROCK"; }
	else if(numeroRandom <= 0.67) { mossaPC = "SCISSORS"; }
	else  { mossaPC = "PAPER"; }
	console.log(mossaPC);
	sceltaPC.innerHTML = "<h1>" +  mossaPC  + "</h1>";

}

function comparaScelte(player1, player2) {
	
	if (player1 === player2) risultato.innerHTML = "<h1>Pareggio</h1>";

	//caso 1
	else if (player1 === "ROCK" && player2 === "SCISSORS") risultato.innerHTML = "<h1>vince Player 1</h1>";
	
	else if (player1 === "ROCK" && player2 === "PAPER") risultato.innerHTML = "<h1>vince Player 2</h1>";
	
	//caso 2
	else if (player1 === "SCISSORS" && player2 === "ROCK") risultato.innerHTML = "<h1>vince Player 2</h1>";
	
	else if (player1 === "SCISSORS" && player2 === "PAPER") risultato.innerHTML = "<h1>vince Player 1</h1>";
	
	//caso 3
	else if (player1 === "PAPER" && player2 === "ROCK") risultato.innerHTML = "<h1>vince Player 1</h1>";
	
	else if (player1 === "PAPER" && player2 === "SCISSORS") risultato.innerHTML = "<h1>vince Player 2</h1>";
	


	else risultato.innerHTML = "<h1>vince Player 2</h1>";


}


function testRock() {
	var sceltaTemp = btnRock.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById('scelta_utente').innerHTML = "<h1>" + sceltaTemp + "</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC );

}
function testScissors() {
	var sceltaTemp = btnScissors.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById('scelta_utente').innerHTML = "<h1>" + sceltaTemp + "</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC );

}
function testPaper() {
	var sceltaTemp = btnPaper.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById('scelta_utente').innerHTML = "<h1>" + sceltaTemp + "</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC );

}

function testCompleto() {
	var sceltaTemp = this.innerHTML;
	console.log('click su ' + sceltaTemp);
	document.getElementById('scelta_utente').innerHTML = "<h1>" + sceltaTemp + "</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp, mossaPC );

}


//eventi utente:
	//1. attributo onclick direttamente sull'elemento html

	/*
	<button onclick="btnPlayAgain()" id="btn_play_again" class="btn_scelta">PLAY AGAIN</button>


	*/

	//2. evento onclick collegato alla variabile js dell'elemento
	
	//btnRock.onclick = verificaSceltaUtente();
	//btnRock.onclick = test(); //la funzione viene eseguita subito

	/*
	btnRock.onclick = testRock;
	btnScissors.onclick = testScissors;
	btnPaper.onclick = testPaper;
	*/

	//3. uso del listener
/**/
btnRock.addEventListener("click",testRock);
btnScissors.addEventListener("click",testScissors);
btnPaper.addEventListener("click",testPaper);




