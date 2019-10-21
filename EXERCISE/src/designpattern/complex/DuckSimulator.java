package designpattern.complex;

/**
 * @description:
 * @author: YF.Mao
 * @create: 2019/3/12
 **/
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();

        String n = "sfsfsaf\\nsfs";
        //n = n.replaceAll("\\n","\n");
        n = n.replace("\\n", "\n");
        System.out.println(toHTMLString(n));
    }

    void simulate() {
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());

        System.out.println("\nDuck Simulator");

        duckCall.quack();
        redheadDuck.quack();
        mallardDuck.quack();
        rubberDuck.quack();

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }


    public static String toHTMLString(String in) {
        StringBuffer out = new StringBuffer();
        for (int i = 0; in != null && i < in.length(); i++) {
            char c = in.charAt(i);
            if (c == '\'') {
                out.append("'");
            } else if (c == '\"') {
                out.append("\"");
            } else if (c == '<') {
                out.append("<");
            } else if (c == '>') {
                out.append(">");
            } else if (c == '&') {
                out.append("&");
            } else if (c == ' ') {
                out.append(" ");
            } else if (c == '\n') {
                out.append("<br/>");
            } else {
                out.append(c);
            }
        }
        return out.toString();

    }
}
