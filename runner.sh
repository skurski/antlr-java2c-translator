#!/bin/bash

CLEAN="clean"
BUILD="build"
RUN="run"
GRAM="gram"
RESET="reset"

if [ "$1" == $CLEAN ]; then
 	rm -rf bin/*
elif [ "$1" == $BUILD ]; then
	cd translator
	javac -cp ../lib/antlr4.jar *.java -d ../bin/
elif [ "$1" == $RUN ]; then
	cd bin/
	java -cp ../lib/antlr4.jar:. ExtractInterfaceTool ../input/*.java
elif [ "$1" == $GRAM ]; then
	cd translator/
	java -jar ../lib/antlr4.jar Java.g4
elif [ "$1" == $RESET ]; then
	rm -rf bin/*
	rm -rf output/*
	rm -f translator/Java*.java
	rm -f translator/*.tokens
fi
