/*
 * Reto #1:
 * Actualmente este script, recibe de entrada una cadena de texto (la variable
 * 'message', para ser exacto), el reto que se plantea es cambiar la entrada
 * de modo que en lugar de recibir una cadena pueda recibirse un arreglo de
 * cadenas.
 *
 * Ej:
 *      var messages = [
 *          'Demostración para el curso de javascript básico.',
 *          'Ahora este script puede escribir multiples lineas',
 *          'adios....'
 *      ]
 *
 * De modo que cada elemento del arreglo sea una parrafo diferente en el HTML.
 *
 */

var message='Dimostrazione per il corso di Javascript'

function typing(count){
    count=count||0      // si count es undefined, se asigna cero
    node=document.getElementById('typing')
    node.insertAdjacentHTML('beforeend',message[count])
    if(count+1<message.length){
        setTimeout(typing,250,++count)
    }
}

window.onload=function(){
    setInterval(function(){
        cursor=document.getElementById('cursor')
        switch(cursor.innerHTML){
            case ' ':
                cursor.innerHTML='_'
                break
            case '_':
                cursor.innerHTML=' '
                break
        }
    },700)
    setTimeout(typing,4000,0)
}

