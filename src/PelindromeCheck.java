public class PelindromeCheck {

    public int reverse(int num)
    {
        int sum=0;
        for(;num>0;num/=10)
        {
            int d=num%10;
            sum=sum*10+d;
        }
        return sum;
    }

    public boolean pelindrome(int num)
    {
        int rev=reverse(num);
        if(num == rev)
            return true;
        else
            return false;
    }
}
