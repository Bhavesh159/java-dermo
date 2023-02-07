class EqualIgnoreCase{
    public static void main (String[] args){
    String s1 = "rama";
    String s2 = "RAMA";

    if (s1.equalsIgnoreCase(s2)){
        System.out.println("Both string are equal");

    }
    else {
        System.out.println("Both strings are not equal");
    }
    }
}