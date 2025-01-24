//remove all special character in string // remove whitespace
class problem02{
    public static void main(String[] args) {
        String str="j#%@a*v@&$a*%s&ta!^r&$";
        String str1=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str1);

        String st=" Rushikesh              Kailas    Narawade";
        String st1=st.replaceAll(" ","");
        System.out.println(st1);

    }

}