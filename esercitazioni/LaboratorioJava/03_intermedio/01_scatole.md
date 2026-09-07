# Esercitazione 1 – Scatole e ereditarietà

Realizzare in Java un piccolo sistema per rappresentare diversi tipi di scatole.

Definire una classe `Scatola` con le dimensioni altezza, larghezza e profondità e un metodo che calcoli il volume.

Definire poi una classe `ScatolaPesante` che estenda `Scatola` e aggiunga il peso della scatola. Deve essere possibile calcolare il peso specifico, cioè il rapporto tra peso e volume.

Infine definire una classe `ScatolaTarata` che estenda `ScatolaPesante` e rappresenti una scatola con una tara. Deve essere possibile calcolare il peso netto sottraendo la tara al peso complessivo.

Nel programma principale:
- creare almeno un oggetto per ciascun tipo di scatola;
- visualizzare volume, peso specifico e, quando applicabile, peso netto;
- inserire le scatole in una collezione di tipo `ArrayList<Scatola>`;
- percorrere la collezione e riconoscere le scatole tarate utilizzando il polimorfismo e, dove necessario, `instanceof`.

Prestare attenzione all'uso dell'ereditarietà e al corretto accesso agli attributi delle classi.
