# Inviare email

Per inviare un'email con Java, puoi utilizzare la libreria `JavaMail API`. Di seguito è riportato un esempio di codice per inviare un'email utilizzando questa API:

### Passaggi

1. **Aggiungere la libreria JavaMail**:
   Se stai usando Maven, aggiungi la dipendenza nel file `pom.xml`:

   ```xml
   <dependency>
       <groupId>javax.mail</groupId>
       <artifactId>javax.mail-api</artifactId>
       <version>1.6.2</version>
   </dependency>
   ```

   Se non usi Maven, scarica il file JAR di [JavaMail API](https://javaee.github.io/javamail/) e aggiungilo al tuo classpath.

2. **Codice Java per inviare un'email**:

   ```java
   import java.util.Properties;
   import javax.mail.*;
   import javax.mail.internet.*;

   public class SendEmail {
       public static void main(String[] args) {
           // Impostazioni del server SMTP (per esempio, Gmail)
           String host = "smtp.gmail.com";
           String port = "587"; // Porta per TLS
           final String username = "tuoindirizzo@gmail.com"; // La tua email
           final String password = "tuapassword"; // La tua password

           // Destinatario
           String to = "destinatario@example.com";
           String subject = "Oggetto dell'email";
           String body = "Questo è il corpo dell'email.";

           // Impostazioni delle proprietà per la connessione SMTP
           Properties properties = new Properties();
           properties.put("mail.smtp.host", host);
           properties.put("mail.smtp.port", port);
           properties.put("mail.smtp.auth", "true");
           properties.put("mail.smtp.starttls.enable", "true"); // Abilita TLS

           // Autenticazione
           Session session = Session.getInstance(properties, new Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication(username, password);
               }
           });

           try {
               // Crea il messaggio
               Message message = new MimeMessage(session);
               message.setFrom(new InternetAddress(username));  // L'email del mittente
               message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to)); // Destinatario
               message.setSubject(subject); // Oggetto dell'email
               message.setText(body); // Corpo dell'email

               // Invia l'email
               Transport.send(message);

               System.out.println("Email inviata con successo!");

           } catch (MessagingException e) {
               e.printStackTrace();
           }
       }
   }
   ```

### Spiegazione

- **Impostazioni SMTP**: Nel codice, abbiamo configurato le impostazioni per il server SMTP di Gmail. Se usi un altro provider di posta, dovrai sostituire questi valori con quelli appropriati.
  - Per esempio, per Outlook: `smtp-mail.outlook.com` sulla porta `587`.
- **Autenticazione**: Si utilizza il nome utente e la password per autenticarsi al server SMTP. È preferibile non hardcodificare la password in modo esplicito nel codice per motivi di sicurezza (ad esempio, puoi usare variabili d'ambiente).
- **TLS/SSL**: Il protocollo `STARTTLS` è abilitato per garantire che la connessione al server SMTP sia sicura.

### Considerazioni

- **Autenticazione a due fattori**: Se hai l'autenticazione a due fattori abilitata sul tuo account (ad esempio, Gmail), dovrai generare e utilizzare una password per le app. Puoi farlo nel tuo account Google nelle impostazioni di sicurezza.
- **Server SMTP alternativi**: Se non usi Gmail, dovrai configurare correttamente il server SMTP, come indicato nelle impostazioni del provider (ad esempio, Yahoo, Outlook, etc.).

---

### Ecco le impostazioni SMTP per alcuni dei principali provider di posta elettronica.


| **Provider**       | **Server SMTP**                | **Porta (SSL)** | **Porta (TLS)** | **Autenticazione**     | **Sicurezza**           |
|--------------------|---------------------------------|-----------------|-----------------|------------------------|-------------------------|
| **Gmail**          | smtp.gmail.com                  | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **Yahoo**          | smtp.mail.yahoo.com             | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **Outlook.com**    | smtp-mail.outlook.com            | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **Zoho Mail**      | smtp.zoho.com                   | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **iCloud (Apple)** | smtp.mail.me.com                 | 587             | 587             | Richiesta (username e password) | TLS                    |
| **ProtonMail**     | mail.protonmail.com              | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **FastMail**       | smtp.fastmail.com                | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **Gandi Mail**     | mail.gandi.net                   | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **Mailgun**        | smtp.mailgun.org                 | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **SendGrid**       | smtp.sendgrid.net                | 465             | 587             | Richiesta (username e password) | SSL/TLS                |
| **Amazon SES**     | email-smtp.us-east-1.amazonaws.com | 465             | 587             | Richiesta (username e password) | SSL/TLS                |

### Legenda delle colonne

- **Server SMTP**: Il server che gestisce l'invio delle email.
- **Porta (SSL)**: La porta utilizzata per la connessione sicura tramite SSL (Secure Socket Layer).
- **Porta (TLS)**: La porta utilizzata per la connessione sicura tramite TLS (Transport Layer Security).
- **Autenticazione**: Indica se è necessaria l'autenticazione, che in genere richiede il nome utente e la password dell'account.
- **Sicurezza**: Il tipo di crittografia usata per garantire la sicurezza della connessione (SSL o TLS).

### Considerazioni aggiuntive

1. **Autenticazione a due fattori**: Se hai attivato l'autenticazione a due fattori (2FA) nel tuo account, alcuni provider potrebbero richiedere una password per l'applicazione o un codice di accesso specifico per l'uso di SMTP.

2. **Limitazioni e blocchi**: Alcuni provider di posta elettronica potrebbero limitare o bloccare l'accesso SMTP se rilevano un utilizzo eccessivo o se il tuo account non è verificato.
