
 public class Person {
        int age;
    
        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age must be greater than zero");
            } else {
                this.age = age;
            }
        }
    
        public static void main(String[] args) {
            Person person = new Person();
            person.setAge(-1);
        }
}

