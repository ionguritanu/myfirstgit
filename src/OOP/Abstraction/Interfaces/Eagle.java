package OOP.Abstraction.Interfaces;


    public class Eagle implements CanFly{


        String color ;

        public void fly(){
            System.out.println("Eagle ins flying");
        }

        @Override
        public void info(){
            System.out.println("Eagel is : " + color);
        }

    }


