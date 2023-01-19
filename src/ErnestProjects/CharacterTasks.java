package ErnestProjects;

public class CharacterTasks {
    public static void main(String[] args) {

        char[][] elements = {{'x', 'o', 'x'}, {'x', 'o', 'x'}, {'x', 'x', 'o'}};

        for (char[] element : elements){
            for (char obey : element) {
                System.out.printf("%s ", obey);
            }
            System.out.println();
        }

    }
}
