package projava;

import java.util.List;

public class ForEachListSample {
    public static void main(String[] args) {
        var names = List.of("yusuke", "kis", "sugiyama");
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}