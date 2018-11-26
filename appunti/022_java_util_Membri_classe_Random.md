I membri della classe Random.
--------------------------------------------------------------
Costruttori pubblici:
..|..
---|---
Random()	|		Costruisce un nuovo generatore di numeri pseudo-casuali, usando la data e l'ora correnti come seme.
Random(int seed)	|	Costruisce un nuovo generatore di numeri pseudo-casuali, usando il seme specificato.
--------------------------------------------------------------
Metodi pubblici:
..|..
---|---
boolean nextBoolean()	|	Restituisce il boolean successivo nella sequenza pseudo-casuale.
void nextBytes(bytes[] b)	|Registra sull'argomento fornito una sequenza di b.length numeri pseudo-casuali, in formato byte.
double nextDouble()	|	Restituisce il double successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed 1 (escluso).
float nextFloat()	|	Restituisce il float successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed 1 (escluso).
double nextGaussian()	|	Restituisce il double gaussiano successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed 1 (escluso).
int nextInt()	|		Restituisce l'int successivo nella sequenza pseudo-casuale.
int nextInt(int n)	|	Restituisce l'int successivo nella sequenza pseudo-casuale, compreso tra 0 (incluso) ed n (escluso).
long nextLong()	|		Restituisce il long successivo nella sequenza pseudo-casuale.
void setSeed(long seed)	|	Reimposta il seme della sequenza.