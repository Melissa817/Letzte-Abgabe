# StudentCard

Eine Android-Beispiel-App zur Demonstration von Datenpersistenz und SQLite-Datenbankanbindung in Android-Anwendungen.

## Projektbeschreibung

Diese App dient als Lehrbeispiel für die Implementierung von lokaler Datenpersistenz in Android-Anwendungen unter Verwendung von SQLite-Datenbanken. Sie demonstriert grundlegende CRUD-Operationen (Create, Read, Update, Delete) und die Interaktion zwischen der Android-Benutzeroberfläche und der lokalen Datenbank.

## Technische Voraussetzungen

- Android Studio
- Minimum SDK: API 33
- Getestet auf: Pixel 8 Emulator

## Features

- SQLite Datenbankintegration
- CRUD-Operationen für Studierendendaten
- Beispielhafte Implementierung eines DatabaseHelpers
- Demonstration der Verwendung von ContentValues und Cursors
- Beispiel für die Arbeit mit ListViews und Adaptern

## Installation & Setup

1. Repository klonen:
   ```bash
   git clone https://github.com/derschwabe226/StudentCard.git
   ```
2. Projekt in Android Studio öffnen
3. Gradle-Sync durchführen
4. Emulator mit API 33 (Pixel 8) erstellen oder verwenden
5. App ausführen


## Verwendung

Die App demonstriert:
1. Erstellung einer SQLite-Datenbank
2. Hinzufügen von Studentendaten
3. Anzeigen der gespeicherten Daten
4. Aktualisieren bestehender Einträge
5. Löschen von Datensätzen

## Lernziele

- Verständnis der SQLite-Integration in Android
- Implementierung von CRUD-Operationen
- Datenbankzugriff in Android-Apps
- Best Practices für Datenpersistenz

# ToDo App - Abgabeprojekt

Diese App dient als Abgabeprojekt zur Demonstration von SQLite-Datenbankanbindung in Android.

## Aufgabenbeschreibung

Entwickeln Sie eine ToDo-App mit folgender Funktionalität:


### Dashboard
- Zwei Hauptansichten:
  - Aktive ToDos
  - Erledigte ToDos
- Nach App-Start wird das Dashboard angezeigt

### ToDo-Funktionen
- Anzeige der aktiven ToDos als Cards
- "+" Button zum Hinzufügen neuer ToDos
- Bearbeiten-Button auf jeder ToDo-Card
- Erledigte ToDos werden separat mit Erledigungs-Markierung angezeigt
- ToDo´s sollen gelöscht werden können 

### ToDo-Attribute
Ein ToDo besteht aus:
- Name
- Priorität
- Endzeitpunkt
- Beschreibungstext
- Status (erledigt/offen)

## Technische Vorgaben
- Implementierung ausschließlich in Jetpack Compose
- SQLite-Datenbank zur Datenspeicherung
- Saubere Code-Struktur
- Fehlerbehandlung implementieren

## Bewertung (100 Punkte)

### 1. Formale Anforderungen (10 Punkte)
- Formal korrekte Abgabe via GitHub Repository (10P)

### 2. Datenbank (20 Punkte)
- Tabellenstruktur (5P)
- NOT NULL Constraints (5P)
- Datenbankabfragen (5P)
- DatabaseHelper (5P)

### 3. Benutzeroberfläche (20 Punkte)
- Jetpack Compose Umsetzung (5P)
- Dashboard (5P)
- ToDo-Cards mit Edit (5P)
- Material Design (5P)

### 4. Funktionalität (30 Punkte)
- CRUD-Operationen (10P)
- Statusverwaltung (5P)
- Filterung nach Status (5P)
- Prioritätensystem (5P)
- Deadline-Verwaltung (5P)

### 5. Code-Qualität (20 Punkte)
- Fehlerbehandlung (5P)
- Absturzsicherheit (5P)
- Projektstruktur (5P)
- Code-Dokumentation (5P)

## Punktabzüge
- App-Abstürze (-10P)
- Fehlende Kernfunktionen (-15P)
- Fehlendes Jetpack Compose (-10P)
- Mangelhafte Code-Qualität (-10P)

## Abgabe
- GitHub Repository
- Lauffähige APK
- README mit:
  - Installationsanleitung
  - Funktionsbeschreibung
  - Verwendete Technologien
  - Bekannte Probleme

## Hinweise zur Entwicklung
1. Testen Sie Ihre App gründlich
2. Achten Sie auf Absturzsicherheit
3. Implementieren Sie Fehlerbehandlung
4. Kommentieren Sie wichtige Codeabschnitte
5. Verwenden Sie sprechende Bezeichner

## Voraussetzungen
- Android Studio
- Min. SDK: API 26
- Target SDK: API 34
- Getestet auf Pixel 8 Emulator
