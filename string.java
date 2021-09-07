public class string {
    public static void main(String[] args) {
        String name = "Sayon Islam";
        String city = "kolkata";
        System.out.println(name + " from " + city);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name + "from\t" + city);
        System.out.println(name + "from\'" + city);
        System.out.println(name + "from\"" + city);
        System.out.println(name + "from\n" + city);
        System.out.println(name.contains("yon")); // it returns boolean, the given string is availavle or not in the variable
        System.out.println(name.charAt(2)); // it returns the character at the given indexing in the variable
        System.out.println(name.endsWith("am")); // it returns boolean, the given string is ends with the given value or not.
        System.out.println(name.indexOf("ay")); //it returns the index number from where the given value started i the variable
    }
}
