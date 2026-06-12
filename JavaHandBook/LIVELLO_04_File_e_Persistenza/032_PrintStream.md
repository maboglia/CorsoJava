# PrintStream

`PrintStream` deriva da `OutputStream`, specializzandola con numerosi nuovi metodi.

Questo tipo di stream è caratterizzato dal fatto che i suoi costruttori ed i suoi metodi aggiuntivi non propagano delle IOException.

`PrintStream` è ideale quando si gestiscono informazioni testuali.

I metodi aggiuntivi sono tutti del tipo `print()` e `println()`.

Il primo invia semplicemente in output il dato passato; il secondo introduce un ritorno a nuova riga dopo di esso.

Le varianti di `print()` e `println()` che gestiscono gli oggetti fanno ricorso al metodo toString(), per inviare in output una loro rappresentazione testuale.

`PrintStream` cerca di arginare il problema indotto dalla mancata gestione delle eccezioni attraverso il metodo checkError(), che restituisce true nel caso in cui l'ultima operazione tentata sia fallita.
