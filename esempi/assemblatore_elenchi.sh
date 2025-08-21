#!/bin/bash

# Cartella di input (default: corrente)
DIR="${1:-.}"

# File di output
OUTPUT="README_link.md"

# Sovrascrive il file README.md
echo "# Elenco file" > "$OUTPUT"
echo "" >> "$OUTPUT"

# Ciclo su tutti i file della cartella
for file in "$DIR"/*; do
    if [ -f "$file" ]; then
        filename=$(basename "$file")
        echo "- [$filename]($filename)" >> "$OUTPUT"
    fi
done

echo "✅ File $OUTPUT generato con successo."
