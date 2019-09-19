# Casting e promotion

* `( nometipo ) variabile`
* `( nometipo ) espressione`
* Trasforma il valore della variabile (espressione) in quello corrispondente in un tipo diverso
* Il cast si applica anche a `char`, visto come tipo intero positivo

* La promotion è automatica quando necessaria
  * Es. `double d = 3 + 4;`
* Il casting deve essere esplicito: il programmatore si assume la responsabilità di eventuali perdite di informazione
  * Per esempio 
  * `int i = ( int ) 3.0 * ( int ) 4.5;` i assume il valore 12
  * `int j = ( int ) (3.0 * 4.5);` j assume il valore 13