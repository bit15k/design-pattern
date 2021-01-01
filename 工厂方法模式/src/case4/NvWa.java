package case4;



/**
 * <pre></pre>
 *
 * @author QuinnTian
 * @since
 */
public class NvWa {
    public static void main(String args[]){
        /*模拟女娲造人*/
        System.out.println("第一次造出的人是黑人");
        Human blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();;
        blackHuman.talk();

        System.out.println("第二次造出的人是白人");
        Human whiteHuma = new WhiteHumanFactory().createHuman();
        whiteHuma.getColor();
        whiteHuma.talk();

        System.out.println("第三次造出的人是黄人");
        Human yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
