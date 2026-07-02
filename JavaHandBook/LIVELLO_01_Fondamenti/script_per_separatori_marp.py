import re
from pathlib import Path


def inserisci_separatori_marp(file_input, file_output):
    path_in = Path(file_input)
    path_out = Path(file_output)

    if not path_in.exists():
        print(f"Errore: Il file {file_input} non esiste.")
        return

    # Legge il contenuto del file
    contenuto = path_in.read_text(encoding="utf-8")

    # Separiamo il frontmatter iniziale (se presente) dal resto del testo
    # Cerca il blocco compreso tra i primi due ---
    frontmatter_match = re.match(r"^(---\s*\n.*?\n---\s*\n)(.*)$", contenuto, re.DOTALL)
    
    if frontmatter_match:
        frontmatter = frontmatter_match.group(1)
        corpo_testo = frontmatter_match.group(2)
    else:
        # Se non c'è il frontmatter, lo creiamo base per Marp
        frontmatter = "---\nmarp: true\ntheme: default\npaginate: true\n---\n\n"
        corpo_testo = contenuto

    # Dividiamo il corpo del testo in righe
    righe = corpo_testo.splitlines()
    nuovo_corpo = []
    
    for i, riga in enumerate(righe):
        # Criterio: Cerca righe che iniziano con # o ## (Titoli principali e secondari)
        # Puoi modificare la regex se vuoi isolare solo i titoli di primo livello: r'^#\s'
        if re.match(r'^#{1,2}\s', riga.strip()):
            
            # Controlliamo cosa c'era prima per evitare separatori duplicati
            # Se la riga precedente non era già un separatore e non siamo all'inizio assoluto
            if nuovo_corpo and not _precedente_e_separatore(nuovo_corpo):
                nuovo_corpo.append("")
                nuovo_corpo.append("---")
                nuovo_corpo.append("")
        
        nuovo_corpo.append(riga)

    # Ricombina tutto insieme
    testo_finale = frontmatter + "\n".join(nuovo_corpo)
    
    # Rimuove eventuali blocchi di 3 o più linee vuote consecutive per pulizia
    testo_finale = re.sub(r'\n{3,}', '\n\n', testo_finale)

    # Scrive il nuovo file
    path_out.write_text(testo_finale, encoding="utf-8")
    print(f"File elaborato con successo! Salvato in: {file_output}")


def _precedente_e_separatore(lista_righe):
    """Controlla a ritroso se l'ultimo elemento non vuoto inserito è già un separatore."""
    for riga in reversed(lista_righe):
        if riga.strip() == "---":
            return True
        if riga.strip() != "":
            return False
    return False


# --- CONFIGURAZIONE ED ESECUZIONE ---
if __name__ == "__main__":
    # Inserisci qui i percorsi dei tuoi file
    file_origine = "JHB_01.md"
    file_destinazione = "presentazione_marp.md"
    
    inserisci_separatori_marp(file_origine, file_destinazione)