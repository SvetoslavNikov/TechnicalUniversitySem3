package learning.javaBasics.LU2;

 class User {
    private String username;
    private String email;
    private int age;

    public User() {
    }

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     @Override
     public String toString() {
         return "User{" +
                 "username='" + username + '\'' +
                 ", email='" + email + '\'' +
                 ", age=" + age +
                 '}';
     }
 }
