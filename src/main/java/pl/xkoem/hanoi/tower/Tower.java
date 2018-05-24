package pl.xkoem.hanoi.tower;

import pl.xkoem.hanoi.ring.Ring;

import java.util.Stack;

public class Tower {

    private Stack<Ring> tower;

    Tower() {
        tower = new Stack<>();
    }

    void add(Ring ring) {
        tower.add(ring);
    }

    Ring pop() {
        return tower.pop();
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
