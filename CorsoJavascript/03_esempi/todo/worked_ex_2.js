/*
 * Reto #2:
 * Actualmente este script, selecciona todos los gatos, y segun una función
 * aleatoria, determina cuales estarán animados (agregando la clase 'animate')
 *
 * El reto que se plantea es crear una funcion setInterval, que permita a todos
 * los gatos tener la posibilidad de adquirir la class 'animate' (es decir, de
 * animarse cade cierto periodo de tiempo).
 *
 * Se debe tener una funcion que itere sobre los gatos cada cierto tiempo, y
 * replantee si mantener la clase 'animate' o si debe ser removida'.
 *
 */

// envia true o false aleatoriamente
function random(){
    return ((Math.floor(Math.random()*2))==0)
}

window.onload=function(){
    cats=document.querySelectorAll('div[class^="cat"]')
    for(i=0;i<cats.length;i++){
        if(random()){
            oldClasses=cats[i].getAttribute('class')
            cats[i].setAttribute('class', oldClasses+' animate')
        }
    }
}



