var materie = [
	'Java',
	'Javascript',
	'Sql',
	'Html5',
	'WordPress',
	'Css3',
	'JQuery',
	'JSP', 
	'Bootstrap',
	'AngularJS',
	'GIT github', 
	'JSON',
	'SQLServer',
	'CLI', 
	'SEO',
];

var ide = [
	'Eclipse',
	'Dreamweaver',
	'Sublime-text',
	'Vim',
	'IntelliJ',
	'NetBeans',
	'Putty',
	'PhpMyAdmin',
	'Packet Tracer'
];

var programmaJava = [

	'Algoritmi',
	'UML Class diagram',
	'OOP',
	'Java Building Blocks',
	'Java Collection Framework',
	'Core Java Api',
	'Design Pattern: MVC, Singleton, '




];




$(document).ready(function() {
	
	var elencoMaterie = $("#elencoMaterie").children();

	//alert(elencoMaterie);

	var contatore=0;
	
	$("#btnSkill").on("click", function (argument) {

		$(elencoMaterie).each(function(index) {
	
			contatore++;
		var divModifica =   $(this);
		console.log(divModifica.height());
		console.log(divModifica.width());
		console.log(divModifica.innerHeight());
		console.log(divModifica.outerHeight());
		console.log(divModifica.innerWidth());
		console.log(divModifica.outerWidth());

		divModifica.empty();

		divModifica.addClass('col-md-6 col-sm-6');
		divModifica.removeClass('col-lg-6');
		divModifica.toggleClass('col-lg-6');

		if (contatore==1){
				console.log(contatore);
				materie.sort();
			$.each(materie, function(index, val) {
				 
				var heading = $("<h4>"+ val +"</h4>");
				divModifica.append(heading);

			});
		}

		if (contatore==2){
				console.log(contatore);
				ide.sort();
			$.each(ide, function(index, val) {
				 
				var heading = $("<h4>"+ val +"</h4>");
				divModifica.append(heading);

			});
		}


		});


	});


	$("#btnFunzione1").click(function(event) {
		//$(this).toggleClass('btn btn-danger');
		//effetti jquery: hide(), show(), toggle()
		//effetti jquery: fadeIn(), fadeOut(), fadeTo()
		//effetti jquery: slideUp(), slideDown(), slideToggle()


		$("#elencoMaterie").children().first().animate({fontSize: "30px", top: "500px"}, 1000);
	});


	$("#btnFunzione2").click(function(event) {
		
		$("#elencoMaterie").children().first().animate({fontSize: "12px", top: "0px"}, 1000);

	});

	function onComplete() {
		console.log("effetto!!");
	}




});