public class Badge {

    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode(){
        return "***" + employee.name + employee.surname + "***";
    }

    public void showBadgeDetails(){
        System.out.println("Tracked employees: " + totalNumberOfEmployees + ", " + employee.getEmployeeDetails() + ". Badge Id: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
