package homework8;

public class main {
    public static void main(String[] args) {
        //1 დავალება
        DivisionCalculator div= new DivisionCalculator();
        System.out.println(div.safeDivide(10, 2));
        System.out.println(div.safeDivide(5, 0));


        //2 დავალება
        System.out.println();
        ArrayReader arr = new ArrayReader();
        int[] myArray={5, 6, 7};
        int index=4;
        System.out.println(arr.readSafe(myArray, index));


        //3 დავალება
        System.out.println();
        StringToNumber str = new StringToNumber();
        System.out.println(str.parseSafe("42"));
        System.out.println(str.parseSafe("abc"));
        System.out.println(str.parseSafe(""));


        //4 დავალება
        System.out.println();
        NullCheck nl = new NullCheck();
        System.out.println(nl.safeLength("Hello"));
        System.out.println(nl.safeLength(null));


        //5 დავალება
        System.out.println();
        MultiCatchDemo mcd = new MultiCatchDemo();
        mcd.processInput("2");
        mcd.processInput("abc");
        mcd.processInput("0");
        mcd.processInput("1");


        //6 დავალება
        System.out.println();
        FinallyDemo fnDemo= new FinallyDemo();
        System.out.println(fnDemo.readNumber("100"));
        System.out.println(fnDemo.readNumber("xyz"));



        //7 დავალება
        System.out.println();
        AgeValidator userAge=new AgeValidator();
        int[] ages={25, -5, 200};

        for(int age : ages){
            try{
                System.out.print("ასაკი: "+age+" ");
                userAge.validate(age);

            }catch (InvalidAgeException e){
                System.out.println("შეცდომა: "+ e.getMessage());
            }
        }



        //8 დავალება
        System.out.println();
        InputValidator inpStr=new InputValidator();
        String[] strAgeValidator={"abc", "2", "-5"};

        for(String inp : strAgeValidator){
            try{
                int months = inpStr.processAge(inp);
                System.out.println("შედეგი თვეებში: " + months);
            }catch (NumberFormatException e){
                System.out.println("შეცდომა: შეყვანილი ტექსტი არ არის რიცხვი "+inp);
            }catch (IllegalArgumentException e){
                System.out.println("შეცდომა: "+e.getMessage()+" "+inp);
            }
        }
    }
}
