package designpattern.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/2/17
 **/
public class A {
    static Pattern pattern = Pattern.compile("^([1-9]{1}\\d{0,10})(\\.(\\d){0,2})?");
    public static void main(String[] args) {
        String a = "12367891.934";
        System.out.println(pattern.matcher(a));
        System.out.println(a.matches("^([1-9]{1}\\d{0,10})(\\.(\\d)*)?"));

        System.out.println(a.matches("([1-9]\\d*|0)(\\.\\d{1,2})?"));
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println(new BigDecimal(a).setScale(2, BigDecimal.ROUND_HALF_UP).toString());

        Map<String, Object> map = new HashMap<>();
        map.put("1","2");
        System.out.println(map.get("1").toString());

        String string = "345678{}\":\"{}{:[";
        String regEx="[^`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);

        Matcher matcher = p.matcher(string);
        List<String> list = new ArrayList<>();
    }
}
