public class SampleSwitch {

    public static void main(String[] args) {
        for (int i = 0; i <=6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is :"+i);
                  break;
                case 1:
                    System.out.println("i is :"+i);           //duplicate branch of switch
                    break;
                case 2:
                    System.out.println("i is :"+i);
                    break;
                case 3:
                    System.out.println("i is :"+i);
                    break;
                case 4:
                    System.out.println("i is :"+i);
                    break;
                case 5:
                    System.out.println("i is :"+i);
                    break;
                case 6:
                    System.out.println("i is :"+i);
                    break;

            }

        }

    }
}
