package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {


        zofka.setLocation(70, 80);
        kolecko(Color.blue);

        zofka.setLocation(128, 220);
        trojuhelnik(Color.ORANGE, 140);



        for (int i = 0; i < 3; i++) {
            koleckoSnehulak(Color.cyan, 320, 80 + 70 * i,200*(i+1));
            zofka.turnRight(32);

        }
        zofka.setLocation(290, 160);
        ruceSnehulaka(Color.blue);
        zofka.setLocation(460, 100);
        ruceSnehulaka(Color.blue);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }


    public void kolecko(Color color) {
        zofka.setPenColor(color);
        double jemnostKruhu = 120;
        double obvodKruhu = 360;
        for (int i = 0; i < jemnostKruhu; i++) {
            zofka.turnRight(360 / jemnostKruhu);
            zofka.move(obvodKruhu / jemnostKruhu);
        }
    }
    public void koleckoSnehulak(Color color, int zacinajiciX, int zacinajiciY, int obvodKruhu) {
        zofka.setLocation(zacinajiciX, zacinajiciY);
        zofka.setPenColor(color);
        double jemnostKruhu = 120;
        for (int i = 0; i < jemnostKruhu; i++) {
            zofka.turnRight(360 / jemnostKruhu);
            zofka.move(obvodKruhu / jemnostKruhu);
        }

    }
    public void ruceSnehulaka (Color color){
        zofka.setPenColor(color);
        double jemnostKruhu = 100;
        double obvodKruhu = 120;
        for (int i = 0; i < jemnostKruhu; i++) {
            zofka.turnRight(360 / jemnostKruhu);
            zofka.move(obvodKruhu / jemnostKruhu);
        }
    }



    public void trojuhelnik(Color color, double velikostStrany) {
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
