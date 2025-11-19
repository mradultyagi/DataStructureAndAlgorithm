import java.util.Arrays;

public class JobScheduling {
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        Job[] jobs = {
                new Job(1, 2, 100),
                new Job(2, 1, 19),
                new Job(3, 2, 27),
                new Job(4, 1, 25),
                new Job(5, 3, 15)
        };
        jobschedule(jobs);


    }
    static void jobschedule(Job[] jobs){
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxDeadline = 0;
        for(Job job:jobs){
            maxDeadline=Math.max(maxDeadline,job.deadline);
        }
        int [] slot = new int [maxDeadline+1];
        Arrays.fill(slot,-1);
        int totalProfit = 0;
        int jobCount = 0;
        for(Job job:jobs){
            for(int d = job.deadline;d>0;d--){
                if(slot[d]==-1){
                    slot[d]=job.id;
                    totalProfit +=job.profit;
                    jobCount++;
                    break;
                }
            }
        }
        System.out.println("Jobs done: " + jobCount);
        System.out.println("Total Profit: " + totalProfit);
        System.out.println("Job Order: " + Arrays.toString(slot));
    }

}
