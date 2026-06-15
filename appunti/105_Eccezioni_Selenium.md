# Eccezioni Selenium

Eccezione|Descrizione
---|---
ElementNotVisibleException | Questo tipo di eccezione Selenium si verifica quando un elemento esistente nel DOM ha una funzionalità impostata come nascosta.
ElementNotSelectableException | L'elemento è visibile, ma non selezionabile. Utilizzare la rispettiva condizione prevista per evitare ciò.
NoSuchElementException | L'elemento non si trova nel DOM di Selenium. Potrebbe non essere caricato, quindi utilizza un tipo di attesa.
NoSuchFrameException | Questa eccezione si verifica se la destinazione del frame a cui passare non esiste.
NoAlertPresentException | Questa eccezione si verifica quando si passa all'avviso senza presentazione.
NoSuchWindowException | Questa eccezione si verifica se la finestra di destinazione da cambiare non esiste.
StaleElementReferenceException | L'elemento è vecchio e potrebbe non essere più disponibile nel DOM.
SessionNotFoundException | Il WebDriver viene richiamato dopo che è stato chiuso.
TimeoutException | Lanciato quando non c'è abbastanza tempo per completare un comando. Ad esempio, l'elemento cercato non è stato trovato nel tempo specificato.
WebDriverException | Il WebDriver viene richiamato dopo che è stato chiuso.
ConnectionClosedException | Molto probabilmente hai disconnesso il driver.
ElementClickInterceptedException | L'elemento potrebbe non ricevere il clic. Prova la classe javascriptExecutor per fare clic su di esso.
ElementNotInteractableException | L'elemento è nel DOM, tuttavia non puoi interagire con esso. Utilizzare la condizione prevista appropriata.
InsecureCertificateException | Certificato autofirmato, non valido o scaduto.
InvalidArgumentException | Si verifica quando un argomento non appartiene al tipo previsto. Ad esempio, l'URL non è valido e si esegue driver.get() su di esso.
InvalidCoordinatesException | Questo tipo di eccezione corrisponde a un'operazione interagente che non è valida.
InvalidElementStateExceptio | Si verifica quando il comando non può essere completato quando l'elemento non è valido.
InvalidSessionIdException | La sessione del conducente è inattiva. Forse stai utilizzando un webdriver diverso, invece di utilizzarne uno esistente.
InvalidSwitchToTargetException | La finestra di destinazione da cambiare non esiste.
JavascriptException | Javascript non valido inviato all'oggetto javascriptExecutor.
NoSuchAttributeException | Questo tipo di eccezione si verifica quando non è stato possibile trovare l'attributo di un elemento.
MoveTargetOutOfBoundsException | Ha luogo se il target fornito alla metodologia move() di ActionChains non è valido. Ad esempio, fuori dal documento.
NoSuchContextException | ContextAware esegue test sui dispositivi mobili.
NotFoundException | Questa eccezione è una sottoclasse di WebDriverException. Ciò si verificherà quando un elemento nel DOM non esiste.
RemoteDriverServerException | Questa eccezione Selenium viene generata quando il server non risponde a causa del problema relativo alla non correttezza delle funzionalità descritte.
ScreenshotException | Non è possibile catturare una schermata.
SessionNotCreatedException | Succede quando non è possibile creare correttamente una nuova sessione.
UnableToSetCookieException | Ciò si verifica se un driver non è in grado di impostare un cookie.
UnexpectedTagNameException | Succede se una classe di supporto non ha ottenuto un elemento web come previsto.
UnhandledAlertException | Questa aspettativa si verifica quando è presente un avviso, ma WebDriver non è in grado di eseguire l'operazione di avviso.
UnexpectedAlertPresentException | Si verifica quando si verifica un avviso inaspettato.
UnreachableBrowserException | Molto probabilmente il browser si blocca. Aggiorna il tuo webdriver e browser.
UnsupportedCommandException | Ciò si verifica quando il WebDriver remoto non invia comandi validi come previsto.