var ricetta	=	document.getElementById("ricetta");
var cuochi	=	document.getElementById("cuochi");
var provenienza	=	document.getElementById("provenienza");
var immagini	=	document.getElementById("immagini");
var ingredienti	=	document.getElementById("ingredienti");
var preparazione	=	document.getElementById("preparazione");
var btnCounter	=	document.getElementById("btnCounter");

var ricette = [{
	"nomePiatto": "Beignets",
	"cuochi": ["Fatou Sylla", "Sokhna Faye"],
	"provenienza": "Senegal",
	"immagini": ["beignets1.jpg"],
	"ingredienti": ["1,5 kg di farina 00",
		"1l di latte di soia",
		"6 uova",
		"30 gr di margarina",
		"50 gr di lievito di birra",
		"1kg di zucchero",
		"1,5l di olio di semi",
		"1 noce moscata",
		"1 vaniglia",
		"1 arancia",
		"20gr di sale"
	],
	"preparazione": "Per fare il BEIGNETS bisogna prendere la farina con il latte, le uova e lo zucchero, impastare tutto mettendo il lievito di birra, l'arancia, la noce moscata grattugiata. Aggiungere la vaniglia e la margarina, impastarlo ancora bene. Viene quindi formato un panetto e si lascia l'impasto a riposare coperto con pellicola in un recipiente finchè raddoppia il volume (per 30 minuti circa). Riprendere l’impasto lievitato e dare delle forme di pallini rotondi; prendere una padella per friggere quando l’olio è ben caldo mettendone pochi per volta."
}, {
	"nomePiatto": "Kitcha Kit Fit",
	"cuochi": ["Yonas Thewoldemedhen"],
	"provenienza": "Eritrea",
	"immagini": ["", ""],
	"ingredienti": ["800gr di farina integrale",
		"0.05l di olio di oliva",
		"5gr di sale",
		"200gr berberè (pepe rosso in polvere)",
		"0.5l di acqua'",
		"700gr di burro",
		"700gr di yogurt"
	],
	"preparazione": "Il kitcha fit fit è un piatto della cucina Eritrea ed Etiope che viene tipicamente servito a colazione anche se può essere servito negli altri pasti. In genere è composto da tesmi (burro speziato chiarificato) e a volte anche da berbbere nel qual caso è chiamato fir fir. Talvolta l’olio di oliva e il burro vengono utilizzati al posto del burro chiarificato, ma la differenza di questo è sensibile. È un sottilissimo pane azzimo a base di grano, viene preparato, in genere, con farina acqua e sale e cucinato su una padella scaldata ad alta temperatura, dalle forme variabili fin quando non è cotto da un lato (molto simile ad un pancake, anche se con quest’ultimo non vi è alcun rapporto) viene più consumato spesso con un piatto chiamato fit - fit. Esistono due varianti principali del kitcha fit - fit"

}, {
	"nomePiatto": "Mssemmen",
	"cuochi": ["Baiya Imane", "Essahel Bouchra", "Ezzaky Khadija", "Jauhar Khadija"],
	"provenienza": "Marocco",
	"immagini": ["mssemmen01.jpg", "mssemmen02.jpg"],
	"ingredienti": ["500gr semolino",
		"1kg di semola",
		"1,5kg farina tipo 00",
		"0,5l olio di semi",
		"500gr di margarina",
		"0,5l latte di soia non dolcificato",
		"20gr di lievito di birra",
		"50gr di zucchero",
		"1 pizzico di sale"
	],
	"preparazione": "Mettere la farina a fontana, aggiungere lo zucchero, il sale, il lievito, il latte, versare poco a poco l’acqua e latte e mescolare l’impasto finché risulti morbido ed elastico. Lavorare per almeno 10-15 minuti. Formare una palla.\n Poi fare delle palline abbastanza piccole con l’impasto. \n Prendere una pallina alla volta e stenderla con le mani. L’impasto steso deve essere abbastanza sottile. Metterci sopra un pochino d’olio mescolato con il burro e anche la semola sopra. \n Poi si stende  e si piegano tutti i lati all'interno al fine di farne un fagotto. \n Bisogna fare lo stesso procedimento a tutto l’impasto. Dopo aver finito si prende l’impasto e lo apriamo (stendiamo) per formare un rettangolo e poi si mette in padella con un pò (pochissimo) d’olio sopra."
}, {
	"nomePiatto": "Pao de Queijo",
	"cuochi": ["Eliane Mendes", "Mariana Sampaio Ribeiro"],
	"provenienza": "Brasile",
	"immagini": ["PaoDeQueijo1.jpg", "PaoDeQueijo2.jpg", "PaoDeQueijo3.jpg", "PaoDeQueijo4.jpg", "PaoDeQueijo5.jpg", "PaoDeQueijo6.jpg", "PaoDeQueijo7.jpg", "PaoDeQueijo8.jpg"],
	"ingredienti": ["500g di amido di manioca",
		"2 uova",
		"250 ml di latte",
		"Mezzo bicchiere di olio di semi",
		"1 cucchiaio di sale",
		"150g di parmigiano grattugiato",
		"350g di mozzarella grattugiata"
	],
	"preparazione": "Mettete in una pentola il latte, l’olio e il sale, poi scaldate finché non inizia a bollire. Appena vedete le prime bolle togliete dal fuoco e versare il tutto sull’amido che avete prima disposto in una ciotola. Mischiate con una spatola, poi quando il composto si è un po’ raffreddato impastare con le mani. Aggiungere l’uovo (uno poi l’altro) dipende se l’impasto è secco, infine aggiungete i formaggi, impastare bene finché l’impasto non si stacca dalle mani e anche dalla ciotola.Formate delle palline e disponete in una teglia (non bisogna né imburrare né carta forno) cuocere in forno 170° finché diventano dorati, servire ancora caldi."
}, {
	"nomePiatto": "Pita sa povrcem",
	"cuochi": ["Selimovic Dragana"],
	"provenienza": "Bosnia",
	"immagini": ["pita1.jpg", "pita2.jpg"],
	"ingredienti": ["1 ½ kg farina 00",
		"5 uova ",
		"200 g ricotta ",
		"150 g zucca ",
		"200 g cipolle bianche ",
		"100 g carote ",
		"250 g formaggio greco feta ",
		"200 g formaggio grana padano ",
		"Olio di semi di girasole ",
		"Sale fino quanto basta ",
		"Pepe nero (q.b.)"
	],
	"preparazione": "Prima si prende un contenitore e si aggiunge la farina, condire con il sale, mettere l’acqua tiepida e impastare. Dopo aver impastato prendere l’impasto e fare delle palline grandi e spalmare l’olio di semi sopra con la mano. \nMettere in una teglia e lascare lievitare per 5 minuti. \nPoi prendere la verdura tagliarla tutta a cubetti piccoli e mettere in un contenitore. \nAggiungere le uova,  la ricotta e i formaggi e con la frusta mescolare ed aggiungere il pepe e il sale. \nDopo aver preparato tutto prendete un po' di farina e mettetela sotto l’impasto (così) non si attacca, stendetelo con il mattarello: l’impasto deve essere fine come un foglio. Poi mettete poco olio di semi, aggiungete la salsa (che è composta da zucca, cipolla, carote, uova, ricotta e i formaggi) e la arrotolate. Mettete la Pita in una teglia e imburrata e dopo infornate a 150°C; deve essere dorata. Dopo aggiungere l’acqua tiepida."
}, {
	"nomePiatto": "Placinte",
	"cuochi": ["Tatiana Gaidau"],
	"provenienza": "Moldavia",
	"immagini": ["Placinte1.jps"],
	"ingredienti": ["500 g farina 00",
		"240 ml acqua tiepida",
		"3 cucchiai di olio di semi di girasole",
		"1 cucchiaio di aceto bianco",
		"20 g di sale",
		"1000 g ricotta vaccina",
		"5 uova intere",
		"700 g zucca gialla",
		"200 g zucchero semolato",
		"1 cucchiaino di cannella",
		"100 g di margarina fusa"
	],
	"preparazione": "Si amalgama la farina, l’acqua tiepida, metà del sale diluito in acqua, aceto e olio, ottenendo una pasta liscia e omogenea. Si copre con la pellicola lasciando riposare per 30 min. a temperatura ambiente.Dopo aver fatto riposare la pasta si divide in 6 parti, si stende in dischi spessi 0,5 cm.I dischi di pasta si ungono con olio di girasole e si lasciano riposare altri 15 min. Nel frattempo si prepara la farcia: alla ricotta si aggiungono le uova, l’aneto e il sale q.b. (versione salata). Si grattugia la zucca, si aggiunge lo zucchero, la cannella e nella padella si disidrata sul fuoco, dopodiché si lascia raffreddare. La pasta si stende molto sottile prima con il mattarello poi con le mani. Si mette nella teglia da forno unta il primo strato, poi si prosegue con altri 2 strati sempre spalmando tra loro con la margarina fusa. Dopo aver messo i 3 strati si mette la farcia. Si copre con altri 3 strati con la stessa procedura di prima. Sopra si spennella con l’uovo e si mette nel forno preriscaldato per 20-30min a 200°. Appena raffreddato sulla versione dolce si cosparge di zucchero a velo. La versione salata si serve tiepida."
}, {
	"nomePiatto": "The alla menta",
	"cuochi": ["Baiya Imane", "Essahel Bouchra", "Ezzaky Khadija", "Jauhar Khadija"],
	"provenienza": "Marocco",
	"immagini": ["TheMenta1.jpg", "TheMenta2.jpg", "TheMenta3.jpg"],
	"ingredienti": ["400g di foglie di menta fresca (romana o piperita)",
		"2 litri di acqua calda",
		"300g di zucchero"
	],
	"preparazione": "Fai bollire l'acqua. Versa 60 ml di acqua bollente in una teiera pulita. Sciacquala e poi butta via l'acqua.Aggiungi 1 cucchiaino di tè in foglie nella teiera per ogni 177 ml di acqua calda. Aggiungi 100 ml di acqua calda per ogni tazza di tè. Aggiungi le foglie di menta nella teiera. Aggiungi lo zucchero nella teiera. Riempi la teiera con 1,5 litro d'acqua bollente. Lascia il tè in infusione per cinque minuti o più. Se hai una teiera marocchina o una termoresistente, invece di lasciarla in infusione, mettila sul fornello a fuoco lento e porta il tè leggermente in ebollizione. Poi, toglila immediatamente dal fornello e lascia il tè in infusione ancora per qualche minuto. Versa il tè dall'alto con cura. Questo farà sì che si crei uno strato sottile di schiuma sulla superficie. Mentre versi assicurati che le foglie di tè restino nella teiera. Riempi le tazze per 2/3. In questo modo, permetterai all'aroma di sprigionarsi completamente. Decora con delle foglie di menta. È un passaggio facoltativo ma gli conferisce un aspetto meraviglioso, soprattutto se hai dei tipici bicchieri marocchini."
}]

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
	var output = "";
	//è un array di img
	for (var i = 0; i < ricette[arg].immagini.length; i++) {
		//console.log(ricette[arg].immagini[0]);
		output += "<img class='img-responsive img-circle' style='width:100px;height:100px;' src='img/"+ricette[arg].immagini[i]+"' /> \n"; 
	};

	immagini.innerHTML = output;

	ingredienti.innerHTML = "<li>" + ricette[arg].ingredienti.join("<li>");
	
}

function showBandiere () {
	for (var i = 0; i < ricette.length; i++) {

	var anchorText = document.createTextNode(json[i].provenienza);
	var newAnchor = document.createElement("button");
	newAnchor.appendChild(anchorText);
	newAnchor.setAttribute("onclick", 'showRicetta('+i+')' );

	document.getElementById("bandiere").appendChild(newAnchor);


		console.log(json[i].provenienza);
	};
}

function showCuochi () {
	for (var i = 0; i < ricette.length; i++) {
		for (var j = 0; j < json[i].cuochi.length; j++) {
			//creo text-node
			var anchorText = document.createTextNode(json[i].cuochi[j]);
			
			//creo element-node
			var newAnchor = document.createElement("button");
			//inserisco il text-node nell'element-node
			newAnchor.appendChild(anchorText);
			//setto l'attributo onclick sull'elemnto (tag)
			newAnchor.setAttribute("onclick", 'showRicetta('+i+')' );
			//appendo l'elemento, completo di attributo e text node alla sidebar
			document.getElementById("sidebar").appendChild(newAnchor);
		};
	


		//console.log(json[i].cuochi);
	};
}
showBandiere();
showCuochi();