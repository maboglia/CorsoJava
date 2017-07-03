import {Component} from 'angular2/core'

@Component({
    selector: 'prodotti',
    template: `
        <h2>Prodotti</h2>
        {{  elenco  }}
        <ul>
            <li *ngFor="#prodotto of prodotti">
                {{prodotto}}
            </li>
        </ul>
    
    `
})


export class ProdottiComponent{
    elenco = "elenco dei prodotti";
    prodotti = [ "Camicia", "Giacca", "Pantalone", "Maglione", "Scarpa", "sciarpa"  ];


}