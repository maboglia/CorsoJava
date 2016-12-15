Snippets_Control_Flow_in_JS.md





// More on Control Flow in JS 4/14
var lunch = prompt("COSA VUOI PER PRANZO?","Scrivi qui la tua scelta tra panino, insalata, torta, pizza");

switch(lunch){
  case 'panino':
    console.log("Un panino al giorno...");
    break;
  case 'pizza':
    console.log("Assaggia la pizza della casa.");
    break;
  case 'insalata':
    console.log("Un pasto leggero e rinfrescante! Vuoi una nicoise?");
    break;
  case 'torta':
    console.log("Non mangiare troppi dolci!");
    break;
  default:
    console.log("Vorresti mangiare " + lunch + "? Mi dispiace, è terminato!");
}
//-----------------------------------------------------------

// More on Control Flow in JS 5/14
var color = prompt("What's your favorite primary color?","Type your favorite color here");

switch(color) {
  case 'red':
    console.log("Red's a good color!");
    break;
  case 'blue':
    console.log("That's my favorite color, too!");
    break;
  case 'yellow':
      console.log("makes me think of parasols in spring");
      break;  
  default:
    console.log("I don't think that's a primary color!");
}
//-----------------------------------------------------------

// More on Control Flow in JS 8/14

var colore = prompt("Che colore vuoi?");

switch (colore) {
    case 'rosso':
        console.log("colore " + colore);
        $("body").css('background-color', 'red');
        break;
    case 'verde':
        console.log("colore " + colore);
        $("body").css('background-color', 'green');
        break;
    case 'blu':
        console.log("colore " + colore);
        $("body").css('background-color', 'blue');
        break;
    default:
        console.log("devi scegliere un colore primario " + colore);
}

//-----------------------------------------------------------

// More on Control Flow in JS 10/14

var iLoveJavaScript = true;
var iLoveLearning = true;

if(iLoveJavaScript && iLoveLearning) {
  // if iLoveJavaScript AND iLoveLearning:
  console.log("Awesome! Let's keep learning!");
} else if(!(iLoveJavaScript || iLoveLearning)) {
  // if NOT iLoveJavaScript OR iLoveLearning:
  console.log("Let's see if we can change your mind.");
} else {
  console.log("You only like one but not the other? We'll work on it.");
}