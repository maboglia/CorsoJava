# Serializzazione

Un oggetto è serializzabile quando implementa l'interfaccia
java.io.Serializable.

Un oggetto è serializzabile quando può essere convogliato
attraverso uno `stream`, ad esempio per essere conservato
su disco o per essere trasmesso attraverso una rete.

---

Quando lo `stream` sarà recuperato ed interpretato in senso
inverso (operazione detta di deserializzazione), sarà
possibile ricostruire l'oggetto, ripristinando l'esatto
stato interno che aveva al momento della sua
serializzazione.

---

Perno della serializzazione sono i due `stream`
`ObjectOutputStream` e `ObjectInputStream`, rispettivamente
per la serializzazione e per la deserializzazione degli
oggetti. 

---

Entrambe le classi hanno costruttori che accettano
in ingresso, rispettivamente, un `OutputStream` e un
`InputStream` già stabiliti. 

---

In pratica, lavorano da filtro verso dei canali già instaurati. 
`ObjectOutputStream` definisce il metodo `writeObject()`, che permette di
serializzare un oggetto all'interno dello stream. In
maniera speculare, ObjectInputStream `readObject()`, che
recupera l'intero oggetto precedentemente serializzato,
restituendo un riferimento di tipo Object. 

