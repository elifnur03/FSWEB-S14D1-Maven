package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts managing HR tasks");
    }

    public void addEmployee(JuniorDeveloper jd) { addToArray(juniorDevelopers, jd); }
    public void addEmployee(MidDeveloper md) { addToArray(midDevelopers, md); }
    public void addEmployee(SeniorDeveloper sd) { addToArray(seniorDevelopers, sd); }

    private <T> void addToArray(T[] arr, T employee) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) { arr[i] = employee; return; }
        }
        System.out.println("No space to add employee");
    }
}