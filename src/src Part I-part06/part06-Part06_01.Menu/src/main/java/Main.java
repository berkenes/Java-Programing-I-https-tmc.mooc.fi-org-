
public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();
        System.out.println("********Part 1 und Part 2***************");

        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
        exactum.addMeal("Roasted lamb in a red wine sauce");
        exactum.printMeals();

        System.out.println("*************Part 3******************");

        exactum.clearMenu();
        exactum.printMeals();

        System.out.println("============Nachdem clear================");
        exactum.addMeal("Tomato and mozzarella salad");
        exactum.printMeals();
    }
}
