package Exercise;

public class UniqueChar {

    public static String unique(String str){
        boolean isUnique = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() ; j++) {
                if(Character.toString(str.charAt(i)).equalsIgnoreCase(Character.toString(str.charAt(j)))){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return "" + str.charAt(i);
            }
            isUnique = true;
        }
        return "";
    }


    public static void main(String[] args) {
        UniqueChar.unique("ooe");
        System.out.println(UniqueChar.unique("ooe"));
    }
}
