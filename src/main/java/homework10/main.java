package homework10;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws Exception {
        //1 დავალება - LambdaBasics
        Runnable r=() -> System.out.println("hello Lambda");
        r.run();

        System.out.println();
        Predicate<Integer> isEven = n->n%2==0;
        System.out.println("is number even? - "+isEven.test(5));
        System.out.println("is number even? - "+isEven.test(6));


        System.out.println();
        Comparator<String> byLength = (a, b) -> a.length()-b.length();
        System.out.println(byLength.compare("hello", "hello"));
        System.out.println(byLength.compare("hellooo", "123hi"));


        //2 დავალება - FilterStream
        System.out.println();
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String result = nums.stream().filter(n->n%2==0).map(n->String.valueOf(n)).collect(Collectors.joining(", "));
        System.out.println(result);



        //3 დავალება - MapStream
        System.out.println();
        List<String> names = List.of("Anna", "ika", "Cita");

        String upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        String lengthName = names.stream().map(String::length).map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("["+upperCaseNames+"] "+ "["+lengthName+"]");



        //4 დავალება - ReduceSum
        System.out.println();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum=numbers.stream().reduce(0, Integer::sum);
        int Product=numbers.stream().reduce(1, (a, b)-> a*b);
        int maxNumber= numbers.stream().reduce(0, Integer::max);
        System.out.println("Sum: "+ sum + " Product: "+Product+" Max: "+maxNumber);



        //5 დავალება - GroupByLength
        System.out.println();
        List<String> words = List.of("a", "bb", "cc", "ddd", "ee", "fff");
        Map<Integer, List<String>> groupedWords = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedWords);



        //6 დავალება - MethodRef
        System.out.println();
        names.forEach(System.out::println);

        List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);

        List<String> stringNumbers= List.of("1", "2", "3", "4", "5");
        List<Integer> intNumbers = stringNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(intNumbers);



        //7 დავალება - AuthorAnnotation
        System.out.println();
        Class<AnnotationDemo> authorName=AnnotationDemo.class;

        Method method1 = authorName.getMethod("printName");
        AuthorAnnotation auth1= method1.getAnnotation(AuthorAnnotation.class);
        System.out.println("მეთოდი: " + method1.getName() + " -> ავტორი: " + auth1.name());


        Method method2 = authorName.getMethod("printStatus");
        AuthorAnnotation auth2= method2.getAnnotation(AuthorAnnotation.class);
        System.out.println("მეთოდი: " + method2.getName() + " -> ავტორი: " + auth2.name());
    }
}
