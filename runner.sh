#!/bin/bash

GRAM="gram"
BUILD="build"
RUN="run"

CLEAN="clean"
RESET="reset"

if [ "$1" == $CLEAN ]; then
 	rm -rf bin/*
elif [ "$1" == $BUILD ]; then
	cd translator
	javac -cp ../lib/antlr4.jar *.java -d ../bin/
elif [ "$1" == $RUN ]; then
	cd bin/
	java -cp ../lib/antlr4.jar:. TranslateToCTool ../input/*.java
elif [ "$1" == $GRAM ]; then
	cd translator/
	java -jar ../lib/antlr4.jar Java.g4
elif [ "$1" == $RESET ]; then
	rm -rf bin/*
	rm -rf output/*
	rm -f translator/Java*.java
	rm -f translator/*.tokens
fi
