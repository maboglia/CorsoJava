# Kubernetes

Kubernetes è un sistema open-source per l'automazione della distribuzione, della scalabilità e della gestione delle applicazioni containerizzate. Consente di orchestrare i container in un ambiente di produzione, gestendo aspetti come la distribuzione, l'aggiornamento, la scalabilità e la gestione delle risorse. Ecco alcuni concetti e operazioni fondamentali relativi a Kubernetes:

### Concetti Fondamentali

1. **Pod:**
   - Un Pod è la più piccola unità di base in Kubernetes. Contiene uno o più container e rappresenta il livello di esecuzione per le applicazioni.

2. **Deployment:**
   - Un Deployment gestisce la distribuzione di un'applicazione, definendo il numero desiderato di repliche di un Pod e gestendo gli aggiornamenti e le rollbacks dell'applicazione.

3. **Service:**
   - Un Service esposto un gruppo di Pod come un servizio di rete stabile con un nome e un indirizzo IP. I Service consentono la comunicazione tra i diversi componenti dell'applicazione.

4. **ConfigMap e Secret:**
   - ConfigMap e Secret sono risorse per la gestione della configurazione dell'applicazione. ConfigMap contiene dati di configurazione, mentre Secret gestisce dati sensibili come password o chiavi.

5. **Namespace:**
   - Namespace fornisce uno spazio virtuale in un cluster Kubernetes. È possibile avere risorse con lo stesso nome all'interno di namespace diversi senza interferenze.

6. **Ingress:**
   - L'Ingress è una risorsa che gestisce l'accesso esterno alle applicazioni in esecuzione nel cluster. Definisce regole di routing basate su URL.

### Operazioni Principali

1. **Creazione di un Deployment:**
   - Utilizza un file YAML per definire un Deployment, specificando il numero di repliche e il template del Pod. Esempio:

     ```yaml
     apiVersion: apps/v1
     kind: Deployment
     metadata:
       name: nome-deployment
     spec:
       replicas: 3
       selector:
         matchLabels:
           app: nome-app
       template:
         metadata:
           labels:
             app: nome-app
         spec:
           containers:
           - name: nome-container
             image: nome-immagine:tag
     ```

     Esegui il comando:

     ```bash
     kubectl apply -f nome-file.yaml
     ```

2. **Creazione di un Service:**
   - Utilizza un file YAML per definire un Service, collegandolo al Deployment. Esempio:

     ```yaml
     apiVersion: v1
     kind: Service
     metadata:
       name: nome-service
     spec:
       selector:
         app: nome-app
       ports:
         - protocol: TCP
           port: 80
           targetPort: 8080
     ```

     Esegui il comando:

     ```bash
     kubectl apply -f nome-file.yaml
     ```

3. **Monitoraggio dei Pod:**
   - Visualizza lo stato dei Pod con il comando:

     ```bash
     kubectl get pods
     ```

4. **Scalabilità del Deployment:**
   - Aggiorna il numero di repliche in un Deployment con il comando:

     ```bash
     kubectl scale deployment nome-deployment --replicas=5
     ```

5. **Esecuzione di un'applicazione locale:**
   - Esegui un'applicazione localmente in modalità port-forwarding con il comando:

     ```bash
     kubectl port-forward nome-pod locale:remoto
     ```

6. **Visualizzazione dei log di un Pod:**
   - Visualizza i log di un Pod con il comando:

     ```bash
     kubectl logs nome-pod
     ```

7. **Eliminazione di un Deployment o Service:**
   - Elimina un Deployment o Service con il comando:

     ```bash
     kubectl delete deployment nome-deployment
     kubectl delete service nome-service
     ```

Questi sono solo esempi di comandi comuni che puoi utilizzare con Kubernetes. La gestione delle risorse e delle operazioni all'interno di Kubernetes è ampiamente personalizzabile e può essere adattata alle tue esigenze specifiche. Esplora ulteriormente la documentazione ufficiale di Kubernetes per maggiori dettagli e funzionalità avanzate: [Kubernetes Documentation](https://kubernetes.io/docs/home/).
