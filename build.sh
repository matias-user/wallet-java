#!/bin/bash

SRC_DIR="src/main/java"
OUT_DIR="out"
MAIN_CLASS="com.testing.Main"

echo "Compilando..."

mkdir -p "$OUT_DIR"
find "$SRC_DIR" -name "*.java" > sources.txt

javac -d "$OUT_DIR" @sources.txt

echo "Ejecutando"

java -cp "$OUT_DIR" "$MAIN_CLASS"