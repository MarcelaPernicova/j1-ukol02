package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(70,80);
        kolecko(Color.blue);

        zofka.setLocation(128,220);
        trojuhelnik(Color.ORANGE,140);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void kolecko(Color color){
        zofka.setPenColor(color);
        int jemnostKruhu = 120;
        int obvodKruhu = 360;
        for(int i=0; i < jemnostKruhu; i++) {
            zofka.turnRight(obvodKruhu /jemnostKruhu);
            zofka.move(360/jemnostKruhu);
        }
        }
    public void trojuhelnik (Color color,double velikostStrany){
        zofka.setPenColor(color);
        zofka.turnLeft(30);
        zofka.move(velikostStrany);
        zofka.turnRight(120.0);
        zofka.move(velikostStrany);
        zofka.turnRight(120.0);
        zofka.move(velikostStrany);
        zofka.turnRight(120.0);

    }

}
