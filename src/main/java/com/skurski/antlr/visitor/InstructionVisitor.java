package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Instruction;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by psk on 23.05.17.
 */
public class InstructionVisitor extends JavaBaseVisitor<Instruction> {

    @Override
    public Instruction visitInstruction(@NotNull JavaParser.InstructionContext ctx) {
        String instructionName = ctx.getText();
        return new Instruction(instructionName);
    }
}
