import java.util.*;

public class PersonConsoleApp {
    private final String MENU = "1. Usuń Obiekt\n2. Wyświetl\n3. Zakończ program";

    private final String whichOne = "1. ArrayList\n2. LinkedList\n3. HashSet\n 4. TreeSet\n5. HashMap\n6. TreeMap\n";

    private final List<Person> PersonArrayList = new ArrayList<>();
    private final List<Person> PersonLinkedList = new LinkedList<>();

    private final Set<Person> PersonHashSet = new HashSet<>();
    private final Set<Person> PersonTreeSet = new TreeSet<>(new Tree_SetComparator());

    private final Map<Integer, Person> PersonHashMap = new HashMap();
    private final Map<Integer, Person> PersonTreeMap = new TreeMap<>();

//Wypelnienie kolekcji obiektami
    private void add() {
        Person A = new Person("Julia", "Nowak", 19, "Student");
        PersonArrayList.add(A);
        PersonLinkedList.add(A);
        PersonHashSet.add(A);
        PersonTreeSet.add(A);
        PersonHashMap.put(1, A);
        PersonTreeMap.put(1, A);

        Person B = new Person("Jan", "Kowalski", 44, "Weterynarz");
        PersonArrayList.add(B);
        PersonLinkedList.add(B);
        PersonHashSet.add(B);
        PersonTreeSet.add(B);
        PersonHashMap.put(2, B);
        PersonTreeMap.put(2, B);

        Person C = new Person("Robert", "Jankowski", 30, "Żołnierz");
        PersonArrayList.add(C);
        PersonLinkedList.add(C);
        PersonHashSet.add(C);
        PersonTreeSet.add(C);
        PersonHashMap.put(3, C);
        PersonTreeMap.put(3, C);

        // Do kolekcji HashSet nie mozna przypisac dwa razy takiego samego obiektu, jest pomijany

        Person D = new Person("Emilia", "Nowak", 30, "Lekarz");
        PersonArrayList.add(D);
        PersonLinkedList.add(D);
        PersonHashSet.add(D);
        PersonTreeSet.add(D);
        PersonHashMap.put(4, D);
        PersonTreeMap.put(4, D);
        PersonArrayList.add(D);
        PersonLinkedList.add(D);
        PersonHashSet.add(D);
        PersonTreeSet.add(D);
        PersonHashMap.put(4, D);
        PersonTreeMap.put(4, D);
    }

    //Wyświetlanie kolekcji
    private void display() {
        System.out.println(whichOne);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (var person : PersonArrayList) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge() + " " + person.getJob());

                }
                break;
            case 2:
                for (var person : PersonLinkedList) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge() + " " + person.getJob());

                }
                break;
            case 3:
                for (var person : PersonHashSet) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge() + " " + person.getJob());

                }
                break;
            case 4:
                for (var person : PersonTreeSet) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge() + " " + person.getJob());

                }
                break;
            case 5:
                for (int i = 1; i <= PersonHashMap.size(); i++) {
                    System.out.println(PersonHashMap.get(i).getFirstName() + " " + PersonHashMap.get(i).getLastName() + " " + PersonHashMap.get(i).getAge() + " " + PersonHashMap.get(i).getJob());
                }
                break;
            case 6:
                for (int i = 1; i <= PersonTreeMap.size(); i++) {
                    System.out.println(PersonHashMap.get(i).getFirstName() + " " + PersonHashMap.get(i).getLastName() + " " + PersonHashMap.get(i).getAge() + " " + PersonHashMap.get(i).getJob());
                }
                break;
        }
    }

//Uwuwanie poszczegolnych obiektow z kolekcji
    private void remove()
    {

        Random rand = new Random();
        System.out.println(whichOne);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Ktora pozycje?");
        Scanner scanner1 = new Scanner(System.in);
        int el = scanner1.nextInt();
        int whichOne = 0;

        switch (choice)
        {
            case 1:

                if(PersonArrayList.size() > 0)
                {
                    whichOne = el;
                    PersonArrayList.remove(whichOne);
                }
                else
                    System.out.println("Nie mozna usunac obiektu");

                break;

            case 2:

                if(PersonLinkedList.size() > 0)
                {
                    whichOne = el;
                    PersonLinkedList.remove(whichOne);
                }
                else
                    System.out.println("Nie mozna usunac obiektu");

                break;

            case 3:

                if(PersonHashSet.size() > 0)
                {
                    whichOne = el;

                    Iterator<Person> iterHashSet = PersonHashSet.iterator();

                    for (int i = 0; i < PersonHashSet.size(); )
                    {
                        while (iterHashSet.hasNext())
                        {
                            Person next = iterHashSet.next();

                            if (i == whichOne)
                            {
                                iterHashSet.remove();
                            }
                            i++;
                        }
                    }
                }
                else
                    System.out.println("Nie mozna usunac obiektu");

                break;

            case 4:
                if(PersonTreeSet.size() > 0)
                {
                    whichOne = el;

                    Iterator<Person> iterTreeSet = PersonTreeSet.iterator();

                    for (int i = 0; i < PersonTreeSet.size(); )
                    {
                        while (iterTreeSet.hasNext())
                        {

                            Person next = iterTreeSet.next();

                            if (i == whichOne)
                            {
                                iterTreeSet.remove();
                            }

                            i++;
                        }
                    }
                }
                else
                    System.out.println("Nie mozna usunac obiektu");

                break;

            case 5:

                if(PersonHashMap.size() > 0)
                {
                    whichOne = el;//rand.nextInt(PersonHashMap.size());
                    PersonHashMap.remove(whichOne);
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

            case 6:
                if(PersonTreeMap.size() > 0)
                {
                    whichOne = el;
                    PersonTreeMap.remove(whichOne);
                }
                else
                    System.out.println("Size = 0, couldn't remove object");

                break;

        }
    }




    void MainLoop(){
        add();
        int choice;

        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println(MENU);
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    remove();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }
    private static class Tree_SetComparator implements Comparator<Person>
    {
        @Override
        public int compare(Person p1, Person p2)
        {
            return 0;
        }

    }




}

