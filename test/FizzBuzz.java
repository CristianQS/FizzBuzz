public class FizzBuzz {

    public static String get(int position) {
        return getModule(position);
    }

    private static String getModule(int position){
        if (isMultplyOf3(position) && !isMultplyOf15(position)){return "Fizz";}
        if (isMultplyOf5(position) && !isMultplyOf15(position)){return "Buzz";}
        if (isMultplyOf15(position)){return "FizzBuzz";}
        return String.valueOf(position);
    }

    private static boolean isMultplyOf3(int position){
        return position %3 == 0 ? true : false;
    }
    private static boolean isMultplyOf5(int position){
        return position %5 == 0 ? true : false;
    }
    private static boolean isMultplyOf15(int position){
        return position %15 == 0 ? true : false;
    }
}
