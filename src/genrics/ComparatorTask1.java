package genrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Jobs {
    int id;
    String jobName;
    int experience;
    double salary;
    String location;

    public Jobs(int id, String jobName, int experience, double salary, String location) {
        this.id = id;
        this.jobName = jobName;
        this.experience = experience;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Id: " + id + "  |  Job name: " + jobName + "  |  Experience: " + experience + "  |  Salary: " + salary + "  |  Location: " + location + "\n";
    }
}

class SalaryComparator implements Comparator<Jobs> {
    @Override
    public int compare(Jobs j1, Jobs j2) {
        return Double.compare(j1.salary, j2.salary);
    }
}

class IdComparator implements Comparator<Jobs> {
    @Override
    public int compare(Jobs j1, Jobs j2) {
        return j1.id - j2.id;
    }
}

class NameComparator implements Comparator<Jobs> {
    @Override
    public int compare(Jobs j1, Jobs j2) {
        return j1.jobName.compareTo(j2.jobName);
    }
}

class ExpComparator implements Comparator<Jobs> {
    @Override
    public int compare(Jobs j1, Jobs j2) {
        return j1.experience - j2.experience;
    }
}

class LocationComparator implements Comparator<Jobs> {
    @Override
    public int compare(Jobs j1, Jobs j2) {
        return j1.location.compareTo(j2.location);
    }
}

public class ComparatorTask1 {
    public static void main(String[] args) {
        ArrayList<Jobs> jobs = new ArrayList<>();
        jobs.add(new Jobs(103, "Java full-stack developer", 2, 30000, "Chennai"));
        jobs.add(new Jobs(108, "Dev-Ops engineer", 10, 70000, "Bangalore"));
        jobs.add(new Jobs(102, "Technical analyst", 5, 40000, "Chennai"));
        jobs.add(new Jobs(101, ".Net full-stack developer", 3, 100000, "Mumbai"));
        jobs.add(new Jobs(100, "Front-end developer", 12, 40000, "Mumbai"));
        jobs.add(new Jobs(105, "Python full-stack developer", 7, 30000, "Delhi"));

        Collections.sort(jobs, new SalaryComparator());
        System.out.println(jobs);
    }
}
