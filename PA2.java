
package pa2;


public class PA2 {
    //All the universities info
    private String name;
    private int yearOfEstablishment;
    private int numberOfStudents;
    private int numberOfFacultyMembers;
    private int numberOfFaculties;
    private int[] departmentsInFaculties;
    private String[] facilities;
    
    //This is the first constructor which is public
    public PA2() {
        this.name = "";
        this.yearOfEstablishment = 0;
        this.numberOfStudents = 0;
        this.numberOfFacultyMembers = 0;
        this.numberOfFaculties = 0;
        this.departmentsInFaculties = new int[0];
        this.facilities = new String[0];
    }
    
    //Second constructor with all the important information of the university
    public PA2(String name, int yearOfEstablishment, int numberOfStudents, int numberOfFacultyMembers, int numberOfFaculties, int[] departmentsInFaculties, String[] facilities) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.numberOfStudents = numberOfStudents;
        this.numberOfFacultyMembers = numberOfFacultyMembers;
        this.numberOfFaculties = numberOfFaculties;
        this.departmentsInFaculties = departmentsInFaculties;
        this.facilities = facilities;
    }
    
    //These are the setters and getters
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getYearOfEstablishment(){
        return yearOfEstablishment;
    }
    
    public void setYearOfEstablishment(int yearOfEstablishment){
        this.yearOfEstablishment = yearOfEstablishment;
    }
    
        public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    
        public int getNumberOfFacultyMembers() {
        return numberOfFacultyMembers;
    }

    public void setNumberOfFacultyMembers(int numberOfFacultyMembers) {
        this.numberOfFacultyMembers = numberOfFacultyMembers;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public int[] getDepartmentsInFaculties() {
        return departmentsInFaculties;
    }

    public void setDepartmentsInFaculties(int[] departmentsInFaculties) {
        this.departmentsInFaculties = departmentsInFaculties;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }
    
    public static void main(String[] args) {
        
    }
    
}
