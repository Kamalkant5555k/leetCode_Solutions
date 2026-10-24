class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       
        // ALice--
        // int m1=arriveAlice.charAt(0)-'0';
        // m1=m1*10+arriveAlice.charAt(1)-'0';
        // int d1=arriveAlice.charAt(3)-'0';
        //  d1=d1*10+arriveAlice.charAt(4)-'0';

        // int em1=leaveAlice.charAt(0)-'0';
        // em1=em1*10+leaveAlice.charAt(1)-'0';
        // int ed1=leaveAlice.charAt(3)-'0';
        //  ed1=ed1*10+leaveAlice.charAt(4)-'0';
        
        // // bob--
        // int m2=arriveBob.charAt(0)-'0';
        // m2=m2*10+arriveBob.charAt(1)-'0';
        // int d2=arriveBob.charAt(3)-'0';
        //  d2=d2*10+arriveBob.charAt(4)-'0';

        // int em2=leaveBob.charAt(0)-'0';
        // em2=em2*10+leaveBob.charAt(1)-'0';
        // int ed2=leaveBob.charAt(3)-'0';
        //  ed2=ed2*10+leaveBob.charAt(4)-'0';

        //  if(m1==m1 && d2>=ed1){
        //     return  d2-ed1;
        //  }
        //  return 0;

        int[] days = {0, 31, 59, 90, 120, 151,
              181, 212, 243, 273, 304, 334};

        // ALice--
        int s1=days[Integer.parseInt(arriveAlice.substring(0,2))-1]+Integer.parseInt(arriveAlice.substring(3));
        int e1=days[Integer.parseInt(leaveAlice.substring(0,2))-1]+Integer.parseInt(leaveAlice.substring(3));
        // Bob--
        int s2=days[Integer.parseInt(arriveBob.substring(0,2))-1]+Integer.parseInt(arriveBob.substring(3));
        int e2=days[Integer.parseInt(leaveBob.substring(0,2))-1]+Integer.parseInt(leaveBob.substring(3));

        int start = Math.max(s1, s2);
        int end = Math.min(e1, e2);

        return Math.max(0, end - start + 1);

        
        
    }
}