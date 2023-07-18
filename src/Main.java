public class Main {

        public static void main(String[] args) {
            Car car = new Car("n1", 66);
            Car car2 = new Car("n2", 65);
            car.modelName = "car1";
            car2.modelName = "car2";
            car.wheelsCount = 4;
            car2.wheelsCount = 4;

            Truck truck = new Truck("m1", 88);
            Truck truck2 = new Truck("m2",89);
            truck.modelName = "truck1";
            truck2.modelName = "truck2";
            truck.wheelsCount = 6;
            truck2.wheelsCount = 8;

            Bicycle bicycle = new Bicycle("b1", 40);
            Bicycle bicycle2 = new Bicycle("b2", 41);
            bicycle.modelName = "bicycle1";
            bicycle2.modelName = "bicycle2";
            bicycle.wheelsCount = 2;
            bicycle2.wheelsCount = 2;

            ServiceStation station = new ServiceStation();
            station.check(car, null, null);
            station.check(car2, null, null);
            station.check(null, bicycle, null);
            station.check(null, bicycle2, null);
            station.check(null, null, truck);
            station.check(null, null, truck2);
        }

}