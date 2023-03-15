package algoritmos.team;

import com.patrones.demo.factory.Lenovo;
import com.patrones.demo.factoryabstract.exampleone.DellPortatilFactory;
import com.patrones.demo.factoryabstract.exampleone.LenovoMobileFactory;
import com.patrones.demo.factoryabstract.exampleone.MobileFactory;

import java.util.HashMap;
import java.util.Map;

public class MainAt {

    static int differentTeams(String skills) {
        int count = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('p',0);
        map.put('c',0);
        map.put('m',0);
        map.put('b',0);
        map.put('z',0);

        for(int i=0; i<skills.length(); i++) {
            char ch = skills.charAt(i);
            map.put(ch, (map.get(ch)+1));
        }

        int minValue = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println(differentTeams("pcmbzpcmbzpmcpp"));
    }
}
