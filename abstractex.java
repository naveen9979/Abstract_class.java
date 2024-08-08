 class cat {
    public void beautiful() {
        System.out.println("cat is beautiful");
    }

    public void makesound () {
        System.out.println("cat sound is meow.");
    }
}


     class girl extends cat {
      public void walk() {
      System.out.println("girl is walking.");
      }
     }


     public class abstractex {
     public static void main(String[]args){
     girl g1 = new girl();
     g1.beautiful();
     g1.makesound();
     g1.walk();
     }
     }


    