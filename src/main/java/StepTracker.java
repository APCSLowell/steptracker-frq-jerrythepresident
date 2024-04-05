import java.util.ArrayList;
public class StepTracker
{
  private int steps, require, day;
  private int count=0;
 public StepTracker (int step){
   require=step;
 }
 public int activeDays(){
  return count;
 }
 public void addDailySteps(int a){
  if(a>=require){
   count++;
  }
  steps+=a;
   day++;
 }
 public double averageSteps(){
  return steps/(double) day;
 }
} 
