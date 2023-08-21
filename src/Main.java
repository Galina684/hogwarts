public class Main {
    public static Gryffindor[] gryffindors= {
            new Gryffindor("Гарри Поттер","Гриффиндор",30,50,10,20,50),
            new Gryffindor("Гермиона Грейнджер","Гриффиндор",40,40,30,25,10),
            new Gryffindor("Рон Уизли","Гриффиндор",30,30,20,10,50),
    };

    public static Slytherin[] slytherins = {
            new Slytherin("Драко Малфой","Слизерин",30,45,30,20,50),
            new Slytherin("Грэхэм Монтегю","Слизерин",20,30,25,30,10),
            new Slytherin("Грегори Гойл","Слизерин",25,15,30,20,10),
    };
    public static Ravenclaw[] ravenclaws ={
            new Ravenclaw("Чжоу Чанг","Когтевран",40,20,30,20,35),
            new Ravenclaw("Падма Патил","Когтевран",25,35,15,25,20),
            new Ravenclaw("Маркус Белби","Когтевран",35,40,30,40,50),
    };
    public static Hufflepuff[] hufflepuffs ={
            new Hufflepuff("Захария Смит","Пуффендуй",20,25,30,40,10),
            new Hufflepuff("Седрик Диггори","Пуффендуй",15,25,20,45,35),
            new Hufflepuff("Джастин Финч","Пуффендуй",30,40,20,15,25),
    };


    public static void main(String[] args) {

       
       printGriffindor();
    }

    public static void printGriffindor() {
        for (Hogwarts gryffindor : gryffindors) {
        System.out.println(gryffindor);
    }
    }
}