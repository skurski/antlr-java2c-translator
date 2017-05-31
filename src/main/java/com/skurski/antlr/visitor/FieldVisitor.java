package com.skurski.antlr.visitor;

import com.skurski.antlr.JavaBaseVisitor;
import com.skurski.antlr.JavaParser;
import com.skurski.antlr.model.Field;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by psk on 25.05.17.
 */
public class FieldVisitor extends JavaBaseVisitor<Field> {

    @Override
    public Field visitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) {
        Field field = new Field();
        field.setModifier(ctx.modifier().getText());
        field.setReturnType(ctx.variableDeclarator().type().getText());
        field.setName(ctx.variableDeclarator().variableName().getText());
        field.setValue(ctx.variableDeclarator().variableInitializer().expression().literal().getText());
        field.setConstant(ctx.constant() != null);
        return field;
    }

}
