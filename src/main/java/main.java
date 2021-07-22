public class main {
    public static void main(String[] args) {

        Countries America = new Countries("America","American", 100000000);
        Countries Mexico = new Countries("Mexico", "Espanol", 500000);
        Countries Canada = new Countries("Canada", "French",897000);

        System.out.println(America.getLanguage());
        System.out.println(Mexico.getPopulation());
        System.out.println(Canada.getName());
    }
}

