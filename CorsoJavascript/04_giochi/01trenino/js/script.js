var velocitaTreno = 250;
var posizioneTreno = 0;
var animation;

var tachimetro = document.getElementById("tachimetro");

var treno = document.getElementById("treno");
var goTrain = document.getElementById("goTrain");
var stopTrain = document.getElementById("stopTrain");


goTrain.addEventListener("click", function(){
	if(velocitaTreno > 10){
		velocitaTreno -= 10;
	}
	
	tachimetro.innerHTML = velocitaTreno;

	clearInterval(animation);
	animation = setInterval(frame, velocitaTreno);

	function frame() {
		posizioneTreno +=2;
		treno.style.left = posizioneTreno+"px";
		controllaPosizione(posizioneTreno);
	}


});


stopTrain.addEventListener("click", function(){

	clearInterval(animation);
});


function controllaPosizione (posizione) {
	if (posizione === 260){
		treno.style.width = "40px";
		treno.style.left = "320px";
		alert("CRASH!!!!!!!!!");

		clearInterval(animation);
	}
}
