package pl.xkoem.hanoi;

import pl.xkoem.hanoi.printer.HanoiPrinter;
import pl.xkoem.hanoi.tower.Tower;
import pl.xkoem.hanoi.tower.Towers;

public class Hanoi {
    Towers towers;

    public Hanoi() {
        fillTowers(0);
    }

    private void fillTowers(int towerToFill) {
        towers = new Towers(3);
        towers.fillTower(towerToFill, 5);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (Tower tower: towers.toArray()) {
            stringBuilder.append("Tower ").append(i).append(": ").append(tower.toString()).append("\n");
            i++;
        }
        return stringBuilder.toString();
    }

    public void solve() {
        move(5, 0, 1 ,2);
    }

    private void move(int n, int A, int B, int C) {
        if (n <= 0) {
            return;
        }
        move(n - 1, A, C, B);
        System.out.println("Moving from " + A + " to " + B);
        towers.move(A, C);
        HanoiPrinter.printHanoi(this);
        move(n - 1, B, A, C);

    }
}
