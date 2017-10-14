package com.mrTequila.Behavioral.Mediator;

public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Misiek");
        User user2 = new UserImpl(mediator, "Rysiek");
        User user3 = new UserImpl(mediator, "Rys");
        User user4 = new UserImpl(mediator, "Ktos");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello !");
    }
}
