//remove all special character in string // remove whitespace
class problem02{
    public static void main(String[] args) {
        //special character
        String str="j#%@a*v@&$a*%s&ta!^r&$";
        String str1=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str1);
        //whitespace
        String st="          Rushikesh_              Kailas_    Narawade";
        String st1=st.replaceAll(" ","");
        System.out.println(st1);

    }

}