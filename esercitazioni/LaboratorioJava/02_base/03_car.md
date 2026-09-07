# Esercitazione 3 — Automobile e consumo di carburante

Realizzare una classe `Car` che rappresenti un'automobile dal punto di vista del consumo di carburante.

Ogni automobile deve avere:
- una **resa**, espressa in chilometri per litro;
- la quantità di carburante presente nel serbatoio.

Il carburante iniziale deve essere pari a zero.

Implementare i metodi:
- `addGas(...)` per aggiungere carburante;
- `getGas()` per conoscere il carburante disponibile;
- `drive(...)` per simulare un viaggio di una determinata distanza e aggiornare il carburante residuo.

Il metodo `drive` deve calcolare correttamente il carburante consumato in base alla resa dell'automobile.

Gestire anche il caso in cui il carburante disponibile non sia sufficiente per completare il percorso: l'operazione non deve produrre un livello di carburante negativo.

Nel `main` creare un'automobile, effettuare un rifornimento e simulare diversi percorsi, visualizzando il carburante residuo dopo ogni viaggio.
