package pl.xkoem.hanoi.tower;

import pl.xkoem.hanoi.ring.Ring;

import java.util.ArrayList;
import java.util.List;

public class Towers {

    List<Tower> towers;

    public Towers(int amount) {
        createTowers(amount);
    }

    private void createTowers(int amount) {
        towers = new ArrayList<>();
        while(amount > 0) {
            towers.add(new Tower());
            amount--;
        }
    }

    public void fillTower(int index, int maxRing) {
        Tower tower = towers.get(index);
        while(maxRing > 0) {
            tower.add(new Ring(maxRing));
            maxRing--;
        }
    }

    public Tower[] toArray() {
        Tower[] array = new Tower[towers.size()];
        return towers.toArray(array);
    }

    public void move(int from, int to) {
        towers.get(to).add(towers.get(from).pop());
    }
}
