#Annotazioni
Le annotazioni sono lo strumento utilizzato da Java per definire metadati, cioè "informazioni sulle informazioni".
Possiamo definire un’annotation (annotazione) come un appunto che mettiamo per specificare qualcosa relativo al codice che stiamo scrivendo, un attributo particolare, un metodo o una classe che hanno delle peculiarità.
Le annotazioni servono soprattutto per il compilatore che, ricorrendo al loro utilizzo, avrà la possibilità di effettuare determinate operazioni.
Sintassi
Ogni annotazione si presenta con il simbolo @ seguito dal nome dell’annotazione.
Eventualmente può essere valorizzata con dei valori, tra parentesi tonde come coppia nome-valore. Essa precede la classe, il metodo o l’attributo che vogliamo annotare.
Un’annotazione si presente nella seguente forma.

@Autore(
  name = "Claudio De Sio",
  company = "informatica.it"
)
class ClasseAnnotata() {
  ...
}

Nell’esempio abbiamo annotato la classe con l’annotazione Autore ed i due attributi name e company.
Tipi di annotations
@DEPRECATED
L’annotazione @Deprecated viene usata per specificare che l’elemento indicato è un elemento deprecato, cioè, attivo (per mantenere retrocompatibilità) ma non consigliato in quanto è stato rimpiazzato da uno nuovo e supportato.

public class TestDeprecated {
  @Deprecated
  public void metodoA() {
    System.out.println("Questo metodo è DEPRECATO, usa metodoB().");
  }

  public void metodoB() {
    System.out.println("Questo metodo è SUPPORTATO.");
  }
}

La compilazione di questa classe non darà alcun segnale, procederà tutto normalmente. Sarà la compilazione della classe che userà TestDeprecated a ricevere segnalazioni di warning dal compilatore quando viene utilizzato il metodo metodoA().
@OVERRIDE
L’annotazione @Override è probabilmente la più utile in quanto consente di evitare degli errori, che in fase di codifica spesso accadono. L’annotazione dice che l’elemento indicato è un elemento che fa l’override (sovrascrive) del relativo elemento, del genitore da cui eredita.

class A{
  void metodo1(){
    System.out.println("Metodo 1″);
  }
}

class B extends A{
  @Override
  void metodoo1(){
    System.out.println("Override A.metodo1()");
  }
}

Abbiamo la classe genitore A che presenta un metodo, metodo1(). Creiamo una classe B, erede di A. Vogliamo fare l’override di metodo1(), quindi annotiamo il metodo presente nella classe B con l’annotazione @Override, indicando che il metodo annotato è un metodo che sovrascrive un metodo del genitore.
Se si prova a compilare il codice, il compilatore restituirà un errore. Se notate, infatti, è stato inserito un errore di battitura nel nome del metodo. Senza l’annotazione @Override la compilazione sarebbe andata a buon fine e non ci saremmo accorti dell’errore.
@SUPPRESSWARNING
L’annotazione @SuppressWarning è utile quando vogliamo sopprimere le indicazioni di warning da parte del compilatore, ad esempio, perché stiamo usando dei metodi deprecati.

@SuppressWarnings({"deprecation"})
public void usaMetodoDeprecato() {
TestDeprecated t = new TestDeprecated();
t.metodoA();
}

Pur usando dei metodi deprecated, al compilatore abbiamo segnalato di sopprimere i warning.