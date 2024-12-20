package study.inherit.inherit04.v2;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        Cleaner c1 = new Cleaner();
        Cleaner c2 = new DustCleaner();
        Cleaner c3 = new WindowCleaner();
        Cleaner c4 = new FloorCleaner();

        List<Cleaner> list = new ArrayList<>();
        list.add(new DustCleaner());
        list.add(new DustCleaner());
        list.add(new DustCleaner());
        list.add(new WindowCleaner());
        list.add(new WindowCleaner());
        list.add(new WindowCleaner());
        list.add(new FloorCleaner());
        list.add(new FloorCleaner());
        list.add(new FloorCleaner());

        for (Cleaner cleaner : list) {
            cleaner.clean();
        }
    }
}


//타입변환하고 메소드 재정의로 인해 이루어진다