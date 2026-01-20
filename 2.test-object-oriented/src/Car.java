public class Car {

    int speed;

    void run() {
        
        if (speed >= 120) {
            System.out.println("スピードの出しすぎです");
        } else {
            speed += 50;
            System.out.println("走りました。スピードが" + speed + "km/hになりました。");
        }
    }
}
