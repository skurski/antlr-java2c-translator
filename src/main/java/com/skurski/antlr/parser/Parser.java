package com.skurski.antlr.parser;

import java.io.IOException;
import java.io.InputStream;

public interface Parser {
    void parse(InputStream input) throws IOException;
}