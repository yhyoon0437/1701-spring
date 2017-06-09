package begin;

public class Greeter {
   private String format;

   public String greet(String guest) {
      return String.format(format, guest);
      //return String.format("%s, 안녕하세요.", "Spring");
   }

   public void setFormat(String format) {
      this.format = format;
   }
   
   public static void main(String[] args) {
      Greeter g = new Greeter();
      g.setFormat("%s, 안녕하세요.");
      String temp = g.greet("Spring");
      
      System.out.println(temp);
      //System.out.println(String.format("%s %d aaaaa", "bbbb",200));
   }

}