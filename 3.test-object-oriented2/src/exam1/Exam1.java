

package exam1;

public class Exam1 {

    public static void main(String[] args) {
        
        // Car car =  new SuperCar();
        //     car.setName("フェラーリ");
        //     car.run();

        // car = new EcoCar();
        //     car.setName("プリウス");
        //     car.run();

        SuperCar superCar =  new SuperCar();
        EcoCar ecoCar =  new EcoCar();

        superCar.setName("フェラーリ");
        superCar.putOnGas();
        superCar.run();

        ecoCar.setName("プリウス");
        ecoCar.putOnGas();
        ecoCar.run();


    }

}
