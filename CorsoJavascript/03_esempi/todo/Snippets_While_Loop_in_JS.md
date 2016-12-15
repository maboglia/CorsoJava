//-----------------------------------------------------------

// Introduction to 'While' Loops in J 1/11

var coinFace = Math.floor(Math.random() * 2);

while(coinFace === 0){
	console.log("Heads! Flipping again...");
	var coinFace = Math.floor(Math.random() * 2);
}
console.log("Tails! Done flipping.");


//-----------------------------------------------------------



// Introduction to 'While' Loops in 8/11

for (var i = 1; i < 5; i++) {
    console.log("Counting to " + i);
    count = 0;
    while (count < i+1) {
        console.log(count);        
        count += 1;
    };
    
}
console.log("I count");


//-----------------------------------------------------------

// Introduction to 'While' Loops in J 6/11
//Remember to make your condition true outside the loop!

var soloLoop = function(){
    //Your code goes here!
    var loop = true;
    while (loop) {
        console.log( "Looped once!");
        loop = false;
    } 
};

soloLoop();

//-----------------------------------------------------------

//Introduction to 'While' Loops in 10/11

var getToDaChoppa = function(faraway){
  // Write your do/while loop here!
    do {
        console.log("Keep running we are " + faraway + " yards from the choppa");
        faraway -= 1;
    } while(faraway > 0)
  
};

getToDaChoppa(5);
