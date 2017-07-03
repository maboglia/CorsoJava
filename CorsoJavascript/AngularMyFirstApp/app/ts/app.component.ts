import {Component} from 'angular2/core';
import {ProdottiComponent} from './prodotti.component'

@Component({
    selector: 'my-app',
    template: '<h1>ProgettoAngular</h1><prodotti></prodotti>',
    directives: [ProdottiComponent]
})

export class AppComponent {}
