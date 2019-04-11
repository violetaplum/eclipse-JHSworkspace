package tryCatch;

public class TryCatchMain2 {
    public static void main(String[] args)
    {
        try{
            int[] aa = {10,20,30};
            aa[3] = 500;    //이같은 경우가 Editor에서  Error처리가 안되고 있는 경우다.
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index Out of Range...");
        }
        catch(Exception e)
        {
            System.out.println("Error Occured"); //상위의 aa[]내부 에러를 잡아준다
        }


    }
}
