import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing{
    static class Job{ //creating object
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){ //passing parameter to constructor
            id=i;
            deadline=d;
            profit=p;
        }
    }

    public static void main(String args[]){
        int jobsInfo[][]={{4,10},{1,10},{1,40},{1,30}};
        // Job jobs[]=new Job[jobsInfo.length];
        ArrayList<Job> jobs=new ArrayList<>(); //arraylist of jobs

        for(int i=0; i<jobsInfo.length; i++){
            // jobs[i]=new Job(i, jobsInfo[i][0], jobsInfo[i][1]);
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //if we want to compare two objects based on profit Using LAMBDA FUNCTION
        Collections.sort(jobs, (obj1,obj2)->obj2.profit-obj1.profit); //descending order //custom comparator

        ArrayList<Integer> seq=new ArrayList<>();

        int time=0;
        for(int i=0; i<jobs.size(); i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        //print seq
        System.out.println("max jobs= "+seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}