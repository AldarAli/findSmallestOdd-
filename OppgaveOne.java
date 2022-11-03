public class OppgaveOne
{
    public int smallestOdd(int x)
    {
        int svar= 0;
        if (x % 2 == 0)
        {
            svar = x+1;
        } else
        {
            svar = x+2;
        }
        System.out.println(svar);
        return svar;
        
    }

    public static void main(String[] args) {
        OppgaveOne myObj = new OppgaveOne();
        myObj.smallestOdd(4);
    }


    


}