package com.mrTequila.Behavioral.Visitor;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
