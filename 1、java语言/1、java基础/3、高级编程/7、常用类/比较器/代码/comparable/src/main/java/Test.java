import java.util.*;

/**
 * @Author: Metatron
 * @CreateTime: 2020-07-01 14:24
 * @Description: ${Description}
 */
public class Test {

    public static void main(String[] args) {
        ArrayList strings = new ArrayList();



        Collections.sort(strings, new Comparator(){
            public int compare(Object o1, Object o2) {
                return 0;
            }
        }) ;
    }
}

