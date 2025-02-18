class impRevString {
    public static boolean f(int i, String s){

        //first aproch
        // StringBuffer st =new StringBuffer(s).reverse();
        // return st.toString().equals(s);

        //second aproch
        char []str=s.toCharArray();
        int j=str.length-1;
        while(i<j){
            if(str[i++] != str[j--]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="112211";
       System.out.println(f(0, s));
    }   
}
