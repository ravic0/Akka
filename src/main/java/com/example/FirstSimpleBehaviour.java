package com.example;

import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class FirstSimpleBehaviour extends AbstractBehavior<Object> {

    private FirstSimpleBehaviour(ActorContext<Object> context) {
        super(context);
    }

    public static Behavior<Object> create() {
        return Behaviors.setup(FirstSimpleBehaviour::new);
    }

    @Override
    public Receive<Object> createReceive() {
        return newReceiveBuilder()
                .onAnyMessage(message ->
                        {
                            System.out.println("Received: " + message);
                            return this;
                        }
                )
                .build();
    }

}
