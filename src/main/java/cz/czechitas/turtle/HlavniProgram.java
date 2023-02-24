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



        zofka.turnLeft(65);
        zofka.setLocation(650, 280);
        smetadlo(Color.red, 80,130,100);

        zofka.setLocation(650, 240);
        zofka.turnRight(45);
        obdelnik(Color.green, 150, 100);

        zofka.turnLeft(225);
        zofka.setLocation(900, 240);
        zofka.turnRight(45);
        obdelnik(Color.magenta, 150, 100);

        zofka.setLocation(850, 180);
        kolecko(Color.BLUE);

        zofka.setLocation(690, 240);
        koloVlaku(Color.ORANGE);

        zofka.setLocation(750, 240);
        koloVlaku(Color.orange);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }




    public void obdelnik (Color color, double jednaStrana, double druhaStrana){
        zofka.setPenColor(color);
        zofka.move(jednaStrana);
        zofka.turnLeft(90);
        zofka.move(druhaStrana);
        zofka.turnLeft(90);
        zofka.move(jednaStrana);
        zofka.turnLeft(90);
        zofka.move(druhaStrana);

    }


    public void smetadlo (Color color, double delkaStrany, double dalsiStrana, double posledniStrana){
        zofka.setPenColor(color);
        zofka.move(delkaStrany);
        zofka.turnLeft(130.0);
        zofka.move(dalsiStrana);
        zofka.turnLeft(140);
        zofka.move(posledniStrana);
        zofka.turnLeft(45);
    }

    public void koloVlaku (Color color){
        zofka.setPenColor(color);
        double jemnostKola = 100;
        double obvodKola = 120;
        for (int i = 0; i < jemnostKola; i++){
            zofka.turnRight(360 / jemnostKola);
            zofka.move(obvodKola / jemnostKola);
        }

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
