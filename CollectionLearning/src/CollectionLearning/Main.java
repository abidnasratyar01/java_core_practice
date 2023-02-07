package CollectionLearning;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Ahmad");
        names.add("Iceberg");
        names.add("Nasratyar");
        names.add("Free");
        names.add("Man");

        for (String str:names) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("------------------------------------");
        Iterator<String> itr = names.iterator();

        while(itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("------------------------------------");
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);
        }

        System.out.println("------------------------------------");
        names.forEach(e-> {
            System.out.println(e);
        });

        System.out.println("------------------------------------");
        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("Java", 01);
        courses.put("PHP", 02);
        courses.put("HTML", 03);

        System.out.println(courses);
        courses.forEach((key, value) -> {
            System.out.println(key + "=>" + value);
        });

        System.out.println("------------------------------------");
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Let's");
        vector.add("learn");
        vector.add("java");
        vector.add("from");
        vector.add("GFG");

        // printing the elements of the vector
        System.out.println(
                "The elements of the Vector is : " + vector);

        // getting the Enumeration object over Vector
        // the specified collection.
        Enumeration enumeration
                = Collections.enumeration(vector);

        // Now printing each enumeration constant
        // by enumerating through the Vector.
        System.out.println(
                "printing each enumeration constant by enumerating through the Vector:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("---------------Comparable---------------------");
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        System.out.println("---------------Comparator---------------------");
        ArrayList<Mov> lista = new ArrayList<Mov>();
        lista.add(new Mov("Force Awakens", 8.3, 2015));
        lista.add(new Mov("Star Wars", 8.7, 1977));
        lista.add(new Mov("Empire Strikes Back", 8.8, 1980));
        lista.add(new Mov("Return of the Jedi", 8.4, 1983));

        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(lista, ratingCompare);
        for (Mov mov: lista)
            System.out.println(mov.getRating() + " " +
                    mov.getName() + " " +
                    mov.getYear());


        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(lista, nameCompare);
        for (Mov mov: lista)
            System.out.println(mov.getName() + " " +
                    mov.getRating() + " " +
                    mov.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(lista);
        for (Mov mov: lista)
            System.out.println(mov.getYear() + " " +
                    mov.getRating() + " " +
                    mov.getName()+" ");
    }
}