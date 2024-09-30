public class PopulationProjection {
    public static void main(String[] args) {
        double birth = 1.0 / 7;
        double death = 1.0 / 13;
        double immigrants = 1.0 / 45;
        int years = 5 * 365 * 24 * 60 * 60;
        int population = 312032486;
        int current_populaton = (int) (population + years * (birth - death + immigrants));
        System.out.println("The current population after 5 years is" + current_populaton);
    }
}
