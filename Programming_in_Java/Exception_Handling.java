public class Exception_Handling{
    public static void main(String[] args){
        try
        {
            int i=10,j=0,k;
            k=i/j;
            int a[]={1,2,3,4};
            a[5]=10;
            
            System.out.println(k);
        }


        catch(ArithmeticException e){
            System.out.println("Cant Divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array of Limited Size");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End of Code");
        }
    }
}