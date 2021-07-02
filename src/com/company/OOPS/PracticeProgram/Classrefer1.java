package com.company.OOPS.PracticeProgram;

class Classrefer1
{
    public static void main(String[ ] args)
    {
        Classrefer1 obj = new Classrefer1( );
        obj.start( );
    }
    void start( )
    {
        long [ ] P= {3, 4, 5};
        long [ ] Q= method (P);
        System.out.print(P[0] + P[1] + P[2]+ ":");
        System.out.print(Q[0] + Q[1] + Q[2]);
        // System.out.print(
    }
    long [ ] method (long [ ] R)
    {
        R [1]=7;
        return R;
    }
}