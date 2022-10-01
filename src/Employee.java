public class Employee {
    public static void main(String[] args) {
        Employee worker = new Employee("Зубенко Михаил Петрович", "Злодій в законі",
                "thiefinlaw@gmail.com", "+380996018707", 25);
    }

    private String fullName;
    private String workPosition;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String fullName, String workPosition, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.workPosition = workPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}