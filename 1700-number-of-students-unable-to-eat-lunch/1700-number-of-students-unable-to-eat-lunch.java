class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleStudent = 0;
        int squareStudent = 0;
        for(int x: students)
        {
            if(x == 0)
                circleStudent++;
            else
                squareStudent++;
        }
        
        for(int s: sandwiches){
            // No student wants the square sandwich on top of the stac
            if(s == 0 && circleStudent == 0)
                return squareStudent;
            // No student wants the square sandwich on top of the stac
            else if(s == 1 && squareStudent == 0)
                return circleStudent;
            else if(s == 0 && circleStudent > 0)
                circleStudent--;
            else if(s == 1 && squareStudent > 0)
                squareStudent--;
        }
        return 0;
    }
}