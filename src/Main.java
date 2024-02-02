public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Общая масса: " + (firstBoxer + secondBoxer));
        System.out.println("Разница масс: " + (secondBoxer - firstBoxer));
        System.out.println("Разница масс: " + (secondBoxer % firstBoxer));

        var time = 640;
        var timeDay = 8;
        var worker = time / timeDay;
        System.out.println("Всего работников в компании - " + worker + " человек.");
        worker = worker + 94;
        time = timeDay * worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками.");
    }
}