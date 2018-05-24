package pl.xkoem.hanoi;

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
            i++;
            stringBuilder.append("Tower ").append(i).append(": ").append(tower.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
