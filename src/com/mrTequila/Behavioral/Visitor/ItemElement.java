package com.mrTequila.Behavioral.Visitor;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
