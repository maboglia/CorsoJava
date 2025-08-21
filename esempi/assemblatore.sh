#!/bin/bash

# Nome del file di output
OUTPUT="unione_sorgenti.java"

# Svuoto/creo il file di output
> "$OUTPUT"

# Ciclo su tutti i file .java della cartella
for file in *.java; do
    echo "===== FILE: $file =====" >> "$OUTPUT"
    cat "$file" >> "$OUTPUT"
    echo -e "\n\n" >> "$OUTPUT"
done

echo "Tutti i file .java sono stati uniti in $OUTPUT"
