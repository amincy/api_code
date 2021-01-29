public class Students extends Course{
    private String university="University of Abuja";
    private String matricNumber;
    private String departmant;
    private String faculty;
    private String course;
    private int level;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String stateOfOrigin;


    public String getUniversity(){
        return university;
    }
    public String getMatricNumber(){
        return matricNumber;
    }
    public void setMatricNumber(String matricNumber){
        this.matricNumber = matricNumber;
    }
    public String getDepartmant(){
        return departmant;
    }
    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getStateOfOrigin(){
        return stateOfOrigin;
    }
    public void setStateOfOrigin(String stateOfOrigin){
        this.stateOfOrigin = stateOfOrigin;
    }


}