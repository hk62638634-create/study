public class DivideTest{
    public static void main(String[] arg){
        try{
            int result = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("the try-cathch clasuse was executed");
        }
    }
}