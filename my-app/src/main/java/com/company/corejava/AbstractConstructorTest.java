package com.company.corejava;

public class AbstractConstructorTest {
    public static void main(String args[]) {
        Server server = new Tomcat();
        server.start();
    }
}

abstract class Server {
    protected String name;

    public Server() {
        System.out.println("In Server");
    }
    public Server(String name) {
        this.name = name;
    }

    public abstract boolean start();
}

class Tomcat extends Server {
    public Tomcat() {
//        super(name);
        System.out.println("In Tomcat");
    }

    @Override
    public boolean start() {
        System.out.println(this.name + " started successfully");
        return true;
    }
}


