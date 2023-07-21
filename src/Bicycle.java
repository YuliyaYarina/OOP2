 class Bicycle extends Transport implements Service {

     public Bicycle(String modelName, int wheelsCount) {
         super(modelName, wheelsCount);
     }
     @Override
     public void check(){
         super.check();
     }
 }
