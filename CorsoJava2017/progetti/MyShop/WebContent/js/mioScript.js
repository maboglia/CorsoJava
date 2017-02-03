var carrello = document.getElementById('carrello');
var login = document.getElementById('login');
var registrazione = document.getElementById('registrazione');
var btnSwitchElementi = document.getElementById('switchElementi');

carrello.style.display = "none";
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

