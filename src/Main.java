public class Main {


    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", "Гриффиндор", 30, 50, 10, 20, 50);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 40, 40, 30, 25, 10);
        Gryffindor ron = new Gryffindor("Рон Уизли", "Гриффиндор", 30, 30, 20, 10, 50);


        Slytherin drako = new Slytherin("Драко Малфой", "Слизерин", 30, 45, 30, 20, 50);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", "Слизерин", 20, 30, 25, 30, 10);
        Slytherin gregory = new Slytherin("Грегори Гойл", "Слизерин", 25, 15, 30, 20, 10);


        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", "Когтевран", 40, 20, 30, 20, 35);
        Ravenclaw padma = new Ravenclaw("Падма Патил", "Когтевран", 25, 35, 15, 25, 20);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", "Когтевран", 35, 40, 30, 40, 50);


        Hufflepuff zaharia = new Hufflepuff("Захария Смит", "Пуффендуй", 20, 25, 30, 40, 10);
        Hufflepuff sedric = new Hufflepuff("Седрик Диггори", "Пуффендуй", 15, 25, 20, 45, 35);
        Hufflepuff justin = new Hufflepuff("Джастин Финч", "Пуффендуй", 30, 40, 20, 15, 25);


        ron.compare(germiona);
        graham.compare(germiona);
        justin.compare(drako);

    }


}