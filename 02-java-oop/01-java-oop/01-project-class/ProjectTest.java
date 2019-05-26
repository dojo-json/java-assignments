public class ProjectTest {
  public static void main(String[] args) {
    Project p1 = new Project();

    p1.setName("Project 1");
    p1.setDescription("Project 1 description");
    p1.setInitialCost(89.23);
    System.out.println(p1.elevatorPitch());

    Project p2 = new Project("Project 2");
    p2.setDescription("Project 2 description");
    p2.setInitialCost(34.23);
    System.out.println(p2.elevatorPitch());

    Project p3 = new Project("Project 3", "Project 3 description", 98.65);
    System.out.println(p3.elevatorPitch());

    Portfolio portfolio = new Portfolio();

    portfolio.addProject(p1);
    portfolio.addProject(p2);
    portfolio.addProject(p3);

    portfolio.showPortfolio();
  }
}
