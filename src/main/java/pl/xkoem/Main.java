package pl.xkoem;

import pl.xkoem.hanoi.Hanoi;
import pl.xkoem.hanoi.printer.HanoiPrinter;

public class Main {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        HanoiPrinter.printHanoi(hanoi);
        hanoi.solve();
    }
}
