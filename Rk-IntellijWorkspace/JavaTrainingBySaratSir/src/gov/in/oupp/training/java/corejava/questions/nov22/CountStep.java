package gov.in.oupp.training.java.corejava.questions.nov22;

public class CountStep {
    public static int findStep(int n)
    {
        int a=1;
        int b=2;
        int res;
        if(n<=2)
            return n;
        else
        {
            for(int i=2;i<n;i++)
            {
                res=a+b;
                a=b;
                b=res;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println("No of step : "+findStep(n));

    }
}
