package com.company;

public class Main {

    public static void main(String[] args) {
        Desk d = new Desk();
        d.inizialization();
        d.deskDrawPole();
        Vinner v = new Vinner();
        Reeder r = new Reeder();
        for (int i = 0; i < 9; i++) {
            d.writer(r.readerKey(), d.xo());
            d.deskDrawPole();
            v.vinDetect(d.pole);
        }
    }
}
