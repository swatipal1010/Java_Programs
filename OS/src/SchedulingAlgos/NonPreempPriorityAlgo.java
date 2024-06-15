package SchedulingAlgos;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Process {
    private int id;
    private int arrivalTime;
    private int burstTime;
    private int priority;
    private int completionTime;

    public Process(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }
}



public class NonPreempPriorityAlgo {

	public static void main(String[] args) {
		List<Process> processes = new ArrayList<>();
        // Add processes to the list
        processes.add(new Process(1, 0, 4, 2));
        processes.add(new Process(2, 1, 3, 1));
        processes.add(new Process(3, 2, 1, 3));
        
        // Sort processes by priority (and by arrival time if priorities are equal)
        processes.sort(Comparator.comparingInt(Process::getPriority)
                                .thenComparingInt(Process::getArrivalTime));
        
        int currentTime = 0;
        
        for (Process process : processes) {
            if (currentTime < process.getArrivalTime()) {
                currentTime = process.getArrivalTime();
            }
            
            currentTime += process.getBurstTime();
            process.setCompletionTime(currentTime);
        }
        
        // Print process completion times
        for (Process process : processes) {
            System.out.println("Process " + process.getId() + 
                               " completed at time " + process.getCompletionTime());
        }

	}

}
