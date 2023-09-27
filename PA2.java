public class PA2 {
    // All the university info
    private String name;
    private int yearOfEstablishment;
    private int numberOfStudents;
    private int numberOfFacultyMembers;
    private int numberOfFaculties;
    private int[] departmentsInFaculties;
    private String[] facilities;

    // This is the first constructor which is public
    public PA2() {
        this.name = "";
        this.yearOfEstablishment = 0;
        this.numberOfStudents = 0;
        this.numberOfFacultyMembers = 0;
        this.numberOfFaculties = 0;
        this.departmentsInFaculties = new int[0];
        this.facilities = new String[0];
    }

    // Second constructor with all the important information of the university
    public PA2(String name, int yearOfEstablishment, int numberOfStudents, int numberOfFacultyMembers,
            int numberOfFaculties, int[] departmentsInFaculties, String[] facilities) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.numberOfStudents = numberOfStudents;
        this.numberOfFacultyMembers = numberOfFacultyMembers;
        this.numberOfFaculties = numberOfFaculties;
        this.departmentsInFaculties = departmentsInFaculties;
        this.facilities = facilities;
    }

    // These are the setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
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
        //Here I created a instance of the PA2 class which uses the second constructor
        int[] departmentsInFaculties = { 11, 12, 6, 10, 8 };
        String[] facilities = { "Charles E. Perry Bldg", "College of Business Complex", "Steven and Dorothea Green Library" };

        PA2 myPa2 = new PA2("Florida International University", 1972, 56732, 2368, 1401, departmentsInFaculties, facilities);

        // This gets and displays the information using getters
        System.out.println("University Name: " + myPa2.getName());
        System.out.println("Year of Establishment: " + myPa2.getYearOfEstablishment());
        System.out.println("Number of Students: " + myPa2.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + myPa2.getNumberOfFacultyMembers());
        System.out.println("Number of Faculties: " + myPa2.getNumberOfFaculties());

        int[] departments = myPa2.getDepartmentsInFaculties();
        System.out.print("Number of Departments in Faculties: ");
        for (int i = 0; i < departments.length; i++) {
            System.out.print(departments[i]);
            if (i < departments.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] facilitiesList = myPa2.getFacilities();
        System.out.print("Facilities: ");
        for (int i = 0; i < facilitiesList.length; i++) {
            System.out.print(facilitiesList[i]);
            if (i < facilitiesList.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
