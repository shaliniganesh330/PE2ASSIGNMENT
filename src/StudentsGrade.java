
public class StudentsGrade {
    public  int MaxValue(int num,int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public  int MinValue(int num,int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
     public double getavgvalue(double num,double[] numbers) {
         double sum = 0;
         if (num != 0) {
             for (int i = 0; i < num; i++) {
                 sum = sum + numbers[i];
             }

         }
         return (sum / num);
     }
}