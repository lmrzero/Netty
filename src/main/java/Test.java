import java.util.HashMap;

/**
 * created by LMR on 2019/10/21
 */
public class Test {

    public static void main(String[] args) {
        Object object= new Object(){

            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(object.equals("hello"));
    }
}
