# Running ANTLR4

lib - libraries like antlr4
bin - compiled .class files
translator - application java files

1. Installing ANTLR4 in lib folder
```bash
	curl -O http://www.antlr.org/download/antlr-4.6-complete.jar
	mv antlr-4.0-complete.jar antlr4.jar
```

2. Running ANTLR4 on grammar from translator (project) folder

```bash
	java -jar ../lib/antlr4.jar Java.g4
```

4. Compiling from translator (project) folder
```bash
	javac -cp ../lib/antlr4.jar *.java -d ../bin/
```
	
5. Run translator from bin folder
```bash
	java -cp ../lib/antlr4.jar:. ExtractInterfaceTool ../input/Demo.java
```

3. Testing

```bash
	alias grun='java -cp .:antlr4.jar org.antlr.v4.runtime.misc.TestRig'​
	grun Hello r -gui
```
