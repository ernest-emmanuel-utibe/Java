package ErnestProject;

public class Grade {
    public static void main(String[] args) {
        int studentGrade = 100;

        if (studentGrade >= 90) {
            System.out.println("A");
        }
         else {
             if (studentGrade >= 80) {
                System.out.println("B");
            }
            else {
                if (studentGrade >= 70) {
                    System.out.println("C");
                }
                else{
                    if (studentGrade >= 60) {
                        System.out.println("D");
                    }
                    else {
                        System.out.println("F");
                        System.out.println("You must take the course again");
                    }
                }
            }
        }
    }
}
