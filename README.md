Java to C translator
====================

Translator from subset of Java language to C language.

1. Compile and run from command line:
 ```
 mvn compile exec:java
 ```
2. Run from IDE
    - mvn clean install
    - run Translator.main() method
3. Generated sources are in src/main/generated-sources (all ANTLR4 files)
4. Input file is in the resources/input directory.
5. Output is printed to the console

