package pl.xkoem.hanoi.tower;

import pl.xkoem.hanoi.ring.Ring;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tower {

    private Queue<Ring> tower;

    Tower() {
        tower = new ArrayDeque<>();
    }

    public void add(Ring ring) {
        tower.add(ring);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Ring[] tmpTower = new Ring[tower.size()];
        tmpTower = tower.toArray(tmpTower);
        for (Ring ring: tmpTower) {
            stringBuilder.append(ring.getWeight()).append(" ");
        }
        return stringBuilder.toString();
    }
}
